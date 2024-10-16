public class Division extends Calculator {
  @Override
  public double compute(double A, double B) {
      if (B == 0) {
          throw new ArithmeticException("Division by zero is not allowed.");
      }
      return A / B;
  }
}
