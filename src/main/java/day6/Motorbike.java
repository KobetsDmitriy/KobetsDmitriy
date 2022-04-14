package day6;


class Motorbike{
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }

    void info(){
        System.out.println("Это мотоцикл");
    }
    int yearDifference(int inputYear){
        int difference = inputYear - year;
        return Math.abs(difference);
    }
}
