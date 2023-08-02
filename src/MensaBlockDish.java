import java.util.List;

public class MensaBlockDish extends MensaDish{
    public int volume;

    protected MensaBlockDish(String name, double price, List <Ingredient> ingredients, int volume){
        super(name, price, ingredients);
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    @Override
    public void taste() {
    }    

    public void bite(){
        if(this.volume > 0){
            this.volume -= 18;
            if(this.volume <= 0){
                System.out.println("finished");
            }
        }
        else {
            System.out.println("cry");
        }

    }
}
