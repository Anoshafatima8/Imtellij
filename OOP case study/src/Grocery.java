public class Grocery extends Product{
    int expiry;
    String Nutritional_value;

    public Grocery(String name, int stock_quantity,int price,int expiry, String nutritional_value) {
        this.name=name;
        this.Nutritional_value=Nutritional_value;
        this.price=price;
        this.expiry = expiry;
        Nutritional_value = nutritional_value;
    }

    @Override
    public String toString() {
        return "Grocery{" +
                "expiry=" + expiry +
                ", Nutritional_value='" + Nutritional_value + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", text_specifics='" + text_specifics + '\'' +
                '}';
    }
}
