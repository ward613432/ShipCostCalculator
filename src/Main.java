import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0;
        double shippingCost = 0;

        System.out.println("What is the price of your purchase?");
        if (scanner.hasNextDouble()) {
            totalCost = scanner.nextDouble();

            if (totalCost >= 100) {
                System.out.println("Your purchase costs $" + totalCost + " so your shipping is free!");
            } else {
                shippingCost = totalCost * .02;
                System.out.println("Your purchase costs $" + totalCost + " so your shipping is $" + shippingCost);
            }
        }
        else {
            System.out.println("That isn't an answer.");
            System.exit(0);
        }
    }
}