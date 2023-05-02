package Product;

public class Toilet_paper extends Hygiene {

    private int Quantity_Layer; //количество слоёв 

    public Toilet_paper(String inName, int inPrice, int inQuantity, String inUnOFMeasurement, int inQuantity_Pack, int inQuantity_Layer) {
        super(inName, inPrice, inQuantity, inUnOFMeasurement, inQuantity_Pack);
        this.Quantity_Layer = inQuantity_Layer;
    }

    public void setQuantity_Layer (int inQuantity_Layer) {
        this.Quantity_Layer = inQuantity_Layer;
    }

    public int getQuantity_Layer  () {
        return Quantity_Layer;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / Количестов слоёв: %d", getQuantity_Layer());
    }
    
}
