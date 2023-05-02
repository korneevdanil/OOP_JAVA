package Product;

public class Bread extends food {

    private String Flour; // тип муки

    public Bread(String inName, int inPrice, int inQuantity, String inUnOFMeasurement, String inExpiration_Date, String inFlour) {
        super(inName, inPrice, inQuantity, inUnOFMeasurement, inExpiration_Date);
        this.Flour = inFlour;
    }

    public void setFlour (String inFlour) {
        this.Flour = inFlour;
    }

    public String getFlour   () {
        return Flour;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / Тип муки: %s", getFlour());
    }
    
}
