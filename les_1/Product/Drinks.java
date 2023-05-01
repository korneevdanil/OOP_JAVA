package Product;


public class Drinks extends Product {

    private Double Volume; //* Объём */

    /**
     * 
     * @param Volume Объём
     */

    public void setVolume (Double vlm) {
        this.Volume = vlm;
    }

    public Double getVolume () {
        return Volume;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / Объём: %f", getVolume());
    }
    
}
