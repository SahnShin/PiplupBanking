import java.util.Scanner;

public class StoreOption {

    public static double petStoreProcess(String store, double deposit, double savings) {
        Scanner console = new Scanner(System.in);
        if (savings == 0) {
            System.out.println("You have no fish to spend. Go back and put some money into" +
                    " savings from the Real Store to buy items for your penguin!\n");
           return 0.00;
        } else {
            PenguinBank.printPetStore(console);
            String petItem = choosePetItem(console);
            return PenguinBank.petItemPrice(petItem);

        }
    }


    public static double depositAmount(double deposit,double itemPrice) {
        deposit = deposit - itemPrice;

        return deposit;
    }

    public static double savingsAmount(double savings, double itemPrice) {
        savings += itemPrice;
        return savings;
    }

    public static double fishAmount(double fish,double itemPrice) {
        return fish + (itemPrice * 100);
    }

    public static String chooseRealItem(Scanner console) {
        System.out.print("Which item would you like to buy? ");
        String item = console.next();
        System.out.println("");
        return item;
    }

    public static String choosePetItem(Scanner console) {
        System.out.print("Which item would you like to buy? ");
        String item = console.next();
        System.out.println("");
        return item;
    }




}
