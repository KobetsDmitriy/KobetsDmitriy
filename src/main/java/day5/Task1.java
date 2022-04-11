package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Audi");
        car.setColor("Red");
        car.setAge(2022);
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getAge());
    }
}
class Car{
    private String model;
    private String color;
    private int age;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
/*
1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”. Создать get и set методы
для каждого поля. Создать экземпляр класса Автомобиль. Задать значение для каждого поля, используя set методы.
Вывести в консоль значение каждого из полей, используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.

 */