import java.util.Scanner;

public class PenguinBank {

    public static void printRules() {
        System.out.println("Welcome to: Piplup Bank");
        System.out.println("Slogan"); //CHANGE

        System.out.println("Care for your penguin by adding to your savings!");
        System.out.println("You can deposit money to your child's account, ");
        System.out.println("and they can spend it on real products or items for their pet penguin");
        System.out.println("Set up your account today for your child and watch their knowledge in savings grow!\n");
    }

    /**
     * This method prompts for the parent's account info.
     * @param console Reads the user's input.
     */
    public static void parentAccount(Scanner console) {
        System.out.print("Enter username: ");
        String username = console.next();
        while (username.length() == 0) {
            System.out.println("No input, try again: ");
            username = console.next();
        }

        System.out.print("Enter password: ");
        String password = console.next();
        while (password.length() == 0) {
            System.out.println("No input, try again: ");
            password = console.next();
        }
        System.out.println("");
    }

    /**
     * This method prompts for the child's account info.
     * @param console Reads user's input.
     */
    public static void childAccount(Scanner console) {
        System.out.print("Enter username for your child: ");
        String username = console.next();
        while (username.length() == 0) {
            System.out.println("No input, try again: ");
            username = console.next();
        }

        System.out.print("Enter password for your child: ");
        String password = console.next();
        while (password.length() == 0) {
            System.out.println("No input, try again: ");
            password = console.next();
        }
        System.out.println("");
    }

    /**
     * This method prompts and returns the parent's desired amount in their child's account
     * @param console Reads the user's input.
     * @return double The amount in the child's account.
     */
    public static double getDeposit(Scanner console) {
        System.out.print("Enter deposit (between $5-100 inclusive): ");
        double deposit = console.nextDouble();
//Will throw error when attempting to type jfkdsjfkdls
        while (deposit < 5 || deposit > 100) {
            System.out.print("Invalid input, try again: ");
            deposit = console.nextDouble();
        }

        return deposit;
    }

    /**
     * This method prompts which store the child wants to go to.
     * @param console Reads user input.
     * @return String The character corresponding to the store the child wants to go to.
     */
    public static String goToStore(Scanner console) {
        System.out.println("Where do you want to go?");
        System.out.print("Real(R) or Penguin(P) Store: ");

        return(console.next());
    }

    /**
     *This method prints out all the options in the two stores.
     */
    public static void printRealStore() {
        System.out.println("");
        System.out.println("Real Store Items:");
        System.out.println("Games: $5.00");
        System.out.println("Drink: $7.00");
        System.out.println("Snack: $2.50");
        System.out.println("Book: $12.99");
        System.out.println("Apps: $3.99");
        System.out.println("Stationary: $9.54");
        System.out.println("Savings: (This money is converted to fish currency for your pet!)\n" +
                "($1.00 is equal to 100 fish!)\n");
    }

    public static void printPetStore(Scanner console) {
        System.out.println("Penguin Store Items:");
        System.out.print("Choose an item --> Small(s), Big(b), or Costumes(C): ");
        String item = console.next();

        if (item == "S" || item == "s"){
            System.out.println("Cost: 500 fish");
            System.out.println("Kite     Tophat     Briefcase     Soda\n");

        } else if (item == "B" || item == "b") {
            System.out.println("Cost: 2500 fish");
            System.out.println("Drumset     Bike\n");
        } else {
            System.out.println("Cost: 6000 fish");
            System.out.println("Luke-Skywalker     Darth-Vader      Robinhood     Angel     Devil\n");
        }

    }

    public static String chooseRealItem(Scanner console) {
        System.out.println("Which item would you like to buy? ");
        String item = console.next();
        return item;
    }

    public static double realItemPrice(String item, Scanner console) {

        if(item.equalsIgnoreCase("Games")) {
            return Constants.GAMES;
        } else if(item.equalsIgnoreCase("Drink")) {
            return Constants.DRINKS;
        } else if(item.equalsIgnoreCase("Snack")) {
            return Constants.SNACKS;
        } else if(item.equalsIgnoreCase("Book")) {
            return Constants.BOOK;
        } else if(item.equalsIgnoreCase("Apps")) {
            return Constants.APPS;
        } else if(item.equalsIgnoreCase("Stationary")) {
            return Constants.STATIONARY;
        } else {
            System.out.println("How much into savings?");
            double savings = console.nextDouble();
            return savings;
        }
    }

    public static String choosePetItem(Scanner console) {
        System.out.println("Which item would you like to buy? ");
        String item = console.next();
        return item;
    }


    public static double petItemPrice(String item) {
        if (item.equalsIgnoreCase("Kite")) {
            System.out.println(PenguinASCII.kite());
            return Constants.KITE;
        } else if (item.equalsIgnoreCase("Tophat")) {
            System.out.println(PenguinASCII.tophat());
            return Constants.TOPHAT;
        } else if (item.equalsIgnoreCase("Briefcase")) {
            System.out.println(PenguinASCII.briefcase());
            return Constants.BRIEFCASE;
        } else if (item.equalsIgnoreCase("Soda")) {
            System.out.println(PenguinASCII.soda());
            return Constants.SODA;
        } else if (item.equalsIgnoreCase("Drumset")) {
            System.out.println(PenguinASCII.drumset());
            return Constants.DRUMSET;
        } else if (item.equalsIgnoreCase("Bike")) {
            System.out.println(PenguinASCII.bike());
            return Constants.BIKE;
        } else if (item.equalsIgnoreCase("Luke-Skywalker")) {
            System.out.println(PenguinASCII.lukeSkywalker());
            return Constants.LUKE_SKYWALKER;
        } else if (item.equalsIgnoreCase("Darth-Vader")) {
            System.out.println(PenguinASCII.darthVader());
            return Constants.DARTH_VADER;
        } else if (item.equalsIgnoreCase("Robinhood")){
            System.out.println(PenguinASCII.robinhood());
            return Constants.ROBINHOOD;
        } else if (item.equalsIgnoreCase("Angel")) {
            System.out.println(PenguinASCII.angel());
            return Constants.ANGEL;
        } else {
            System.out.println(PenguinASCII.devil());
            return Constants.DEVIL;
        }
    }

}
