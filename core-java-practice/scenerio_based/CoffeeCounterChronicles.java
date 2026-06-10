import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter coffee type (Espresso, Latte, Cappuccino) or 'exit' to quit: ");
            String coffeeType = sc.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting the café!");
                break;
            }

            double price = 0;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 180;
                    break;

                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // consume newline

            double totalBill = price * quantity;
            double gst = totalBill * 0.18; // 18% GST
            double finalBill = totalBill + gst;

            System.out.println("\n----- BILL -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Amount      : ₹" + totalBill);
            System.out.println("GST (18%)   : ₹" + gst);
            System.out.println("Final Bill  : ₹" + finalBill);
            System.out.println("----------------\n");
        }

        sc.close();
    }
}