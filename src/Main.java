public class Main {
    public static void main(String[] args) throws Exception {
        MensaBlockDish dish = new NoodleCasserole();
        for(int i = 0; i < 30; i++){
            dish.bite();
        }
        MensaBlockDish dish2 = new Schales();
        System.out.println(dish2.printIngredients());

        MensaBlockDish dish3 = new PotatoCasserole();
        dish3.taste();
    }
}
