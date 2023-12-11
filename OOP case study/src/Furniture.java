public class Furniture extends Product{
    String material;
    int dimensions;

    public Furniture(String material, int dimensions) {
        this.material = material;
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", dimensions=" + dimensions +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", text_specifics='" + text_specifics + '\'' +
                '}';
    }
}
