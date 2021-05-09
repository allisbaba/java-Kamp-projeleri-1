package TaskBes.dataAccess.concretes;

import TaskBes.dataAccess.abstracts.MemberDaoService;
import TaskBes.entities.concretes.Member;

import java.util.ArrayList;

public class MemberDao implements MemberDaoService {
    ArrayList<Member>members = new ArrayList<>();

    @Override
    public void add(Member member) {
        System.out.println(member.getName() + "kişisi eklendi");
    }

    @Override
    public boolean checkEmail(Member member) {
        for(Member m: members){
            if(m.geteMailAddress().equals(member.geteMailAddress())){
                System.out.println("Email adresi kullanılmış!");
            }
            else {
                System.out.println("Email adresi başarıyla oluşturuldu");
            }
        }

        return false;
    }

    @Override
    public boolean logInCheck(String emailAddress, String password) {
        for(Member member : members){
            if (member.geteMailAddress().equals(emailAddress)&& member.getPassword().equals(password)){
               System.out.println("Email adresi ve parola doğru.");
            }
            else{
                System.out.println("Email adresi ve parola yanlış!");
            }
        }

        return false;
    }
}
