import java.util.List;

public class PotatoGratin extends MensaBlockDish{
    public PotatoGratin(){
        super("Potato Gratin", 3.35, List.of(Ingredient.Potatoes, Ingredient.Cream, Ingredient.Milk, Ingredient.Butter, Ingredient.Cheese, Ingredient.Garlic), 400);
    }

    @Override
    public void taste() {
        System.out.println("This dish is bery good");
    }
}
