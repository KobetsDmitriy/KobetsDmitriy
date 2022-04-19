package day6;

public class Teacher {
    private String teacherName;
    private String subject;


    public Teacher(String teacherName, String subject){
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public void evaluate(Student student){
        int max = 5;
        int min = 2;
        double chislo = Math.random() * (max - min) + min;
        switch ((int) Math.round(chislo)){
            case (2):
                System.out.println("Преподаватель " + teacherName + " оценил студента с именем " + student.getStudentName() +
                        " по предмету " + subject + " на оценку " + "неудовлетворительно");
                break;
            case (3):
                System.out.println("Преподаватель " + teacherName + " оценил студента с именем " + student.getStudentName() +
                        " по предмету " + subject + " на оценку " + "удовлетворительно");
                break;
            case (4):
                System.out.println("Преподаватель " + teacherName + " оценил студента с именем " + student.getStudentName() +
                        " по предмету " + subject + " на оценку " + "хорошо");
                break;
            case (5):
                System.out.println("Преподаватель " + teacherName + " оценил студента с именем " + student.getStudentName() +
                        " по предмету " + subject + " на оценку " + "отлично");
                break;

        }
    }
}
