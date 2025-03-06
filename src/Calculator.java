import java.util.Scanner;

public class Calculator {

    public int plus(int first, int second){
        return first + second;
    }
    public double plus(int first, double second){
        return first + second;
    }
    public int minus(int first, int second){
        return first - second;
    }
    public int multiply(int first, int second){
        return first * second;
    }
    public int division(int first, int second){
        return first / second;
    }
        public void main(String[] args) {
            Scanner intscanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            int first = intscanner.nextInt();

            System.out.print("Введите первое число: ");
            int second = intscanner.nextInt();

            intscanner.close();

            int result_plus = plus(first, second);
            int result_minus = minus(first, second);
            int result_multiple = multiply(first, second);
            int result_division = division(first, second);
            System.out.println(result_plus);
            System.out.println(result_minus);
            System.out.println(result_multiple);
            System.out.println(result_division);
        }
}
