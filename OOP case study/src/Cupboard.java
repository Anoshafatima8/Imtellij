public class Cupboard extends Furniture{
    String ColorOfCupboard;

    public Cupboard(String material, int dimensions, String colorOfCupboard,int price,String name,int stock_quantity) {
        super(material, dimensions);
        ColorOfCupboard = colorOfCupboard;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "ColorOfCupboard='" + ColorOfCupboard + '\'' +
                ", material='" + material + '\'' +
                ", dimensions=" + dimensions +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", text_specifics='" + text_specifics + '\'' +
                '}';
    }
}
