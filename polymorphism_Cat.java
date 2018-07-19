package com.example.deniz.polymorphism;

public class Cat extends Animal {

    public Cat(String animalName, String animalColor, int power, int speed){

        super(animalName, animalColor, speed, power);


    }

    @Override
    public int calculateTheOveralPowerOfAnimal(){
        return super.calculateTheOveralPowerOfAnimal();

    }

    @Override
    public String toString(){

        return "Cat: " + super.toString();
    }
}
