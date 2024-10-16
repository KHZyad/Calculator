package Calculator;
import Calculator;

public class Addition extends Calculator {

    // Implement the abstract method
    @Override
    public double compute(double A, double B) {
        return A + B; // Perform addition
    }

    public static void main(String[] args) {
        // Create an instance of Addition
        Addition addition = new Addition();

        // Call the compute method
        double result = addition.compute(5, 3);

        // Print the result
        System.out.println("The result of the addition is: " + result);
    }
}
