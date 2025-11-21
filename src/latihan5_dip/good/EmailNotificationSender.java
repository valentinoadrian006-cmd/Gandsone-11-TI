package latihan5_dip.good;

public class EmailNotificationSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
