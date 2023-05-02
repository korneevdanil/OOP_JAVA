package Product;

public class Hygiene extends Product {
    
    public Hygiene(String inName, int inPrice, int inQuantity, String inUnOFMeasurement) {
        super(inName, inPrice, inQuantity, inUnOFMeasurement);
        //TODO Auto-generated constructor stub
    }

    private int quantity_Package; // Количество в упаковке

   
    public void setQuantity_Package (int qua) {
        this.quantity_Package = qua;
    }

    public int getQuantity_Package  () {
        return quantity_Package;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / В упаковке: %d штук", getQuantity_Package());
    }
    
}
