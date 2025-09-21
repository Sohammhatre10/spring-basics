package BankingApplication;

public class BankingApplication {
    BankingService bankingService = new BankingService();
    RdbmsBankingRepository RDBMS = new RdbmsBankingRepository();
    NrdbmsBankingRepository NRDBMS = new NrdbmsBankingRepository();
    EmailService emailService = new EmailService();
    SMSService smsService = new SMSService();

    public static void main(String[] args) {
        System.out.println("Banking Application is running...");
    }

    public void processTransaction(String message, String ID) {
        RDBMS.saveTransaction(message);
        emailService.sendNotification(message, ID);
        smsService.sendNotification(message, ID);
    }

    public void processTransaction1(String message, String ID) {
        NRDBMS.saveTransaction(message);
        emailService.sendNotification(message, ID);
        smsService.sendNotification(message, ID);
    }

}
