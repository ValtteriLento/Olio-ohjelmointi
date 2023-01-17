package viikko2;

import java.util.Scanner;

public class Dog {

    private String name;
    Scanner sc = new Scanner(System.in);

    public Dog(String n) {
        name = n.trim();
        if (name.isEmpty() == true) {
            name = "Doge";
        }
        System.out.println("Hey, my name is " + name);
    }

    public void speak() {
        System.out.print("What does a dog say: ");
        while (sc.hasNext()) {
            if (sc.hasNextBoolean()) {
                System.out.println("Such boolean: " + sc.nextBoolean());
            } else if (sc.hasNextInt()) {
                System.out.println("Such integer: "+ sc.nextInt());
            } else {
                System.out.println(sc.next());
            }
        }
        sc.close();
    }

}