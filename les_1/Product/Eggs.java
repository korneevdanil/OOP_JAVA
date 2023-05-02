package Product;

public class Eggs extends food {
    
    private int Quantity_Pack; // Количество в упаковке

    public Eggs(String inName, int inPrice, int inQuantity, String inUnOFMeasurement, String inExpiration_Date, int inQuantity_Pack) {
        super(inName, inPrice, inQuantity, inUnOFMeasurement, inExpiration_Date);
        this.Quantity_Pack = inQuantity_Pack;
    }

    public void setQuantity_Pack (int inQuantity_Pack) {
        this.Quantity_Pack = inQuantity_Pack;
    }

    public int getQuantity_Pack  () {
        return Quantity_Pack;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / В упаковке: %d штук", getQuantity_Pack());
    }
}
