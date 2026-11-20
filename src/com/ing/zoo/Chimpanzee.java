package com.ing.zoo;

public class Chimpanzee extends Animal implements Herbivore, Carnivore, Trickster {
    public String trick;

    public Chimpanzee() {
    }

    @Override
    public void sayHello() {
        helloText = "oo oo aa aa";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "eating meat";
        System.out.println(eatText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munching on leaves";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        trick = "swings from tree to tree into backflip";
        System.out.println(trick);
    }
}
