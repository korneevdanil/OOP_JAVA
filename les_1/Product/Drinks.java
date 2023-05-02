package Product;


public class Drinks extends Product {

    private float Volume; //* Объём */
    
    public Drinks(String inName, int inPrice, int inQuantity, String inUnOFMeasurement, Float inVolume) {
        super(inName, inPrice, inQuantity, inUnOFMeasurement);
        this.Volume = (float) inVolume;
    }

    /**
     * 
     * @param Volume Объём
     */

     
    public void setVolume (float f) {
        this.Volume = f;
    }

    public float getVolume () {
        return Volume;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / Объём: %.2f Литра", getVolume());
    }
    
}
