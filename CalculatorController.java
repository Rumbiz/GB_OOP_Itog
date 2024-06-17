
public class CalculatorController {
    private CalculatorView view;

    public CalculatorController(CalculatorView view) {
        this.view = view;
    }

    public void run() {
        try {
            ComplexNumber a = view.getComplexNumber("Введите первое комплексное число (вещественная часть и мнимая часть через пробел): ");
            ComplexNumber b = view.getComplexNumber("Введите второе комплексное число (вещественная часть и мнимая часть через пробел): ");
    
            Calculator calculator = new Calculator(a, b);
            
            view.displayResult(calculator.add(), "сложения");
            view.displayResult(calculator.multiply(), "умножения");
            view.displayResult(calculator.divide(), "деления ");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}