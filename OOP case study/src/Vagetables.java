public class Vagetables extends Grocery{
    String VagetableName;

    public Vagetables(String name, int stock_quantity, int price, int expiry, String nutritional_value, String vagetableName) {
        super(name, stock_quantity, price, expiry, nutritional_value);
        VagetableName = vagetableName;
    }

    @Override
    public String toString() {
        return "Vagetables{" +
                "VagetableName='" + VagetableName + '\'' +
                ", expiry=" + expiry +
                ", Nutritional_value='" + Nutritional_value + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", text_specifics='" + text_specifics + '\'' +
                '}';
    }
}
