package Pizza;
import java.util.Scanner;
public class ConfirmBuy {
    public void CallConfirmBuy() {
        String lt;
        do {
            System.out.println("Confirm the buy?? [y/n]");
            Scanner y = new Scanner(System.in);
            lt = y.nextLine();
            if (lt.equals("y") || lt.equals("Y")) {
                System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
            } else if (lt.equals("n") || lt.equals("N")) {
                System.out.println("Order Canceled, Please Return to beginning");}
            } while (!lt.equals("y") && !lt.equals("Y") && !lt.equals("n") && !lt.equals("N"));
        }
    }