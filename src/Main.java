import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        PenguinBank.printRules();
        PenguinBank.parentAccount(console);
        PenguinBank.childAccount(console);

        double deposit = PenguinBank.getDeposit(console);
        double savings = 0.00;
        double fish = 0.00;

        System.out.println("\nChild's Bank");
        System.out.printf("Current amount: $%.2f\n", deposit);
        System.out.println();


        String answer = "y";

        do {
            String store = PenguinBank.goToStore(console);
            while (!store.equalsIgnoreCase("R") && !store.equalsIgnoreCase("P")) {
                System.out.print("Invalid input, try again: ");
                store = console.next();
            }

            if (store.equalsIgnoreCase("R")){
                PenguinBank.printRealStore();
                String item = StoreOption.chooseRealItem(console);
                double realItemPrice = PenguinBank.realItemPrice(item, console);;
                deposit = StoreOption.depositAmount(deposit,realItemPrice);

                if (item.equalsIgnoreCase("Savings")) {
                    savings = StoreOption.savingsAmount(savings,realItemPrice);
                    fish = StoreOption.fishAmount(fish,realItemPrice);
                }
            } else {
                double petItemPrice = StoreOption.petStoreProcess(store,deposit,savings);
                deposit = StoreOption.depositAmount(deposit,petItemPrice);
                savings = StoreOption.savingsAmount(savings,petItemPrice);

            }
            System.out.printf("Current Balance: $%.2f\n",deposit);
            System.out.printf("Current Savings: %.0f\n",savings);
            System.out.printf("Current fish <><: %.0f\n",fish);
            System.out.println("");

            System.out.print("Would you like to purchase again? (y/n): ");
            answer = console.next();
            System.out.println("");
        } while(answer.equalsIgnoreCase("y"));


    }
}