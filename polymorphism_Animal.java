package com.example.deniz.polymorphism;

public class Animal {




    private String animalName;
    private String animalColor;
    private int animalSpeed;
    private int animalPower;

    public Animal(String animalName, String animalColor, int animalSpeed, int animalPower){

        if (animalPower <= 0){
            throw new IllegalArgumentException("The power must be more than 0");

        }
        if(animalSpeed <= 0){
            throw new IllegalArgumentException("The speed must be more than 0");

        }


        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalPower = animalPower;
        this.animalSpeed = animalSpeed;


    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    public void setAnimalSpeed(int animalSpeed) {
        this.animalSpeed = animalSpeed;
    }

    public int getAnimalPower() {
        return animalPower;
    }

    public void setAnimalPower(int animalPower) {
        this.animalPower = animalPower;
    }

    public int calculateTheOveralPowerOfAnimal(){

        return getAnimalPower() * getAnimalSpeed();

    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s%n%s: %d%n%s: %d",
                "Animal Name", getAnimalName(), "Animal Color",
                    getAnimalColor(), "Animal Power", getAnimalPower(),
                        "Animal Speed", getAnimalSpeed());
    }
}
