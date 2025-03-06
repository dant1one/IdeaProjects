import java.util.Arrays;
import java.util.Scanner;

class Polindrom {
    public static boolean sentenceIsPalindrome(String sent) {
        String cleanedSentence = sent.replaceAll("\\s+", "").toLowerCase();
        String reversedSentence = new StringBuilder(cleanedSentence).reverse().toString();
        return cleanedSentence.equals(reversedSentence);
    }

    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner intscanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = intscanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Число " + number + " является палиндромом.");
        } else {
            System.out.println("Число " + number + " не является палиндромом.");
        }

        intscanner.close();

        Scanner strscanner = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String sentence = strscanner.nextLine();

        if (sentenceIsPalindrome(sentence)) {
            System.out.println("Предложение " + sentence + " является палиндромом.");
        } else {
            System.out.println("Предложение " + sentence + " не является палиндромом.");
        }

        strscanner.close();
    }
}

class StatisticArray {
    int[] array = {1, 2, 3, 4, 5};

    class SumOfArray {
        public int calculateSum() {
            int sum = 0;
            for (int i : array) {
                sum += array[i];
            }
            return sum;
        }
    }

    class AvgOfArray {
        public double calculateAverage() {
            SumOfArray sumObject = new SumOfArray();
            int sum = sumObject.calculateSum();
            return (double) sum / array.length;
        }
    }

    class MinMaxArray {
        public int calculateMax() {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            return max;
        }

        public int calculateSecondMax() {
            if (array.length < 2) {
                throw new IllegalArgumentException("Массив должен содержать минимум два элемента.");
            }
            Arrays.sort(array);
            return array[array.length - 2];
        }

        public int calculateMin() {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            return min;
        }

        public int calculateSecondMin() {
            if (array.length < 2) {
                throw new IllegalArgumentException("Массив должен содержать минимум два элемента.");
            }
            Arrays.sort(array);
            return array[1];
        }
    }

    public static void main(String[] args) {
        StatisticArray sa = new StatisticArray();

        SumOfArray sumObject = sa.new SumOfArray();
        int sum = sumObject.calculateSum();
        System.out.println("Сумма элементов массива: " + sum);

        AvgOfArray avgObject = sa.new AvgOfArray();
        double average = avgObject.calculateAverage();
        System.out.println("Среднее значение массива: " + average);

        MinMaxArray maxObject = sa.new MinMaxArray();
        int max = maxObject.calculateMax();
        System.out.println("Максимальное значение массива: " + max);

        int secondmax = maxObject.calculateSecondMax();
        System.out.println("Второе максимальное значение массива: " + secondmax);

        int min = maxObject.calculateMin();
        System.out.println("Минимальное значение массива: " + min);

        int secondmin = maxObject.calculateSecondMin();
        System.out.println("Второе минимальное значение массива: " + secondmin);
    }
}
