import java.util.Scanner;

public class ATMWithdrawal {
    
    static double balance = 3000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();
        
        try {
            if (enteredPin != 1234) {
                throw new IllegalArgumentException("Invalid PIN.");
            }
            
            System.out.print("Withdraw Amount: ");
            double withdrawAmount = sc.nextDouble();
            
            if (withdrawAmount > balance) {
                throw new IllegalArgumentException("Insufficient balance.");
            }
            
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage() + " Current Balance: " + balance);
        } finally {
            System.out.println("Remaining Balance: " + balance);
        }
        
        sc.close();
    }
}
