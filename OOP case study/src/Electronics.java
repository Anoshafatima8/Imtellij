public class Electronics extends Product {
    int power;
    int consumption;
    int warranty;
    public Electronics(String name,int stock_quantity,int price, int power, int consumption, int warranty) {
        this.name=name;
        this.stock_quantity=stock_quantity;
        this.price=price;
        this.power = power;
        this.consumption = consumption;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "power=" + power +
                ", consumption=" + consumption +
                ", warranty=" + warranty +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", text_specifics='" + text_specifics + '\'' +
                '}';
    }
}
