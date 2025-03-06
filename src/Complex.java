public class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex Add(Complex obj) {
        double real_sum = real + obj.real;
        double imaginary_sum = imaginary + obj.imaginary;
        return new Complex(real_sum, imaginary_sum);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary;
    }

    public static void main(String[] args) {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 5);
        Complex result = a.Add(b);
        System.out.println("Сумма комплексных чисел: " + result);
        System.out.println(a.getReal() + a.getImaginary());
        System.out.println(b.getReal() + b.getImaginary());
    }
}
