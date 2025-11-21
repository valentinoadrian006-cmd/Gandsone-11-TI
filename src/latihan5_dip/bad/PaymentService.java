package latihan5_dip.bad;

public class PaymentService {

    private CardValidator validator = new CardValidator();
    private FraudDetector fraudDetector = new FraudDetector();
    private PaymentGateway gateway = new PaymentGateway();
    private TransactionLogger logger = new TransactionLogger();
    private NotificationSender notifier = new NotificationSender();

    public void pay(String cardNumber, double amount) {

        logger.log("Payment started...");

        if (!validator.validate(cardNumber)) {
            logger.log("Card invalid!");
            return;
        }

        if (!fraudDetector.checkFraud(cardNumber, amount)) {
            logger.log("Fraud detected!");
            return;
        }

        if (!gateway.process(amount)) {
            logger.log("Payment failed!");
            return;
        }

        logger.log("Payment success!");
        notifier.send("Your payment has been completed.");
    }
}
