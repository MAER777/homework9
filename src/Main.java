import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        test1();
        task1();
        generateRandomArray();
    }

    public static void test1() {
        System.out.println("Тестовые задачи 3");
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Масивы одинаковые");
        } else {
            System.out.println("Масивы разные");
        }
        int maxWeight = -1;
        for (final int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }
        int[] arr1 = new int[10];
        Arrays.fill(arr1, 1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[2];
        arr2[0] = 1;
        arr2[1] = 2;

        int[] arr3 = new int[2];
        arr3[0] = 1;
        arr3[1] = 2;

        System.out.println(Arrays.equals(arr2, arr3)); // Тут В консоли печатается результат сравнения в формате boolean-значения, а именно true.

        int[] arr4 = new int[2];
        arr3[0] = 1;
        arr3[1] = 2;
        int[] arr5 = Arrays.copyOf(arr4, arr4.length);
        System.out.println(Arrays.equals(arr4, arr5));

        int[] arr6 = new int[2];
        arr6[0] = 2;
        arr6[1] = 1;
        Arrays.sort(arr6);
        System.out.println(Arrays.toString(arr6));

        char[][] gameField = new char[3][3];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                System.out.print(gameField[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        float sum = 0;
        System.out.println(Arrays.toString(arr)); // проверка сгенерированных чисел
        for (int i1 = 0; i1 < arr.length; i1++) {
            sum = sum + arr[i1];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        ///
        System.out.println("Задача 2");
        System.out.println(Arrays.toString(arr)); // проверка счета
        int maxDay = 100_000;
        int minDay = 200_000;
        for (final int maximum : arr) {
            if (maximum > maxDay) {
                maxDay = maximum;
            }
        }
        for (final int minimum : arr) {
            if (minimum < minDay) {
                minDay = minimum;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDay + " рублей. Максимальная сумма трат за день составила " + maxDay + " рублей.");
        System.out.println("Задача 3");
        System.out.println("Средняя сумма трат за месяц составила " + sum/30 + " рублей.");
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i3 = reverseFullName.length - 1; i3 > -1; i3--) {
            System.out.print(reverseFullName[i3]);
        }
    }
}