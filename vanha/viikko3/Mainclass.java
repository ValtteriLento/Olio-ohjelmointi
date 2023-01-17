package viikko3;

import java.util.Scanner;

public class Mainclass {
    
    public static void main(String[] args) {

        int choice = 1;
        int input;
        BottleDispenser dispenser = new BottleDispenser();
        Scanner scan = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("\n*** BOTTLE DISPENSER ***");
			System.out.println("1) Add money to the machine");
			System.out.println("2) Buy a bottle");
			System.out.println("3) Take money out");
			System.out.println("4) List bottles in the dispenser");
			System.out.println("0) End");
			System.out.print("Your choice: ");
			choice = scan.nextInt();

            if (choice == 1) {
				dispenser.addMoney();
			} else if (choice == 2) {
                dispenser.listBottles();
                System.out.print("Your choice: ");
				input = scan.nextInt();
				dispenser.buyBottle(input);
            } else if (choice == 3) {
				dispenser.returnMoney();
			} else if (choice == 4) {
				dispenser.listBottles();
			} else if (choice == 0) {
				scan.close();
			} else {
				System.out.println("Väärä valinta!");
			}
        }
    }
}