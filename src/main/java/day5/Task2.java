package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Yamaha", "Red", 2022);
        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getAge());
    }
}
class Motorbike{
    private String model;
    private String color;
    private int age;

    public Motorbike(String model, String color, int age) {
        this.model = model;
        this.color = color;
        this.age = age;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
}

/*
2. Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”. Создать экземпляр
класса Мотоцикл, используя конструктор (set методы не использовать). Необходимо придерживаться принципов
инкапсуляции и использовать ключевое слово this. Вывести в консоль значение каждого из полей, используя get методы.

*/