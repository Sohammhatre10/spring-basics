package BankingApplication;

public class RdbmsBankingRepository implements BankingRepository {
    @Override
    public void saveTransaction(String transactionDetails) {
        // Implementation for saving transaction in RDBMS
    }

    @Override
    public String getTransaction(String transactionID) {
        // Implementation for retrieving transaction from RDBMS
        return null;
    }

    @Override
    public void updateAccountBalance(String accountID, double newBalance) {
        // Implementation for updating account balance in RDBMS
    }

    @Override
    public double getAccountBalance(String accountID) {
        // Implementation for retrieving account balance from RDBMS
        return 0;
    }

}
