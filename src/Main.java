import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Lista med växter.
        List<Plants> plants = new ArrayList<>(); //Eller List<Waterable>?
        plants.add(new Cacti("Igge", 0.2));
        plants.add(new Palms("Laura", 5));
        plants.add(new CarnivorousPlants("Meatloaf", 0.7));
        plants.add(new Palms("Olof", 1));


        System.out.println("Tillgängliga växter: ");
        //Går igenom listan med en for loop.
        for (Plants plant : plants) {
            System.out.println(plant.getName());
        }

        Scanner scanner = new Scanner(System.in);
        //While loop för att hålla programmet igång.
        while (true) {
            System.out.println("\nVilken växt ska få vätska?");
            System.out.println("Skriv \"QUIT\" för att stänga programmet.");

            String input = scanner.nextLine();
            //Tar bort onödiga mellanslag innan och efter.
            String search = input.trim();

            //Stäng ner programmet.
            if (search.equalsIgnoreCase("QUIT")) {
                break;
            }

            //Felhantering, om man stoppar in en tom rad.
            if (search.isEmpty()) {
                System.out.println("Inmatning får inte vara tom.");
            }

            //Boolean för att se om plantan finns eller inte.
            boolean found = false;
            //Söker och skriver ut vad plantorna behöver om man skrivit namnet på den.
            for (Plants plant : plants) {
                if (plant.getName().equalsIgnoreCase(search)) {
                    //Använder polymorfism för att kalla rätt metod för calculateLiquid och liquidType
                    System.out.println("Plantan " + plant.getName() + " behöver " + plant.calculateLiquid() + " liter " + plant.liquidType() + ".");
                    found = true;
                }
            }
            //Om sökning inte matchar någon av plantorna.
            if (!found) {
                System.out.println("Det finns ingen planta med det namnet.");
            }
        }
    }
}