package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int maxIndex = 0;
        int maxSum = 0;
        int[][] numbers = new int[m][n];
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;   // обнуляю sum после каждой строки
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print((numbers[i][j] = (int) (Math.random() * 50)) + " "); // рандомно создается i-тая строка
                sum = sum + numbers[i][j]; //сумма i-той строки
                if (sum >= maxSum) {
                    maxSum = sum;
                    maxIndex = i;
                }
            }
            System.out.println();
            System.out.println("Сумма строки " + i + " равна " + sum);
        }
        System.out.println("Максимальная сумма элементов в " + maxIndex + " строке. Она равна " + maxSum);
    }
}
/*
3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8
(m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки, сумма чисел
в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):

3 2 1 5 7 	// сумма - 18
1 2 5 6 2 	// сумма - 16
3 4 9 6 4	// сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

 */