public class Chair extends Furniture{
    String colorOfChair;


    public Chair(String material, int dimensions, String colorOfChair,int price,int stock_quantity,String name) {
        super(material, dimensions);
        this.colorOfChair = colorOfChair;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "colorOfChair='" + colorOfChair + '\'' +
                ", material='" + material + '\'' +
                ", dimensions=" + dimensions +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", text_specifics='" + text_specifics + '\'' +
                '}';
    }
}
