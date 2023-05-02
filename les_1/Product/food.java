package Product;

public class food extends Product {

    private String Expiration_Date; //*Срок годности */

    public food(String inName, int inPrice, int inQuantity, String inUnOFMeasurement, String inExpiration_Date) {
        super(inName, inPrice, inQuantity, inUnOFMeasurement);
        this.Expiration_Date = inExpiration_Date;
    }


    public void setExpiration_Date (String string) {
        this.Expiration_Date = string;
    }

    public String getExpiration_Date   () {
        return Expiration_Date;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / Срок годности: ДО %s", getExpiration_Date());
    }
    
}
