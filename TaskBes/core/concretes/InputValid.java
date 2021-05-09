package TaskBes.core.concretes;

import TaskBes.core.abstracts.InputValidService;
import TaskBes.entities.concretes.Member;

import java.util.regex.Pattern;

public class InputValid implements InputValidService {

    public boolean isValidEmail(String emailAddress) {
        String emailAddressRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailAddressRegex);
        if (emailAddress == null)
            return false;
        return pat.matcher(emailAddress).matches();
    }

    public boolean isValidPassword(String password){
        if(password==null || password.length()<6){
            return false;
        }
        return  true;
    }
    public boolean isValidName(String name){
        if (name== null || name.length()<2){
            return false;
        }
        for(char c: name.toCharArray()){
            if(Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean isValid(Member member) {
        if(!isValidEmail(member.geteMailAddress())){
            System.out.println("Emailiniz yanlış. Tekrar deneyiniz.");
            return false;
        }

        if(!isValidName(member.getName())){
            System.out.println("İsim kurallarına uyulmamış yeni bir isim belirleyiniz");
            return false;
        }
        if(!isValidPassword(member.getPassword())){
            System.out.println("Parola kurallarına uyulmamış yeni bir parola belirleyin");
            return false;
        }return true;
    }
}
