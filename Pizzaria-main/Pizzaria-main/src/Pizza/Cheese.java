package Pizza;

public class Cheese {
    Ingredients ingredients = new Ingredients("cheese","egg");

    public void PrintCheese(){
        System.out.println("Ingredients: "+
        ingredients.getCheese()+ " "+
        ingredients.getEgg());
    }
}
