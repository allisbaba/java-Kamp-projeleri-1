package TaskBes.business.abstracts;

import TaskBes.entities.concretes.Member;

public interface MemberService {
    void register(Member member);
    void logIn(String emailAddress, String password);
}
