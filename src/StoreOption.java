import java.util.Scanner;

public class StoreOption {
    public static String storeProcess(double deposit, double savings) {
        Scanner console = new Scanner(System.in);
        String store = PenguinBank.goToStore(console);

        while (!store.equals("R") && !store.equals("r") && !store.equals("P") && !store.equals("p")) {
            System.out.println("Invalid input, try again");
            store = console.next();
        }

        if (store.equals("R") || store.equals("r")) {
            PenguinBank.printRealStore();
            String realItem = PenguinBank.chooseRealItem(console);
            double realItemPrice = PenguinBank.realItemPrice(realItem, console);

            deposit = deposit - realItemPrice;
            savings = savings + (realItemPrice * Constants.FISH);
            System.out.printf("Remaining balance: $%.2f\n", deposit);
            System.out.printf("Remaining savings: <>< %.0f\n ", savings);
            System.out.print("Would you like to purchase again? (y/n): ");
            String answer = console.next();
            return answer;
        } else {

            if (savings == 0) {
                System.out.println("You have no fish to spend. Go back and put some money into" +
                        " savings from the Real Store to buy items for your penguin!\n");
                System.out.print("Would you like to purchase again? (y/n): ");
                String answer = console.next();
                return answer;

            } else {
                PenguinBank.printPetStore(console);
                String petItem = PenguinBank.choosePetItem(console);
                double petItemPrice = PenguinBank.petItemPrice(petItem);
                savings = savings - petItemPrice;
                System.out.printf("Remaining balance: $%.2f\n", deposit);
                System.out.printf("Remaining savings: $%.0f\n", savings);
                System.out.print("Would you like to purchase again? (y/n): ");
                String answer = console.next();
                return answer;
            }

        }
    }
}
