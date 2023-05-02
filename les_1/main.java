
import Product.food;
import Product.Children;
import Product.Drinks;
import Product.Hygiene;

public class main {

    public static void main(String[] args) {

        food Apple = new food("Яблоки", 50, 1, "Кг");
        Apple.setExpiration_Date ("23.08.2023");
        System.out.println(Apple.toString());

        Drinks Pepsi = new Drinks("Pepsi", 50, 1, "Тара", (float) 2.0);
        System.out.println(Pepsi.toString());

        Hygiene Soap = new Hygiene("Мыло", 10, 1, "Упаковка");
        Soap.setQuantity_Package(10);
        System.out.println(Soap.toString());

        Children Mixture = new Children("Nan", 900, 1, "Банка");
        Mixture.setAge(6);
        Mixture.setHypoall("Yes");
        System.out.println(Mixture.toString());


    }
    
}
