package pk;
import java.util.logging.*;

class BANK {
    String name;
    int accno;
    int balance;
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    void withdraw(int amount){
        if(balance < amount){
            String s = "Current balance is "+balance+". amount "+amount+" cannot be withdrawn.";
            LOGGER.info(s);
        }
        else if(balance-amount < 500){
            LOGGER.info("Minimum balance must be atleast 500");
        }
        else{
            this.balance -= amount;
            String s = "Current balance: "+balance;
            LOGGER.info(s);
        }
    }

    void withdraw(){
        this.balance -= 100;
    }    

    void deposit(int amount){
        this.balance += amount;
        String s = "Current balance: "+balance;
        LOGGER.info(s);
    }

    BANK(String name, int accno, int balance){
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }
}
