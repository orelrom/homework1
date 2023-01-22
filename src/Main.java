import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<IAccount>accounts=new ArrayList<>();
        accounts.add(new StandardAccount(1,500));
        accounts.add(new StandardAccount(2,1500));
        accounts.add(new PremiumAccount(3));
        accounts.add(new StandardAccount(4,2000));
        accounts.add(new BasicAccount(5,2000));
        accounts.add(new StandardAccount(6,1300));
        accounts.add(new StandardAccount(7,900));
        accounts.add(new PremiumAccount(8));
        accounts.add(new BasicAccount(9,300));
        accounts.add(new StandardAccount(10,800));

        for (IAccount account :accounts) {
            System.out.println("For account number,"+ account.GetAccountNumber()+"credit limit will be :"+account.GetCurrentBalance());
            System.out.println("For account number ,"+ account.GetAccountNumber()+"the withdrawal limit will be: "+ account.Withdraw(500));
        }

    }
}