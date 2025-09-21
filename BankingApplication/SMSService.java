package BankingApplication;

public class SMSService implements NotificationService {
    public static void main(String[] args) {
        System.out.println("SMS Service is running...");
    }

    @Override
    public void sendNotification(String message, String phoneNumber) {
        System.out.println("SMS sent to " + phoneNumber + " with message: " + message);
    }
}
