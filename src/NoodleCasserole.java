import java.util.List;

public class NoodleCasserole extends MensaBlockDish{
    public NoodleCasserole(){
        super("Noodle Casserole", 2.85, List.of(Ingredient.Pasta, Ingredient.Cream, Ingredient.Cheese, Ingredient.Eggs, Ingredient.Onions), 480);
    }

    @Override
    public void taste() {
        System.out.println("This dish is bad");
    }
}
