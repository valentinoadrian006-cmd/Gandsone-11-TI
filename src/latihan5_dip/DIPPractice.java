package latihan5_dip;

import latihan5_dip.good.PaymentService;
import latihan5_dip.good.LuhnCardValidator;
import latihan5_dip.good.RuleBasedFraudDetector;
import latihan5_dip.good.StripePaymentGateway;
import latihan5_dip.good.DatabaseTransactionLogger;
import latihan5_dip.good.EmailNotificationSender;

public class DIPPractice {

    public static void main(String[] args) {

        System.out.println("=== BAD VERSION ===");
        latihan5_dip.bad.PaymentService badService =
                new latihan5_dip.bad.PaymentService();

        badService.pay("1234567890123456", 2000);

        System.out.println("\n=== GOOD VERSION ===");

        PaymentService goodService = new PaymentService(
                new LuhnCardValidator(),
                new RuleBasedFraudDetector(),
                new StripePaymentGateway(),
                new DatabaseTransactionLogger(),
                new EmailNotificationSender()
        );

        goodService.pay("1234567890123456", 2000);
    }
}
