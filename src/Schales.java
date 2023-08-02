import java.util.List;

public class Schales extends MensaBlockDish{
    public Schales(){
        super("Schales", 3.45, List.of(Ingredient.Potatoes, Ingredient.Bacon, Ingredient.Eggs), 450);
    }

    @Override
    public void taste() {
        System.out.println("This dish is edible");
    }
}
