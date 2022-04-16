package day6;

public class Airplane {

        private String manufacturer;
        private int year;
        private int lenght;
        private int weight;
        private int fuel = 0;

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setLenght(int lenght) {
            this.lenght = lenght;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        public int getFuel(){
            return fuel;
        }

        public Airplane(String manufacturer, int year, int lenght, int weight){
            this.manufacturer = manufacturer;
            this.year = year;
            this.lenght = lenght;
            this.weight = weight;
        }

        void info(){
            System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + lenght +
                    ", вес: " + weight+ ", количество топлива в баке: " + fuel);
        }
        public void fillUp(int n){
            fuel = fuel + n;
        }
}
