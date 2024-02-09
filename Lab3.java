// Programmers:  Chris
// Course:  CS 212
// Due Date: 2/11/24
// Lab Assignment: create atm
// Problem Statement: make a working atm with user inputs
// Data In: name, decision, withdraw amount, deposit amount
// Data Out: name, withdraw amount, deposit amount, balance

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = scan.nextLine();
        System.out.println("What action would you like to perform now?" +
                "\n 1. Check your balance, type 1" +
                "\n 2. Withdraw money, type 2" +
                "\n 3. Deposit money, type 3" +
                "\n 4. Exit, type 4"); // Get user decision
        int decision = scan.nextInt();
        float balance = 212.90; // Establish initial balance
        float total_withdrawn = 0;
        float total_deposited = 0;
        while (decision != 4) {
            if (decision == 1) {
                System.out.println("Your balance is, $" + balance);
            } else if (decision == 2) {
                System.out.println("How much would you like to withdraw?");
                float withdraw_amount = scan.nextFloat();
                balance -= withdraw_amount;
                total_withdrawn += withdraw_amount;
                System.out.println("Your current balance is now $" + balance);
            } else if (decision == 3){
                System.out.println("How much would you like to deposit?");
                float deposit_amount = scan.nextFloat();
                balance += deposit_amount;
                total_deposited += deposit_amount;
                System.out.println("Your current balance is now $" + balance);
            }
            System.out.println("What action would you like to perform now?" +
                    "\n 1. Check your balance, type 1" +
                    "\n 2. Withdraw money, type 2" +
                    "\n 3. Deposit money, type 3" +
                    "\n 4. Exit, type 4"); // Get user decision
            decision = scan.nextInt();
        }
        scan.nextLine(); // Consume newline character after reading int
        System.out.println("Thank you, " + name +  ", for choosing our ATM, would you like your receipt emailed or printed?");
        String receipt_choice = scan.nextLine();
        if (receipt_choice.equals("emailed")){
            System.out.println("Okay, make sure to check your email shortly, goodbye!");
        } else if (receipt_choice.equals("printed")){
            System.out.println("Current balance: $" + balance +
                    "\n Total withdrawn: $" + total_withdrawn +
                    "\n Total deposited: $" + total_deposited +
                    "\n Thank you, " + name + ", for choosing our ATM, have a nice day!");
        }
    }
}
