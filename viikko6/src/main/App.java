package main;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        Vehicle newVehicle = null;

        Storage storage = new Storage();

        while(!exit) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot, 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");

            if (sc.hasNext()) {
                int i = 0;
                int j = 0;
                try {
                    String stringInput = sc.nextLine();
                    i = Integer.parseInt(stringInput);

                    switch(i) {
                        case 1:
                            System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                            j = Integer.parseInt(sc.nextLine());
                            System.out.println("Anna kulkuneuvon valmistaja:");
                            String manufacturer = sc.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String model = sc.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            int maxSpeed = Integer.parseInt(sc.nextLine());
                            if (j == 1) {
                                newVehicle = new Car(manufacturer, model, maxSpeed);
                            } else if (j == 2) {
                                newVehicle = new Plane(manufacturer, model, maxSpeed);
                            } else if (j == 3) {
                                newVehicle = new Ship(manufacturer, model, maxSpeed);
                            } else {
                                System.out.println("Syöte oli väärä");
                            }
                            storage.addVehicle(newVehicle);
                            break;
                        case 2:
                            storage.listVehicles();
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            System.out.println("Kiitos ohjelman käytöstä.");
                            exit = true;
                            break;
                        default:
                            System.out.println("Syöte oli väärä");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Syöte oli väärä");
                }
            }
        }
        sc.close();
    }
}
