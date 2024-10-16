public class MainCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java mySoftware <operator> <A> <B>");
            return;
        }

        String operator = args[0];
        double A = Double.parseDouble(args[1]);
        double B = Double.parseDouble(args[2]);

        Calculator calculator = null;

        switch (operator) {
            case "+":
                calculator = new Addition();
                break;
            case "-":
                calculator = new Substraction();
                break;
            case "*":
                calculator = new Multiplication();
                break;
            case "/":
                calculator = new Division();
                break;
            default:
                System.out.println("Unknown operator: " + operator);
                return;
        }

        // Compute and display the result
        double result = calculator.compute(A, B);
        System.out.println("Result: " + result);
    }
}
