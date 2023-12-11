public class Table extends Furniture{
    String ColorOfTable;

    public Table(String material, int dimensions, String colorOfTable,int price,String name,int stock_quantity) {
        super(material, dimensions);
        ColorOfTable = colorOfTable;
    }

    @Override
    public String toString() {
        return "Table{" +
                "ColorOfTable='" + ColorOfTable + '\'' +
                ", material='" + material + '\'' +
                ", dimensions=" + dimensions +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", text_specifics='" + text_specifics + '\'' +
                '}';
    }
}
