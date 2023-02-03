package main;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Animal> animals;
    
    public Zoo(String name) {
        this.name = name;

        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals() {
        System.out.println(name + " pitää sisällään seuraavat eläimet:");
        for(Animal animal : animals) {
            System.out.println(animal.getSpecies() + ": " + animal.getName() + ", " + animal.getAge() + " vuotta");
        }
    }

    public void runAnimals(int rounds) {
        for(Animal animal : animals) {
            for (int i = 0; i < rounds; i++) {
                System.out.println(animal.getName() + " juoksee kovaa vauhtia!");
            }
        }
    }
}
