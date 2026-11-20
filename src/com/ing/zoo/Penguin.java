package com.ing.zoo;

public class Penguin extends Animal implements Carnivore, Trickster {
    public String trick;

    public Penguin() {
    }

    @Override
    public void sayHello() {
        helloText = "tweak penguin";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "crunch crunch thank yee much";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        trick = "belly flops in the snow";
        System.out.println(trick);
    }
}
