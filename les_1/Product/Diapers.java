package Product;

public class Diapers extends Children {

    private int Saze;
    private int minWeight;
    private int maxWeight;
    private String Type;
    private int Quantity_Pack; //количество в упаковке


    public Diapers(String inName, int inPrice, int inQuantity, String inUnOFMeasurement, int inQuantity_Pack, int inAge, String inHypoall, int inSaze, int inMinWeight, int inMaxWeight, String inType) {
        super(inName, inPrice, inQuantity, inUnOFMeasurement, inAge, inHypoall);
        this.Quantity_Pack = inQuantity_Pack;
        this.Saze = inSaze;
        this.minWeight = inMinWeight;
        this.maxWeight = inMaxWeight;
        this.Type = inType;

    }

    @Override
    public String toString() {
        return super.toString() + String.format(" / Размер: %d / Мин.Вес: %d / Макс.Вес: %d / Тип: %s / \nВ упаковке: %d шт.", Saze, minWeight, maxWeight, Type, Quantity_Pack );
    }
    
}
