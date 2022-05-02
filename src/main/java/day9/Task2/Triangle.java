package day9.Task2;

public class Triangle extends Figure {
    private int lenghtA, lenghtB, lenghtC;
    double s;
    double poluperimetr = (lenghtA + lenghtB + lenghtC)/2;

    public Triangle(int lenghtA, int lenghtB, int lenghtC, String color){
        super(color);
        this.lenghtA = lenghtA;
        this.lenghtB = lenghtB;
        this.lenghtC = lenghtC;
    }
    public double area(){
        return s = Math.sqrt(poluperimetr * (poluperimetr-lenghtA) * (poluperimetr-lenghtB) * (poluperimetr-lenghtC));
    }
    public double perimeter(){
        return poluperimetr*2;
    }
}
