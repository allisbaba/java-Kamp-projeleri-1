package TaskBes.business.concretes;

import TaskBes.business.abstracts.MemberService;
import TaskBes.core.abstracts.InputValidService;
import TaskBes.core.abstracts.ValidatorService;
import TaskBes.dataAccess.abstracts.MemberDaoService;
import TaskBes.entities.concretes.Member;

public class MemberManager implements MemberService {
   private InputValidService memberInputValidService;
   private MemberDaoService memberDaoService;
   private ValidatorService validatorService;

   public MemberManager(InputValidService memberInputValidService,MemberDaoService memberDaoService,ValidatorService validatorService){
       this.memberInputValidService = memberInputValidService;
       this.memberDaoService = memberDaoService;
       this.validatorService = validatorService;
   }



    @Override
    public void register(Member member) {
       if(!memberInputValidService.isValid(member)){
           System.out.println("Bilgileriniz kurallara uygun değil tekrar deneyiniz");
       }
       else if(!memberDaoService.checkEmail(member)){
           System.out.println("Bu mail adresi alınmış yeni bir  tane oluşturunuz");
       }
       else {
           memberDaoService.add(member);
           validatorService.ValidatorMessage();
       }


    }

    @Override
    public void logIn(String emailAddress, String password) {
       if(memberDaoService.logInCheck(emailAddress,password)){
           System.out.println("Giriş başarılı");
       }
       else{
           System.out.println("Giriş başarısız");
       }

    }
}
