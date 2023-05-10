package iclass;

import iinterface.iPetAnimal;

public abstract class PetAnimal extends Animal implements iPetAnimal{

    private String Nickname;
    private String Breed; //порода
    private String Vaccinations;
    private String CoatColor; //цвет шерсти
    private String BirfData;

    public PetAnimal(int inHeight, int inWeight, String inEyeColor, String inNickname, String inBreed, 
    String inVaccinations, String inCoatColor, String inBirfDate) {
        super(inHeight, inWeight, inEyeColor);
        this.Nickname = inNickname;
        this.Breed = inBreed;
        this.Vaccinations = inVaccinations;
        this.CoatColor = inCoatColor;
        this.BirfData = inBirfDate;
        //TODO Auto-generated constructor stub
    }

    String getNickname() {
        return Nickname;
    }

    String getBreed() {
        return Breed;
    }

    String getVaccinations() {
        return Vaccinations;
    }

    String getCoatColor() {
        return CoatColor;
    }

    String getBirfDate() {
        return BirfData;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("/ Кличка: %s / Порода: %s / День рождения: %s / Цвет шерсти: %s /", getNickname(), getBreed(), getBirfDate(), getCoatColor()) + super.toString() + String.format("/ Статус прививки: %s /", getVaccinations());
    }

    @Override
    public void Affection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Affection'");
    }

    @Override
    public void getVoice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVoice'");
    }
    
}
