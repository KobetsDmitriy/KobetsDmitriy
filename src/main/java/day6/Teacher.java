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
        System.out.println("Преподаватель " + teacherName + " оценил студента с именем " + student.getStudentName() +
                " по предмету " + subject + " на оценку " + Math.round(chislo));
    }
}
