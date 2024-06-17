public class Main {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(view);
        controller.run();
    }
}