package Pizza;

public class Pepperoni {
Ingredients ingredients = new Ingredients("Pepperoni, ","Flour, ","Ham");
 public void PrintPepperoni(){
     System.out.println("Ingredients: "+ingredients.getPepperoni()+ingredients.getFlour()+ingredients.getHam());
 }
}
