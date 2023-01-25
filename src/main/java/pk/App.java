package pk;
import java.util.*;
import java.util.logging.*;
class BANK {
    String name;
    int accno;
    int balance;
    void withdraw(int amount){
        if(balance < amount){
            System.out.println("Current balance is "+balance+". amount "+amount+" cannot be withdrawn.");
        }
        else if(balance-amount < 500){
            System.out.println("Minimum balance must be atleast 500");
        }
        else{
            this.balance -= amount;
            System.out.println("Current balance: "+balance);
        }
    } 
    void withdraw(){
        this.balance -= 100;
    }    
    void deposit(int amount){
        this.balance += amount;
        System.out.println("Current balance: "+balance);
    }
    bank(String name, int accno, int balance){
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }
}

public class App 
{
    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        LOGGER.log(Level.INFO,"My bank \n");
        LOGGER.log(Level.INFO,"name :");
        String name = sc.next();
        System.out.print("account number :");
        int accno  = sc.nextInt();
        bank b = new bank(name,accno,500);
        int start = 1;
        do{
            System.out.println("1.deposit 2.withdraw 3.check balance 4.exit");
            int s = sc.nextInt();
            if(s == 1){
                System.out.println("Enter amount: ");
                int amount = sc.nextInt();
                b.deposit(amount);
            }
            else if(s == 2){
                System.out.println("Enter amount: ");
                int amount = sc.nextInt();
                b.withdraw(amount);
                
            }
            else if(s == 3){
                System.out.println(b.balance);
            }
            else if(s == 4){
                System.exit(1);
            }
        }while(start== 1);
    }
}
