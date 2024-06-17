import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public ComplexNumber getComplexNumber(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine(); // считываем всю строку
        String[] parts = input.split(" ");
    
        if (parts.length != 2) {
            throw new IllegalArgumentException("Некорректный формат ввода комплексного числа. Вещественная и мнимая части должны быть разделены пробелом.");
        }
    
        double real = Double.parseDouble(parts[0]);
        double imaginary = Double.parseDouble(parts[1]);
        return new ComplexNumber(real, imaginary);
    }
    public void displayResult(ComplexNumber result, String operation) {
        System.out.println("Результат "+ operation+ " :" + result);
    }
}