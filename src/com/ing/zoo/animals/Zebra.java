package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Herbivore;

public class Zebra extends Animal implements Herbivore {

    public Zebra() {
    }

    @Override
    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
