public class Product {
    int price;
    String name;
    int stock_quantity;
    String text_specifics;

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", text_specifics='" + text_specifics + '\'' +
                '}';
    }
}
