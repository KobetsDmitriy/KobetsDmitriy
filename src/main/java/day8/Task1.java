package day8;

public class Task1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis(); // время пошло

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<=20000; i++){
            sb.append(i + " ");
        }
        System.out.println(sb.toString());

        long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));


        System.out.println();
        System.out.println();

        long startTime1 = System.currentTimeMillis(); // время пошло

String numbers = "";
        for(int j = 0; j<=20000; j++){
            numbers = numbers + j + " ";

        }
        System.out.print(numbers);
        System.out.println();

        long stopTime1 = System.currentTimeMillis(); //сохраняем время после того, как код отработал
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));
    }
}
