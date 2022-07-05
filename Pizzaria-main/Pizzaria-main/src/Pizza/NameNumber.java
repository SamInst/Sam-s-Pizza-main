package Pizza;
import java.util.Scanner;
public class NameNumber {
    static String name;
    static Long number;
    public static void CallNameNumber() {
        System.out.println("Your name: ");
        Scanner sc4 = new Scanner(System.in);
        name = sc4.nextLine();

        System.out.println("You number: ");
        Scanner sc3 = new Scanner(System.in);
        number = sc3.nextLong();
    }
    public void CallName(){
        System.out.println(name);
    }
    public void CallNumber(){
        System.out.println(number);
    }
    }

