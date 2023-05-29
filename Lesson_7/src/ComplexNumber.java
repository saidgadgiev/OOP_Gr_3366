/** Для реализации калькулятора комплексных чисел на Java мы можем создать класс ComplexNumber,
который будет содержать поля для хранения действительной и мнимой частей числа, а также методы
для выполнения операций сложения, умножения и деления.**/


public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = real * other.real - imaginary * other.imaginary;
        double newImaginary = real * other.imaginary + imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (real * other.real + imaginary * other.imaginary) / denominator;
        double newImaginary = (imaginary * other.real - real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}
