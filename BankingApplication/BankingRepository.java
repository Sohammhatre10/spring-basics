package BankingApplication;

public interface BankingRepository {
    void saveTransaction(String transactionDetails);

    String getTransaction(String transactionID);

    void updateAccountBalance(String accountID, double newBalance);

    double getAccountBalance(String accountID);
}