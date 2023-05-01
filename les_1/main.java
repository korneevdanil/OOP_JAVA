
import Product.food;
import Product.Drinks;
import Product.Hygiene;

public class main {

    public static void main(String[] args) {

        food Apple = new food();

        Apple.setExpiration_Date ("23.08.2023");
        Apple.setName("Яблоко");
        Apple.setPrice(65);
        Apple.setQuantity(1);
        Apple.setUnOFMeasurement("КГ");

        System.out.println(Apple.toString());

        Drinks Pepsi = new Drinks();
        Pepsi.setName("Pepsi");
        Pepsi.setPrice(50);
        Pepsi.setQuantity(0);
        Pepsi.setVolume((double) 2.0);
        Pepsi.setQuantity(1);
        Pepsi.setUnOFMeasurement("Литр");

        System.out.println(Pepsi.toString());

        Hygiene Soap = new Hygiene();

        Soap.setName("Мыло");
        Soap.setQuantity_Package(10);
        Soap.setUnOFMeasurement("Упаковка");
        Soap.setQuantity(1);

        System.out.println(Soap.toString());

    }
    
}
