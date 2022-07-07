package Pizza;
import java.util.Scanner;
public class CallPortuguese {
    public void callPizzaPortuguese() {
        Portuguese p1 = new Portuguese();
        System.out.println("Selected Portuguese...");
        p1.PrintPortuguese();
    }
    public void PaymentPortuguese(){
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
                float sum = pp.getPricePortuguese() + pp.getPriceDelivery();
                System.out.println("Selected Money... "              + "\n" +
                        "Pizza Price: " + pp.getPricePortuguese()    + "\n" +
                        "Delivery price: " + pp.getPriceDelivery()   + "\n" +
                        "Total Value: " + sum);
                cb.CallConfirmBuy();
                if (cb.equals(true)) {
                    System.out.println("Invoice: "+ "\n" );
                    System.out.print("Client name: "); nb.CallName();
                    System.out.print("Phone Number: "); nb.CallNumber();
                    System.out.println(
                            "Pizza Price: " + pp.getPricePortuguese()     + "\n" +
                                    "Delivery price: " + pp.getPriceDelivery()   + "\n" +
                                    "Total Value: " + sum + "\n--------------------");
                }}
            case 2 -> {
                float sum = pp.getPricePortuguese() + pp.getPriceDelivery() + pp.getPriceCardInterest();
                System.out.println(" Selected Credit Card..." + "\n" +
                        "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                        "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                        "Total Value: " + sum
                );
                cb.CallConfirmBuy();
                if (cb.equals(true)) {
                    System.out.println("Invoice: " + "\n");
                    System.out.print("Client name: "); nb.CallName();
                    System.out.print("Phone Number: "); nb.CallNumber();
                    System.out.println(
                            "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                                    "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                    "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                                    "Total Value: " + sum + "\n" +
                                    "--------------------");
                }
            }
        }
    }
}