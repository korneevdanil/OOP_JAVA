
import Product.food;
import Product.milk;
import Product.Bread;
import Product.Children;
import Product.Diapers;
import Product.Drinks;
import Product.Eggs;
import Product.Hygiene;
import Product.Limonad;
import Product.Nipple;
import Product.Toilet_paper;

public class main {

    public static void main(String[] args) {

        food Apple = new food("Яблоки", 50, 1, "Кг", "23.10.2023");
        System.out.println(Apple.toString());

        Drinks Pepsi = new Drinks("Pepsi", 50, 1, "Бутылка", (float) 2.0);
        System.out.println(Pepsi.toString());

        Hygiene Soap = new Hygiene("Мыло", 10, 1, "Упаковка", 10);
        System.out.println(Soap.toString());

        Children Mixture = new Children("Смесь 'Nan'", 900, 1, "Банка", 6, "Yes");
        System.out.println(Mixture.toString());

        milk iceMilk = new milk("Молоко 'АисМилк'", 80, 1, "Литр", "25.05.2023", (float) 3);
        System.out.println(iceMilk.toString());

        Limonad Fanta = new Limonad("Fanta", 100, 1, "Бутылка", (float) 2);
        System.out.println(Fanta.toString());

        Bread Borodin = new Bread("Бородинский", 45, 1, "шт", "05.05.2023", "Пшеничная");
        System.out.println(Borodin.toString());

        Eggs Love = new Eggs("Яйца 'Любимые' ", 58, 1, "Упаковка", "25.05.2023", 10);
        System.out.println(Love.toString());

        Toilet_paper tPaper = new Toilet_paper("Туалетная бумага 'Zewa'", 400, 1, "Упаковка", 8, 4);
        System.out.println(tPaper.toString());

        Diapers Pampers = new Diapers("Pampers", 1000, 1, "Упаковка", 8, 0, "Yes", 4, 8, 12, "Трусики");
        System.out.println(Pampers.toString());

        Nipple iNip = new Nipple("Соска 'Philips Cids'", 100, 1, "Штука", 8, "No");
        System.out.println(iNip.toString());


    }
    
}
