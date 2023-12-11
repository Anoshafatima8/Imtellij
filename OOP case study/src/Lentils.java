public class Lentils extends Grocery{
    String LentilType;

    public Lentils(String name, int stock_quantity, int price, int expiry, String nutritional_value, String lentilType) {
        super(name, stock_quantity, price, expiry, nutritional_value);
        LentilType = lentilType;
    }

    @Override
    public String toString() {
        return "Lentils{" +
                "LentilType='" + LentilType + '\'' +
                ", expiry=" + expiry +
                ", Nutritional_value='" + Nutritional_value + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", text_specifics='" + text_specifics + '\'' +
                '}';
    }
}
