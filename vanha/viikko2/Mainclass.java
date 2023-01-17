package viikko2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainclass {
    
    public static void main(String[] args) {

        String name = "";

        System.out.print("Give a name to the dog: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            name = br.readLine();
        } catch (IOException ex) {
            System.out.println("Virhe");
        }

        Dog dog = new Dog(name);
        dog.speak();
    }

}