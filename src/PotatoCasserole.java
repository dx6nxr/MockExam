import java.util.List;

public class PotatoCasserole extends MensaBlockDish{
    public PotatoCasserole(){
        super("Potato Casserole", 3.15, List.of(Ingredient.Potatoes, Ingredient.Onions, Ingredient.Milk, Ingredient.Eggs), 440);
    }

    @Override
    public void taste() {
        System.out.println("This dish is good");
    }
}
