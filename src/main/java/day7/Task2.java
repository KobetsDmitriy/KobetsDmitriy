package day7;

import static java.lang.Math.*;

public class Task2 {
    public static void main(String[] args) {
        int max = 101;
        int min = 90;
        int stamina1 = (int)(Math.random()*(max-min)+min);
        int stamina2 = (int)(Math.random()*(max-min)+min);
        int stamina3 = (int)(Math.random()*(max-min)+min);
        int stamina4 = (int)(Math.random()*(max-min)+min);
        int stamina5 = (int)(Math.random()*(max-min)+min);
        int stamina6 = (int)(Math.random()*(max-min)+min);
        int stamina7 = (int)(Math.random()*(max-min)+min);
        int stamina8 = (int)(Math.random()*(max-min)+min);

        Player player1 = new Player(stamina1);
        Player player2 = new Player(stamina2);
        Player player3 = new Player(stamina3);
        Player player4 = new Player(stamina4);
        Player player5 = new Player(stamina5);
        Player player6 = new Player(stamina6);
        Player player7 = new Player(stamina7);
        Player player8 = new Player(stamina8);
        System.out.println();

        System.out.println(Player.getCountPlayer());

        for(int i = 0; i<=100; i++){
            player1.run();
            player2.run();
            player3.run();
            player4.run();
            player5.run();
            player6.run();
            //player7.run();
            //player8.run();
            System.out.println();
            Player.info();
        }
    }
}
class Player{
    private int stamina;
    public final static int MAX_STAMINA = 100;    //ЗАЧЕМ?
    public final static int MIN_STAMINA = 0;      //ЗАЧЕМ?
    private static int countPlayer = 0;

    public Player(int stamina){   // НУЖНО ЭТОЙ ПЕРЕМЕННОЙ ПРИСВОИТЬ СЛУЧАЙНОЕ ЗНАЧЕНИЕ
        this.stamina = stamina;
        countPlayer++;            // при каждом вызове конструктора число игроков увеличивается на 1
        if (countPlayer>6){       // если конструктор вызывается более 6 раз
            countPlayer--;        // число игроков остается равным 6
            System.out.println(countPlayer + " - максимальное число игроков на поле");
        }
    }

    public int getStamina() {    // зачем?
        return stamina;
    }

    public static int getCountPlayer() {   // зачем?
        return countPlayer;
    }
    public void run(){
        stamina--;                        // при вызове метода выносливость уменьшается на 1

        if(stamina == MIN_STAMINA){       // если выносливость не больше минимальной
            countPlayer--;                // игрок уходит с поля
            stamina = MIN_STAMINA;        // выносливость не может быть отрицательной и приравнивается к 0
            System.out.println("один игрок ушел с поля");
        }
        else if(stamina > MIN_STAMINA && stamina <= MAX_STAMINA){
            System.out.println("выносливость игрока составляет " + stamina); // если выносливость больше минимальной
        }
    }
    public static void info(){
        int ostalosMest = 0;
        ostalosMest = 6-countPlayer;
        if(countPlayer<6 && countPlayer > 0){  // если число игроков от 5 до 1

            switch (countPlayer){
                case 5:
                    System.out.println("Команды неполные. На поле еще есть " + ostalosMest + " свободное место");
                    System.out.println("На поле осталось " + countPlayer + " человек");
                    break;
                case 4: case 3: case 2:
                    System.out.println("Команды неполные. На поле еще есть " + ostalosMest + " свободных места");
                    System.out.println("На поле осталось " + countPlayer + " человека");
                    break;
                case 1:
                    System.out.println("Команды неполные. На поле еще есть " + ostalosMest + " свободных мест");
                    System.out.println("На поле осталось " + countPlayer + " человек");
                    break;

            }


            System.out.println("_____________________________________________________________");
            System.out.println();
        }
        else if(countPlayer<0){
            countPlayer++;
            System.out.println("На поле нет свободных мест");
            System.out.println("_____________________________________________________________");
        }
    }
}
/*
2. Дворовый футбол.
Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player) содержит следующие поля:
Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость”
(англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
Статическое поле countPlayers, которое считает количество игроков на футбольном поле (изначально их 0, выходом
на поле считается создание экземпляра класса, уходом - когда игрок устал).
Геттеры для полей “выносливость” и “количество игроков”.

и следующие методы:
run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
info() -  выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6, то выводит сообщение:
“Команды неполные. На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”. Грамматикой русского
языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.

Задание: Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random, который будет
генерировать случайные числа. Создать 6 игроков, передавая им в качестве аргумента в конструктор случайно
сгенерированные числа от 90 до 100. Вызвать метод info(). При попытке создать 7,8 … n игрока, количество игроков на
поле меняться не должно, проверить это.
Примените к одному игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости не
допускается). Вывести количество игроков на поле.

*По желанию: доработать метод info() так, чтобы при выводе в консоль грамматика русского языка учитывалась.
 */