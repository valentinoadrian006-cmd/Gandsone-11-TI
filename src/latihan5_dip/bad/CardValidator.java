package latihan5_dip.bad;

public class CardValidator {
    public boolean validate(String cardNumber) {
        System.out.println("[BAD] Validating card number...");
        return cardNumber.length() == 16;
    }
}
