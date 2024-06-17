public class Calculator {
    private ComplexNumber a;
    private ComplexNumber b;

    public Calculator(ComplexNumber a, ComplexNumber b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNumber add() {
        return ComplexNumberOperations.add(a, b);
    }

    public ComplexNumber multiply() {
        return ComplexNumberOperations.multiply(a, b);
    }

    public ComplexNumber divide() {
        return ComplexNumberOperations.divide(a, b);
    }
}