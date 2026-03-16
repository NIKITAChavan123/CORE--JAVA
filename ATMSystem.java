import java.util.Scanner;

class BankAccount {

    // Encapsulation (private variables)
    private int balance = 10000;
    private int pin = 1234;

    // Method to check PIN
    public boolean validatePin(int inputPin) {
        if (inputPin == pin) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Your Balance is: " + balance);
    }

    // Method to deposit money
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully");
    }

    // Method to withdraw money
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Please collect your cash");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class ATMSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (account.validatePin(enteredPin)) {

            int choice;

            do {
                System.out.println("\n---- ATM MENU ----");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    account.checkBalance();
                } 
                else if (choice == 2) {
                    System.out.print("Enter amount to deposit: ");
                    int amount = sc.nextInt();
                    account.deposit(amount);
                } 
                else if (choice == 3) {
                    System.out.print("Enter amount to withdraw: ");
                    int amount = sc.nextInt();
                    account.withdraw(amount);
                } 
                else if (choice == 4) {
                    System.out.println("Thank you for using ATM");
                } 
                else {
                    System.out.println("Invalid Choice");
                }

            } while (choice != 4);

        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}


//result
Enter ATM PIN: 1234

---- ATM MENU ----
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 1

Your Balance is: 10000







