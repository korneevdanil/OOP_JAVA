package iclass;

import iinterface.iAnimal;

public abstract class Animal implements iAnimal {
    
    private int height; // рост
    private int weight; // вес
    private String eyeColor; //цвет глаз

    public Animal(int inHeight, int inWeight, String inEyeColor) {
        this.height = inHeight;
        this.weight = inWeight;
        this.eyeColor = inEyeColor;

    }

    int getHeight() {
        return height;
    }

    int getWeight() {
        return weight;
    }

    String getEyeColor() {
        return eyeColor;
    }

    @Override
    public String toString() {
        return String.format("/ Рост: %d см / Вес: %d кг / Цвет глаз: %s /", getHeight(), getWeight(), getEyeColor());
    }

}
