package latihan5_dip.good;

public class PaymentService {

    private final CardValidator validator;
    private final FraudDetector fraudDetector;
    private final PaymentGateway gateway;
    private final TransactionLogger logger;
    private final NotificationSender notifier;

    public PaymentService(
            CardValidator validator,
            FraudDetector fraudDetector,
            PaymentGateway gateway,
            TransactionLogger logger,
            NotificationSender notifier
    ) {
        this.validator = validator;
        this.fraudDetector = fraudDetector;
        this.gateway = gateway;
        this.logger = logger;
        this.notifier = notifier;
    }

    public void pay(String cardNumber, double amount) {

        logger.log("Payment started...");

        if (!validator.validate(cardNumber)) {
            logger.log("Invalid card!");
            return;
        }

        if (!fraudDetector.check(cardNumber, amount)) {
            logger.log("Fraud detected!");
            return;
        }

        if (!gateway.process(amount)) {
            logger.log("Payment failed!");
            return;
        }

        logger.log("Payment success!");
        notifier.send("Your payment is successful.");
    }
}
