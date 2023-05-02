package Product;

public class Children extends Product {

    private int minAge;
    private String Hypoallergenic;

    public Children(String inName, int inPrice, int inQuantity, String inUnOFMeasurement, int inAge, String inHypoall) {
        super(inName, inPrice, inQuantity, inUnOFMeasurement);
        this.minAge = inAge;
        this.Hypoallergenic = inHypoall;

    }

    public void setAge (int inAge) {
        this.minAge = inAge;
    }

    public int getAge () {
        return minAge;
    }

    public void setHypoall (String inHypoall) {
        this.Hypoallergenic = inHypoall;
    }

    public String getHypoall () {
        if (Hypoallergenic == "Yes") {
            String Yes = "Есть";
            return Yes;
        } else {
            String No = "Нет";
            return No;
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / Минимальный возраст: %d+ Месяцев / Гипоаллергенность: %s", getAge(), getHypoall());
    }


}
