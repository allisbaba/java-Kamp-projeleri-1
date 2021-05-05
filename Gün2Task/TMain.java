package KampGün3;

public class TMain {
    public static void main(String [] args){
        TStudent tStudent = new TStudent();
        tStudent.setId(2);
        tStudent.setName("Furkan");
        tStudent.setEmail("furkanasldsl@gmail.com");
        tStudent.setLesson("Java + React");
        tStudent.setEducationStatue("Üniversite Dönem 2");


        TInstructor tInstructor = new TInstructor();
        tInstructor.setId(1);
        tInstructor.setName("Engin");
        tInstructor.setEmail("enginhoca@engin.com");
        tInstructor.setAge(37);
        tInstructor.setEducateLesson("Java, React, C#");


        TUserManager age = new TInstructorManager();
        age.add(tInstructor);

        TStudentManager tStudentManager = new TStudentManager();
        tStudentManager.add(tStudent);

        TInstructorManager tInstructorManager = new TInstructorManager();
        tInstructorManager.add(tInstructor);







    }
}
