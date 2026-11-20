package com.ing.zoo;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.Chimpanzee;
import com.ing.zoo.animals.Hippo;
import com.ing.zoo.animals.Lion;
import com.ing.zoo.animals.Penguin;
import com.ing.zoo.animals.Pig;
import com.ing.zoo.animals.Tiger;
import com.ing.zoo.animals.Zebra;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Trickster;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("hello");
        commands.add("give leaves");
        commands.add("give meat");
        commands.add("perform trick");

        ArrayList<Animal> animals = new ArrayList<>();
        Animal henk = new Lion();
        henk.name = "henk";
        animals.add(henk);
        Animal elsa = new Hippo();
        elsa.name = "elsa";
        animals.add(elsa);
        Animal dora = new Pig();
        dora.name = "dora";
        animals.add(dora);
        Animal wally = new Tiger();
        wally.name = "wally";
        animals.add(wally);
        Animal marty = new Zebra();
        marty.name = "marty";
        animals.add(marty);
        Animal pingu = new Penguin();
        pingu.name = "pingu";
        animals.add(pingu);
        Animal chimpChamp = new Chimpanzee();
        chimpChamp.name = "chimp champ";
        animals.add(chimpChamp);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        // Split input into command and name if input has whitespace, filter then on name.
        // If name is found, say hello to that animal, else say no animal found with name.
        if (input.contains(commands.getFirst()) && input.contains(" ")) {
            String name = input.split(" ", 2)[1];

            animals.stream()
                    .filter(animal -> animal.name.equals(name))
                    .findFirst()
                    .ifPresentOrElse(
                            Animal::sayHello,
                            () -> System.out.println("No animal found with name: " + name));

        } else if (input.equals(commands.getFirst())) {
            // Say hello to all animals
            animals.forEach(Animal::sayHello);
        } else if (input.equals(commands.get(1))) {
            // Give leaves to all herbivores
            animals.forEach(animal -> {
                if (animal instanceof Herbivore) {
                    ((Herbivore) animal).eatLeaves();
                }
            });
        } else if (input.equals(commands.get(2))) {
            // Give meat to all carnivores
            animals.forEach(animal -> {
                if (animal instanceof Carnivore) {
                    ((Carnivore) animal).eatMeat();
                }
            });
        } else if (input.equals(commands.getLast())) {
            // Perform trick for all animals that can perform tricks
            animals.forEach(animal -> {
                if (animal instanceof Trickster) {
                    ((Trickster) animal).performTrick();
                }
            });
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
