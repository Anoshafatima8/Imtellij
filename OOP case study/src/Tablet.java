public class Tablet extends Electronics{
    Boolean longBatteryLife;


    public Tablet(String name, int stock_quantity, int price, int power, int consumption, int warranty, boolean b) {
        super(name, stock_quantity, price, power, consumption, warranty);
        this.longBatteryLife=longBatteryLife;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "longBatteryLife=" + longBatteryLife +
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
