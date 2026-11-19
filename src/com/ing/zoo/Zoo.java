package com.ing.zoo;

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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        if (input.contains(commands.getFirst()) && input.contains(" ")) {
            String name = input.split(" ")[1];

            animals.stream()
                    .filter(animal -> animal.name.equals(name))
                    .findFirst()
                    .ifPresentOrElse(
                            Animal::sayHello,
                            () -> System.out.println("No animal found with name: " + name));

        } else if (input.contains(commands.getFirst())) {
            animals.forEach(Animal::sayHello);
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
