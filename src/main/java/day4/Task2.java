package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int numberMax = 0;
        int numberMin = 10000;
        int kollischestvoElementovOkanchivaushichsyaNaNol = 0;
        int sum = 0;
        for(int number: numbers){
            number = (int)(Math.random()*10000);
            if(number > numberMax){
                numberMax = number;
            }
            if(number < numberMin){
                numberMin = number;
            }
            if(number%10 == 0){
                kollischestvoElementovOkanchivaushichsyaNaNol++;
            }
            if(number%10 == 0){
                sum = sum + number;
            }
        }
        System.out.println("наибольший элемент массива: " + numberMax);
        System.out.println("наименьший элемент массива: " + numberMin);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + kollischestvoElementovOkanchivaushichsyaNaNol);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sum);
    }
}
/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя цикл for each вывести в консоль:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.

 */