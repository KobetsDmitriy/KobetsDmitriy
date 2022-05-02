package day9.Task1;

public class Teacher extends Human {
    private String subjectName;

    public Teacher(String name, String subjectName){ // имя преподавателя и название преподаваемого предмета.
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public void printInfo() { //“Этот человек с именем ИМЯ”
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());//“Этот преподаватель с именем ИМЯ”.


    }

}
