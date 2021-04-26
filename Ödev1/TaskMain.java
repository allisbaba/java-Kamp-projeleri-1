package KampGün2;

public class TaskMain {
    public static void main(String[] args){
        TaskCategory taskCategory1 = new TaskCategory(1,"C# Kursu",2);

        TaskCategory taskCategory2 = new TaskCategory();
        taskCategory2.id = 2;
        taskCategory2.name = "Java Kursu";
        taskCategory2.time = 2;

        TaskCategory taskCategory3 = new TaskCategory();
        taskCategory3.id = 3;
        taskCategory3.name = "Temel Programlamaya Giriş";
        taskCategory3.time = 2;

        TaskCategory [] taskCategories = {taskCategory1,taskCategory2,taskCategory3};
        System.out.println(taskCategories.length);

        for(TaskCategory taskCategory : taskCategories){
            System.out.println("id:" + taskCategory.id);
            System.out.println("name: "+taskCategory.name);
            System.out.println("time: "+taskCategory.time +" months");


        }

      TaskTeacher taskTeacher = new TaskTeacher();
        taskTeacher.name = "Engin Demiroğ";
        taskTeacher.age = 37;
        taskTeacher.gender = "Male";
        taskTeacher.teacher(taskTeacher);

        TaskSite taskSite = new TaskSite();
        taskSite.joinSign();

    }
}
