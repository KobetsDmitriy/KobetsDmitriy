package day6;

class Car{
    private String model;
    private String color;
    private int year;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
    void info(){
        System.out.println("Это автомобиль");
    }
    int yearDifference(int inputYear){
        int difference = inputYear - year;
        return Math.abs(difference);
    }
}
