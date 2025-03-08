public class ATM20 {

  class ATM {
      float balance; // Corrected spelling of "balance"
      int pin = 4444;
  
      // Check the PIN
      public void checkPin() {
          System.out.print("Enter your PIN: ");
          Scanner sc = new Scanner(System.in);
          int enteredPin = sc.nextInt();
          if (pin == enteredPin) {
              menu();
          } else {
              System.out.println("Incorrect PIN. Try again.");
              checkPin(); // Retry PIN entry
          }
      }
  
      // Display menu options
      public void menu() {
          System.out.println("Enter your choice:");
          System.out.println("1: Check Balance");
          System.out.println("2: Withdraw Balance");
          System.out.println("3: Deposit Balance");
          System.out.println("4: Exit");
          
          Scanner sc = new Scanner(System.in);
          int option = sc.nextInt();
  
          switch (option) {
              case 1:
                  checkBalance();
                  break;
              case 2:
                  withdrawBalance();
                  break;
              case 3:
                  depositBalance();
                  break;
              case 4:
                  System.out.println("Thank you for using the ATM!");
                  break;
              default:
                  System.out.println("Invalid choice. Please try again.");
                  menu();
          }
      }
  
      // Check the current balance
      public void checkBalance() {
          System.out.println("Current Balance: " + balance);
          menu();
      }
  
      // Withdraw money
      public void withdrawBalance() {
          System.out.print("Enter the amount to withdraw: ");
          Scanner sc = new Scanner(System.in);
          float amount = sc.nextFloat();
          if (amount > balance) {
              System.out.println("Insufficient balance.");
          } else {
              balance -= amount;
              System.out.println("Withdrawal successful. New balance: " + balance);
          }
          menu();
      }
  
      // Deposit money
      public void depositBalance() {
          System.out.print("Enter the amount to deposit: ");
          Scanner sc = new Scanner(System.in);
          float amount = sc.nextFloat();
          balance += amount;
          System.out.println("Deposit successful. New balance: " + balance);
          menu();
      }
  
      // Main method
      public static void main(String[] args) {
          ATM obj = new ATM();
          obj.checkPin();
      }
  }
  
      float balance; // Corrected spelling of "balance"
      int pin = 4444;
  
      // Check the PIN
      public void checkPin() {
          System.out.print("Enter your PIN: ");
          Scanner sc = new Scanner(System.in);
          int enteredPin = sc.nextInt();
          if (pin == enteredPin) {
              menu();
          } else {
              System.out.println("Incorrect PIN. Try again.");
              checkPin(); // Retry PIN entry
          }
      }
  
      // Display menu options
      public void menu() {
          System.out.println("Enter your choice:");
          System.out.println("1: Check Balance");
          System.out.println("2: Withdraw Balance");
          System.out.println("3: Deposit Balance");
          System.out.println("4: Exit");
          
          Scanner sc = new Scanner(System.in);
          int option = sc.nextInt();
  
          switch (option) {
              case 1:
                  checkBalance();
                  break;
              case 2:
                  withdrawBalance();
                  break;
              case 3:
                  depositBalance();
                  break;
              case 4:
                  System.out.println("Thank you for using the ATM!");
                  break;
              default:
                  System.out.println("Invalid choice. Please try again.");
                  menu();
          }
      }
  
      // Check the current balance
      public void checkBalance() {
          System.out.println("Current Balance: " + balance);
          menu();
      }
  
      // Withdraw money
      public void withdrawBalance() {
          System.out.print("Enter the amount to withdraw: ");
          Scanner sc = new Scanner(System.in);
          float amount = sc.nextFloat();
          if (amount > balance) {
              System.out.println("Insufficient balance.");
          } else {
              balance -= amount;
              System.out.println("Withdrawal successful. New balance: " + balance);
          }
          menu();
      }
  
      // Deposit money
      public void depositBalance() {
          System.out.print("Enter the amount to deposit: ");
          Scanner sc = new Scanner(System.in);
          float amount = sc.nextFloat();
          balance += amount;
          System.out.println("Deposit successful. New balance: " + balance);
          menu();
      }
  
      // Main method
      public static void main(String[] args) {
          ATM obj = new ATM();
          obj.checkPin();
      }
  }
  
  
}
