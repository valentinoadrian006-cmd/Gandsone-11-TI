package latihan5_dip.good;

public class RuleBasedFraudDetector implements FraudDetector {

    @Override
    public boolean check(String cardNumber, double amount) {
        System.out.println("[GOOD] Checking fraud using rule-based engine...");
        return amount < 5000;
    }
}
