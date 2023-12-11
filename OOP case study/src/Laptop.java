public class Laptop extends Electronics {
    int ram;

    public Laptop(String name, int stock_quantity, int price, int power, int consumption, int warranty, int ram) {
        super(name, stock_quantity, price, power, consumption, warranty);
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", power=" + power +
                ", consumption=" + consumption +
                ", warranty=" + warranty +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", text_specifics='" + text_specifics + '\'' +
                '}';
    }
}
