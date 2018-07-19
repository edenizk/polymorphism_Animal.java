package com.example.deniz.polymorphism;

public class Lion extends Animal {


    private boolean canFight = true;
    private  int fightingPower;



    public Lion(String animalName, String animalColor, int power, int speed, boolean canFight, int fightingPower){

        super(animalName, animalColor, power, speed);

        if(fightingPower <= 0){

            throw new IllegalArgumentException("The fighting power must be more than 0");

        }

        this.canFight = canFight;
        this.fightingPower = fightingPower;

    }

    public boolean isCanFight() {
        return canFight;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    public int getFightingPower() {
        return fightingPower;
    }

    public void setFightingPower(int fightingPower) {
        this.fightingPower = fightingPower;
    }

    public int calculateTheOveralPowerOfAnimal(){

        return calculateTheOveralPowerOfAnimal() + getFightingPower();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %b%n%s:%d", super.toString(),
                    "Can Lion Fight?", isCanFight(), "The Fighting Power", getFightingPower());
    }
}
