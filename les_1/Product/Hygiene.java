package Product;

public class Hygiene extends Product {

    private int Quantity_Pack; // Количество в упаковке
    
    public Hygiene(String inName, int inPrice, int inQuantity, String inUnOFMeasurement, int inQuantity_Pack) {
        super(inName, inPrice, inQuantity, inUnOFMeasurement);
        this.Quantity_Pack = inQuantity_Pack;
    }

    public void setQuantity_Pack (int qua) {
        this.Quantity_Pack = qua;
    }

    public int getQuantity_Pack  () {
        return Quantity_Pack;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / В упаковке: %d штук", getQuantity_Pack());
    }
    
}
