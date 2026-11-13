package ATMproject;
import java.util.Scanner;
public class ATMSimulator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int PIN=944126;
        double Balance=10000;
        int choice;
        double amount;

        System.out.println("Hello Welcome To ATM");
        System.out.println("============================");
        System.out.println("Enter Your 6-Digits PIN:");
        int UserPIN=sc.nextInt();
        if(UserPIN!=PIN){
          System.out.println("Incorrect PIN!");
          System.out.println("Transaction Cancelled.");
          return;
        }
        while(true){
            System.out.println("====== ATM MANU =======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.println("Enter your Choice:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Your Current Balance: Rs " +Balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: Rs ");
                    amount=sc.nextDouble();
                    if(amount>0){
                         Balance=Balance+amount;
                         System.out.println("Rs "+amount+" deposit Successfully.");
                         System.out.println("Updated Balance: Rs "+Balance);
                    }else{
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: Rs ");
                    amount=sc.nextDouble();
                    if(amount>Balance){
                        System.out.println("Insufficient Balance.");
                    }else if(amount<=0){
                        System.out.println("Invalid amount.");
                    }else{
                    Balance=Balance-amount;
                    System.out.println("please collect your cash.");
                    System.out.println("Remaining Balance: Rs "+Balance);
                    }
                    break;

                case 4:
                    System.out.print("Enter current PIN:");
                    int oldPIN=sc.nextInt();
                     if(oldPIN==PIN){
                        System.out.println("Enter New PIN:");
                        PIN=sc.nextInt();
                        System.out.println("PIN change Successfully.");
                     }else{
                        System.out.println("Incorrect Current PIN.");
                     }
                    break; 

                case 5:
                    System.out.println("Thank you for using ATM.");
                    System.out.println("Visit Again!");
                    return;

                default:
                    System.out.println("Invalid Choice! Please try again.");
                    break;
            }

        }
    }
}
