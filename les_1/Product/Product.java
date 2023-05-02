package Product;


import javax.lang.model.type.NullType;

public class Product {
    
    
    private String Name;
    private int Price; 
    private int Quantity;
    private String UnOFMeasurement;

    

    /**
     * Описание
     * @param Name Наименование товара  
     * @param Price Цена
     * @param Quantity Количество
     * @param UnOFMeasurement Единица измерения
     */

    public Product( String inName, int inPrice, int inQuantity, String inUnOFMeasurement) { 
        Name = inName;
        Price = inPrice;
        Quantity = inQuantity;
        UnOFMeasurement = inUnOFMeasurement;
    }

    public void setName (String string) {
        this.Name = string;
    }

    public String getName  () {
        return Name;
    }

    public void setPrice (int inPrice) {
        this.Price = inPrice;
    }

    public int getPrice () {
        return Price;
    }

    public void setQuantity (int inQuantity) {
        this.Quantity = inQuantity;
    }

    public int getQuantity () {
        return Quantity;
    }

    public void setUnOFMeasurement(String string) {
        this.UnOFMeasurement = string;
    }

    public String getUnOFMeasurement  () {
        return UnOFMeasurement;
    }


    @Override
    public String toString() {
        return String.format("/ Наименование: %s / Цена: %d / Количество: %d / Единица измерения: %s", getName(), getPrice(), getQuantity(), getUnOFMeasurement());
    }
    //* return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);

}
