public class Smartphone extends Electronics{
    int touchScreenInterface;

    public Smartphone(String name, int stock_quantity, int price, int power, int consumption, int warranty, boolean b) {
        super(name, stock_quantity, price, power, consumption, warranty);
        this.touchScreenInterface=touchScreenInterface;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "touchScreenInterface=" + touchScreenInterface +
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
