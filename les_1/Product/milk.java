package Product;

public class milk extends food {

    private Float Fatness;

    public milk(String inName, int inPrice, int inQuantity, String inUnOFMeasurement, String inExpiration_Date, Float inFatness) {
        super(inName, inPrice, inQuantity, inUnOFMeasurement, inExpiration_Date);
        this.Fatness = inFatness;
    }

    public void setFatness (Float inFatness) {
        this.Fatness = inFatness;
    }

    public Float getFatness () {
        return Fatness;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / Жирность: %.2f процент(а)", getFatness());
    }
    
}
