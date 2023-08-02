public enum Ingredient {
    Pasta ( "pasta" ),
    Potatoes ( "potatoes" ) ,
    Milk ( "milk" ) ,
    Cheese ( "cheese" ) ,
    Cream ( "cream" ),
    Onions ( "onions" ) ,
    Butter ( "butter" ) ,
    Eggs ( "eggs" ) ,
    Bacon ( "bacon") ,
    Garlic ( "garlic" );

    private String name ;

    Ingredient ( String name ) {
        this . name = name ;
    }

    public String toString () {
        return name ;
    }
}
