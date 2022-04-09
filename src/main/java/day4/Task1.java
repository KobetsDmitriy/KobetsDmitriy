package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число элементов массива");
        int n = scanner.nextInt();
        int bolsheVosmi = 0;
        int ravnoOdnomu = 0;
        int chetnihChisel = 0;
        int neChetnihChisel = 0;
        int sum = 0;
        //создаем массив длины n:
        int[] numbers = new int[n];
        // заполняем массив случайными числами
        for(int i = 0; i<n; i++){
            numbers[i] = (int) (Math.random()*11);
            }
        for(int number:numbers){
            System.out.print(number + " ");
            if(number>8){
                bolsheVosmi++;
            }
            if(number == 1){
                ravnoOdnomu++;
            }
            if(number%2==0){
                chetnihChisel++;
            }
            if(number%2!=0){
                neChetnihChisel++;
            }
            sum = sum+number;
        }
        System.out.println();
        System.out.println("Длина массива: " + n);
        System.out.println("Колличество чисел больше 8: " + bolsheVosmi);
        System.out.println("Количестве чисел равных 1: " + ravnoOdnomu);
        System.out.println("Количестве четных чисел: " + chetnihChisel);
        System.out.println("Количестве нечетных чисел: " + neChetnihChisel);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
/*
1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его
случайными числами от 0 до 10 (включительно). Используя цикл for each вывести содержимое массива в консоль,
а также вывести в консоль информацию о:

а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]

Информация о массиве:
Длина массива: 10
Количество чисел больше 8: 1
Количество чисел равных 1: 0
Количество четных чисел: 6
Количество нечетных чисел: 4
Сумма всех элементов массива: 46

 */