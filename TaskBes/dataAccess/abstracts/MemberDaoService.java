package TaskBes.dataAccess.abstracts;

import TaskBes.entities.concretes.Member;

public interface MemberDaoService {
    void add(Member member);
    boolean checkEmail(Member member);
    boolean logInCheck(String emailAddress, String password);
}
