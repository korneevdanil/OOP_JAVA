package Product;

public class food extends Product {

    private String expiration_Date; //*Срок годности */

    public void setExpiration_Date (String string) {
        this.expiration_Date = string;
    }

    public String getExpiration_Date   () {
        return expiration_Date;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / Срок годности: %s", getExpiration_Date());
    }
    
}
