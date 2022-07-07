package Pizza;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        NameNumber nb = new NameNumber();
        CallPortuguese a = new CallPortuguese();
        CallPeperoni b = new CallPeperoni();
        CallCheese c = new CallCheese();

        Portuguese p1 = new Portuguese();
        Pepperoni p2 = new Pepperoni();
        Cheese p3 = new Cheese();

        System.out.println(
                "Welcome to Sam's Pizzeria! \n " +
                        "Please digit your name and number to proceed the buy... \n ");
        nb.CallNameNumber();
        System.out.println("How many flavors of pizza? ");
        Scanner fv = new Scanner(System.in);
        int vf = fv.nextInt();

        switch (vf) {
            case 1 -> {
                System.out.println("""
                        ____________________________ \n
                        Choose your Pizza flavor:\s
                        tap 0 to Cancel!!!\s
                        1- Portuguese 2- Pepperoni 3- Cheese
                        """);
                Scanner sc0 = new Scanner(System.in);
                int esc = sc0.nextInt();
                switch (esc) {
                    case 1 -> {
                        a.callPizzaPortuguese();
                        a.PaymentPortuguese();
                    }
                    case 2 -> {
                        b.callPizzaPepperoni();
                        b.PaymentPepperoni();
                    }
                    case 3 -> {
                        c.callPizzaCheese();
                        c.PaymentCheese();
                    }
                }
            }
            case 2 -> {
                System.out.println("""
                        ____________________________ \n
                        Choose your Pizza flavor one:\s
                        tap 0 to Cancel!!!\s
                        1- Portuguese 2- Pepperoni 3- Cheese
                        """);
                Scanner pz1 = new Scanner(System.in);
                int esc = pz1.nextInt();

                System.out.println("""
                        ____________________________ \n
                        Choose your Pizza flavor two:\s
                        tap 0 to Cancel!!!\s
                        1- Portuguese 2- Pepperoni 3- Cheese
                        """);
                Scanner pz2 = new Scanner(System.in);
                int esc2 = pz2.nextInt();
                if (esc == 1 && esc2 == 2) {
                    System.out.println("Selected Portuguese and Pepperoni...");
                    p1.PrintPortuguese();
                    p2.PrintPepperoni();
                    b.PaymentPepperoni();
                }
                if (esc == 1 && esc2 == 3) {System.out.println("Selected Portuguese and Cheese...");
                    p1.PrintPortuguese();
                    p3.PrintCheese();
                    a.PaymentPortuguese();
                }
                if (esc == 2 && esc2 == 1) {System.out.println("Selected Pepperoni and Portuguese...");
                    p2.PrintPepperoni();
                    p1.PrintPortuguese();
                    b.PaymentPepperoni();
                }
                if (esc == 2 && esc2 == 3) {System.out.println("Selected Pepperoni and Cheese...");
                    p2.PrintPepperoni();
                    p3.PrintCheese();
                    b.PaymentPepperoni();
                }
                if (esc == 3 && esc2 == 1) {System.out.println("Selected Cheese and Portuguese");
                    p3.PrintCheese();
                    p1.PrintPortuguese();
                    a.PaymentPortuguese();
                }
                if (esc == 3 && esc2 == 2) {System.out.println("Selected Cheese and Pepperoni");
                    p3.PrintCheese();
                    p2.PrintPepperoni();
                    b.PaymentPepperoni();
                }
            }
        }
    }
}