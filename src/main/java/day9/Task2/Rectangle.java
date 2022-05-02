package day9.Task2;

public class Rectangle extends Figure {
    private int width, height;

    public Rectangle(int width, int height, String color){
        super(color);
        this.height = height;
        this.width = width;
    }

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2*(width + height);
    }
}
