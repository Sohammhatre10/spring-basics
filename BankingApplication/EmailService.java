package BankingApplication;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification(String message, String emailID) {
        System.out.println("Email sent to " + emailID + " with message: " + message);
    }
}