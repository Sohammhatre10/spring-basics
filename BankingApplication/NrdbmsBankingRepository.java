package BankingApplication;

public class NrdbmsBankingRepository implements BankingRepository {

    @Override
    public void saveTransaction(String transactionDetails) {
        // Implementation for saving transaction in NRDBMS
    }

    @Override
    public String getTransaction(String transactionID) {
        // Implementation for retrieving transaction from NRDBMS
        return null;
    }

    @Override
    public void updateAccountBalance(String accountID, double newBalance) {
        // Implementation for updating account balance in NRDBMS
    }

    @Override
    public double getAccountBalance(String accountID) {
        // Implementation for retrieving account balance from NRDBMS
        return 0;
    }

}
