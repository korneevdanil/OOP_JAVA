package Product;

public class Children extends Product {

    public Children(String inName, int inPrice, int inQuantity, String inUnOFMeasurement) {
        super(inName, inPrice, inQuantity, inUnOFMeasurement);
        //TODO Auto-generated constructor stub
    }

    /** Минимальный возраст */
    private int minAge;
    private String Hypoallergenic;

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
            String No = "No";
            return No;
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / Минимальный возраст: %d+ Месяцев / Гипоаллергенность: %s", getAge(), getHypoall());
    }


}
