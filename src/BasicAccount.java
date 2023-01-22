public class BasicAccount implements IAccount {
    int AccountNumber;

    double SingleWithdrawalLimit;
    double Balance;

    public BasicAccount(int accountNumber, double singleWithdrawalLimit) {
        this.AccountNumber = accountNumber;
        this.SingleWithdrawalLimit = singleWithdrawalLimit;
    }

    @Override
    public void Deposit(double amount) {
        Balance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount > SingleWithdrawalLimit) {
            amount = SingleWithdrawalLimit;
        }
        if (amount > Balance) {
            amount = Balance;
        }
        Balance -= amount;
        return amount;
    }

    @Override
    public double GetCurrentBalance() {
        return Balance;
    }

    @Override
    public int GetAccountNumber() {
        return AccountNumber;
    }


   }