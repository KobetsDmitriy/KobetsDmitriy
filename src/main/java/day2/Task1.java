package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число этажей в доме:");
        int chisloEtaghey = scanner.nextInt();
        if(chisloEtaghey >=1 && chisloEtaghey <= 4){
            System.out.println("Малоэтажный дом");
        }
        else if (chisloEtaghey > 4 && chisloEtaghey <= 8){
            System.out.println("Среднеэтажный дом");
        }
        else if(chisloEtaghey > 8){
            System.out.println("Многоэтажный дом");
        }
        else {
            System.out.println("Ошибка ввода");
        }

    }
}
/*
Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число, соответствующее
количеству этажей в здании. Используя условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.

Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”.
Также, необходимо учесть что может быть введено отрицательное значение, в таком случае сообщить “Ошибка ввода”.

 */