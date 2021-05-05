package KampGün3;

public class TStudentManager extends TUserManager {
    public void add(TStudent tStudent){
        System.out.println("Dersiniz :" + tStudent.getLesson());
        System.out.println("Eğitim Durmunuz :"+tStudent.getEducationStatue());

    }
}
