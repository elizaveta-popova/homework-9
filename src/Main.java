import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задача 2
        System.out.println("Задача 2");
        int maxExpenditure = 100000;
        int minExpenditure = 200000;
        for (final int current : arr) {
            if (current > maxExpenditure) {
                   maxExpenditure = current;
            }
            if (current < minExpenditure) {minExpenditure = current;
                }
            }
            System.out.println("Минимальная сумма трат за месяц составила " + minExpenditure + " рублей. Максимальная сумма трат за месяц составила " + maxExpenditure + " рублей.");
        //Задача 3
        System.out.println("Задача 3");
        int average = 0;
        int sum1 = 0;
             for (int i = 0; i < arr.length; i++) {
                 sum1 += arr[i];
                 average = sum1 / arr.length;
                 if (average > minExpenditure && average < maxExpenditure) {
                 }
             }
             System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}