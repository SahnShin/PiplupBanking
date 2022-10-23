import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        PenguinBank.printRules();
        PenguinBank.parentAccount(console);
        PenguinBank.childAccount(console);

        double deposit = PenguinBank.getDeposit(console);
        double savings = 0.00;

        System.out.println("Child's Bank");
        System.out.printf("Current amount: $%.2f\n", deposit);
        System.out.println();

        String answer = StoreOption.storeProcess(deposit, savings);

        while(answer.equals("y")) {
            answer = StoreOption.storeProcess(deposit,savings);
            System.out.println("");
        }
    }
}