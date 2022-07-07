package Pizza;
import java.util.Scanner;
public class CallCheese {
    public void callPizzaCheese() {
        Cheese p1 = new Cheese();
        System.out.println("Selected Cheese...");
        p1.PrintCheese();
    }
    public void PaymentCheese(){
        NameNumber nb = new NameNumber();
        PizzaPrice pp = new PizzaPrice();
        ConfirmBuy cb = new ConfirmBuy();

        System.out.println("""
                Select the form of payment...
                Money(1)
                Credit Card(2)""");
        Scanner pay = new Scanner(System.in);
        int pay1 = pay.nextInt();
        switch (pay1) {
            case 1 -> {
                float sum = pp.getPriceCheese() + pp.getPriceDelivery();
                System.out.println("Selected Money... "            + "\n" +
                        "Pizza Price: " + pp.getPriceCheese()      + "\n" +
                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                        "Total Value: " + sum);
                cb.CallConfirmBuy();
                if (cb.equals(true)) {
                    System.out.println("Invoice: " + "\n");
                    System.out.print("Client name: ");
                    nb.CallName();
                    System.out.print("Phone Number: ");
                    nb.CallNumber();
                    System.out.println(
                            "Pizza Price: " + pp.getPriceCheese()              + "\n" +
                                    "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                    "Total Value: " + sum + "\n--------------------");
                }}
            case 2 -> {
                float sum = pp.getPriceCheese() + pp.getPriceDelivery() + pp.getPriceCardInterest();
                System.out.println(" Selected Credit Card..."        + "\n" +
                        "Pizza Price: " + pp.getPriceCheese()        + "\n" +
                        "Delivery price: " + pp.getPriceDelivery()   + "\n" +
                        "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                        "Total Value: " + sum
                );
                cb.CallConfirmBuy();
                if (cb.equals(true)) {
                    System.out.println("Invoice: " + "\n");
                    System.out.print("Client name: "); nb.CallName();
                    System.out.print("Phone Number: "); nb.CallNumber();
                    System.out.println(
                            "Pizza Price: " + pp.getPriceCheese()        + "\n" +
                                    "Delivery price: " + pp.getPriceDelivery()   + "\n" +
                                    "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                                    "Total Value: " + sum                        + "\n" +
                                    "--------------------");
                }
            }
        }}
}