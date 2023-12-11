public class Fruits extends Grocery {
    String fruitName;


    public Fruits(String name, int stock_quantity, int price, int expiry, String nutritional_value, String fruitName) {
        super(name, stock_quantity, price, expiry, nutritional_value);
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "fruitName='" + fruitName + '\'' +
                ", expiry=" + expiry +
                ", Nutritional_value='" + Nutritional_value + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", text_specifics='" + text_specifics + '\'' +
                '}';
    }
}
