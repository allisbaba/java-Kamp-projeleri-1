package TaskBes;

import TaskBes.business.abstracts.MemberService;
import TaskBes.business.concretes.MemberManager;
import TaskBes.core.concretes.EmailValidatorManager;
import TaskBes.core.concretes.InputValid;
import TaskBes.core.concretes.JGoogleMemberValidAdaptor;
import TaskBes.dataAccess.concretes.MemberDao;
import TaskBes.entities.concretes.Member;

public class Main {
    public static void main(String[]args){
        Member member1= new Member("Furkan","Alliş","furkan@gmail.com","123456");

        Member member2= new Member("Bestami","Alliş","bestami@gmail.com","098765");

        MemberService memberService1 = new MemberManager(new InputValid(),new MemberDao(),new EmailValidatorManager());
        memberService1.register(member1);

        MemberService memberService2 = new MemberManager(new InputValid(),new MemberDao(),new EmailValidatorManager());
        memberService2.register(member2);
        memberService2.logIn("bestami@gmail.com","098765");
        JGoogleMemberValidAdaptor jGoogleMemberValidAdaptor = new JGoogleMemberValidAdaptor();
        jGoogleMemberValidAdaptor.isValid(member1);
    }
}
