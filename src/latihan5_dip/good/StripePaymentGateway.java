package latihan5_dip.good;

public class StripePaymentGateway implements PaymentGateway {

    @Override
    public boolean process(double amount) {
        System.out.println("[GOOD] Processing payment via Stripe...");
        return true;
    }
}
