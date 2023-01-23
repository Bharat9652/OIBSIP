import java.util.Scanner;
public class atm_interface
{
    public static void main(String args[])
    {
        int ch;
        long amount=0;
        try (Scanner sc = new Scanner(System.in)) {
            String transacationhistory="";
            int id=934742944,pin=9652;
            do{
                System.out.println("Enter your ID : ");
                id=sc.nextInt();

                System.out.println("Enter your Pin : ");
                pin=sc.nextInt();

                if(id!=934742944 || pin!=9652)
                {
                    System.out.println("You entered wrong Id or Password ");
                }
            }while(id!=934742944 || pin!=9652);
            do
            {
                System.out.println("---------ATM Service--------");
                System.out.println("\n 1.Transaction History.\n 2.Withdraw. \n 3.Deposit. \n 4.Transfer. \n 5.Quit. ");
                System.out.println("\n Enter your choice : ");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                        System.out.println("-------Transaction History------");
                        System.out.println("\n Transaction History is : " + transacationhistory);
                        break;

                    case 2:
                            System.out.println("\n Enter the amount to Withdraw : ");
                            int w=sc.nextInt();

                            if(w % 100 !=0)
                            {
                                System.out.println("\n Please enter amount in multiple of 100.");
                            }

                            else if(w > (amount - 1000))
                            {
                                System.out.println("\n Insufficient balance!");
                            }
                            else
                            {
                                amount=amount-w;
                                System.out.println("Your current balance : "+amount);
                            }
                            break;
                    case 3:
                        System.out.println("\n Enter the amount to deposit :  ");
                        int d=sc.nextInt();
                        amount=amount+d;
                        System.out.println("Your balance is : "+amount);
                        break;
                    
                    case 4:
                        System.out.println("--------Transaction to the account --------");
                        {
                            try (Scanner sr = new Scanner(System.in)) {
                                System.out.println("\n Enter Receipent's Name : ");
                                String receipent = sr.nextLine();
                                System.out.println("\n Enter amount you wish to transfer : ");
                                float amount1=sr.nextFloat();

                                try{
                                                    
                                    if(amount >= amount1)
                                    {
                                        if(amount1<=15000f)
                                        {
                                            amount -=amount1;
                                            System.out.println("\n Successfully transfered to : "+receipent);
                                            String str=amount1 + " : Rs transfered to : " + receipent + "\n ";
                                            transacationhistory = transacationhistory.concat(str);
                                        }
                                        else {
                                            System.out.println("\n Invalid transfer ! Limit is 150000.00 only");
                                          }
                                    }
                                    else{
                                        System.out.println("\n Insufficient Balance !");
                                    }
                                }
                                catch(Exception e){
                                    System.out.println(e);
                                }
                            }
                        }
                        case 5:
                        System.out.println("Thank you for using ATM Service !!");
                        break;

                        default :
                        System.out.println("Invalid Choice");
                    }
            }while(ch!=5);
        }
    }
}