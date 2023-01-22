import java.util.List;

public interface IBank {
    void OpenAccount(IAccount account);
    void CloseAccount(int accountNumber);
    List<IAccount> GetAllAccounts();
    List<IAccount> GetAllAccountsInDebt();
    List<IAccount> GetAllAccountsWithBalance(double balanceAbove);

    List<IAccount> GetAllAccountInDebt();

    List<IAccount> GetAllAccountWithBalance(double balanceAbove);
}
