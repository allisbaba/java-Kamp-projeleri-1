package KampGün3;

public class TInstructorManager extends TUserManager {
    public void add (TInstructor tInstructor){
        System.out.println("Yaşınız : "+ tInstructor.getAge());
        System.out.println("Verdiğiniz Dersler : "+tInstructor.getEducateLesson());

    }


}
