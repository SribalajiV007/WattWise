import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner  s = new Scanner(System.in);
        System.out.println("Welcome!...");
        System.out.println("Hope you are doing good..");

        System.out.println("May i know your good name please..");
        System.out.print("Your Name: ");
        String name = s.nextLine();

        System.out.println("Hello "+name+", How may I help you today?");
        System.out.println("press \n1.Quick bill pay \n2. Check EB bill  \n.3.EB calculator");
        int input = s.nextInt();

        switch (input){
            case 1:
                System.out.print("Enter your consumer number: ");
                long consno = s.nextLong();
                System.out.println("Checking your bill ..kindly wait");
                Thread.sleep(2000);
                int amount = (int)(Math.random() *9000)+1000;
                System.out.println("Your bill amount is:" +amount);
                System.out.println("Kindly pay the bill to your nearest EB Office");
                System.out.print("For online pay..press 1 or 2 for Exit: ");
                int input1 = s.nextInt();

                if(input1 == 1){
                    System.out.println("Confirm to pay ₹"+amount+" by pressing 1");
                    int confirm = s.nextInt();
                    System.out.println("Thank you for paying EB bill , Have a Nice day");
                }else {
                    return;
                }
                break;
            case 2:
                System.out.println("To check your EB bill kindly enter your consumer no below");
                System.out.print("Consumer No: ");
                long consno1 = s.nextLong();
                System.out.println("Checking your bill for "+consno1+" ..kindly wait");
                Thread.sleep(2000);
                int amount1 = (int)(Math.random() *9000)+1000;
                System.out.println("Your bill amount is:" +amount1);
                System.out.println("Thank you for checking your bill , To pay Kindly visit payment page.");
                break;
            case 3:
                System.out.println("WELCOME TO EB CALCULATOR");
                System.out.print("Enter number of units consumed");
                double units = s.nextDouble();

                double billAmount=0;

                if(units<100)
                    billAmount = units*1.5;
                else if (units<=200)
                    billAmount = units*2.0;
                else
                    billAmount = units*3.0;


                if(billAmount >500) {
                    billAmount += 50;
                }

                System.out.println("Total Electricity bill: ₹"+billAmount);
                System.out.println("Thank you for checking your bill , To pay.. Kindly visit payment page.");

        }
    }
}