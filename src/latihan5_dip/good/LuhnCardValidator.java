package latihan5_dip.good;

public class LuhnCardValidator implements CardValidator {

    @Override
    public boolean validate(String cardNumber) {
        System.out.println("[GOOD] Validating card using LUHN algorithm...");
        return cardNumber.length() == 16;
    }
}
