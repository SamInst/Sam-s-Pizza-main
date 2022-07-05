package Pizza;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        PizzaPrice pp = new PizzaPrice();
        NameNumber nb = new NameNumber();

        System.out.println(
                "Welcome to Sam's Pizzeria! \n " +
                        "Please digit your name and number to proceed the buy... \n ");
        nb.CallNameNumber();
        System.out.println("How many flavors of pizza? ");
        Scanner fv = new Scanner(System.in);
        int vf = fv.nextInt();

        switch (vf){
            case 1 ->{
        System.out.println("""
                ____________________________ \n
                Choose your Pizza flavor:\s
                tap 0 to Cancel!!!\s
                1- Portuguese 2- Pepperoni 3- Cheese
                """);
        CallPortuguese a = new CallPortuguese();
        CallPeperoni b = new CallPeperoni();
        CallCheese c = new CallCheese();

        Scanner sc0 = new Scanner(System.in);
        int esc = sc0.nextInt();
        switch (esc) {
            case 1 -> {a.callPizzaPortuguese();}
            case 2 -> {b.callPizzaPepperoni();}
            case 3 -> {c.callPizzaCheese();}
        }
    }
            case 2 ->{
                System.out.println("""
                ____________________________ \n
                Choose your Pizza flavor one:\s
                tap 0 to Cancel!!!\s
                1- Portuguese 2- Pepperoni 3- Cheese
                """);
                Scanner pz1 = new Scanner(System.in);
                int esc = pz1.nextInt();
                switch (esc){
                    case  1 -> {Portuguese a = new Portuguese();
                    a.PrintPortuguese();}
                    case  2 -> {Pepperoni a = new Pepperoni();
                        a.PrintPepperoni();}
                    case  3 -> {Cheese a = new Cheese();
                        a.PrintCheese();}
                    default -> {System.out.println("Invalid Number");}
                }
                System.out.println("""
                ____________________________ \n
                Choose your Pizza flavor two:\s
                tap 0 to Cancel!!!\s
                1- Portuguese 2- Pepperoni 3- Cheese
                """);

                Scanner pz2 = new Scanner(System.in);
                int esc2 = pz2.nextInt();
                switch (esc2){
                    case  1 -> {Portuguese a = new Portuguese();
                        a.PrintPortuguese();}
                    case  2 -> {Pepperoni a = new Pepperoni();
                        a.PrintPepperoni();}
                    case  3 -> {Cheese a = new Cheese();
                        a.PrintCheese();}
                    default -> {System.out.println("Invalid Number");}
                }
                System.out.println("Selected: "+ esc +" and "+esc2);
            }
            default -> {System.out.println("We don't make more than 2 flavors ... Sorry :/");}
    }}}