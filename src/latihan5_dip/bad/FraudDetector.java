package latihan5_dip.bad;

public class FraudDetector {
    public boolean checkFraud(String cardNumber, double amount) {
        System.out.println("[BAD] Checking fraud...");
        return amount < 5000;
    }
}
