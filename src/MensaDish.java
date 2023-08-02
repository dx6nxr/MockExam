import java.util.LinkedList;
import java.util.List;

public abstract class MensaDish {
    protected List <Ingredient> ingredients = new LinkedList<>();
    protected double price ;
    protected String name ;

    protected MensaDish ( String name , double price ,
        List <Ingredient> ingredients ) {
            this.name = name;
            this.price = price;
            this.ingredients.addAll ( ingredients );
    }

 // should print how tasty the dish is
    public abstract void taste ();

    public double getPrice () {
        return this.price ;
    }

    public void eat () {
        System.out.println(" eating " + name);
    }

    public String printIngredients () {
        String result = "";
        for (Ingredient i : ingredients){
            result += i.toString() + ", ";
        }
        return result;
    }
}