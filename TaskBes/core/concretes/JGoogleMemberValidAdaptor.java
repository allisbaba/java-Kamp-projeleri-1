package TaskBes.core.concretes;

import TaskBes.core.abstracts.InputValidService;
import TaskBes.entities.concretes.Member;

public class JGoogleMemberValidAdaptor implements InputValidService {

    @Override
    public boolean isValid(Member member) {

      System.out.println("Google ile giriş yapıldı.");
        return false;
    }
}
