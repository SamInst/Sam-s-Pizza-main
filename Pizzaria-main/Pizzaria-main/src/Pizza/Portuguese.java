package Pizza;
public class Portuguese {
    Ingredients ingredients = new Ingredients("Tomato, ","Cheese, ","Egg, ","Ham");
 public  void PrintPortuguese(){
     System.out.println("Ingredients: "+ingredients.getTomato()+ingredients.getCheese()+ingredients.getEgg()+
             ingredients.getHam());
 }
}