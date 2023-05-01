package Product;


import javax.lang.model.type.NullType;

public class Product {
    
    
    private String name;
    private int price; 
    private int quantity;
    private String UnOFMeasurement;

    /**
     * Описание
     * @param name Наименование товара  
     * @param price Цена
     * @param quantity Количество
     * @param UnOFMeasurement Единица измерения
     */

    public Product() {

    }

    public void setName (String string) {
        this.name = string;
    }

    public String getName  () {
        return name;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public int getPrice () {
        return price;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity () {
        return quantity;
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
