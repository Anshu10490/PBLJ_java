import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            
            if (num < 0) {
                throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
            }
            
            double sqrt = Math.sqrt(num);
            System.out.println("Square root: " + sqrt);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            sc.close();
        }
    }
}
