package Product;

public class Hygiene extends Product {
    
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
