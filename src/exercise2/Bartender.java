package exercise2;

public class Bartender {
    public static Drink createDrink(String ingredient1, double amount1, String ingredient2, double amount2, String ingredient3, double amount3) {
        Ingredient ing1 = new Ingredient(ingredient1, amount1);
        Ingredient ing2 = new Ingredient(ingredient2, amount2);
        Ingredient ing3 = new Ingredient(ingredient3, amount3);
        return new Drink(ing1, ing2, ing3);
    }
    public static void printDrink(Drink drink){
        double sumDrinks = drink.getIngredient1().getQuantity() +  drink.getIngredient2().getQuantity() + drink.getIngredient3().getQuantity();
        double prop1 =  drink.getIngredient1().getQuantity() / sumDrinks;
        double prop2 =  drink.getIngredient2().getQuantity() / sumDrinks;
        double prop3 =  drink.getIngredient3().getQuantity() / sumDrinks;
        System.out.printf("Ingredients: %s, %s, %s in proportions %.2f, %.2f, %.2f.Drink volume: %.2f ml.",
                drink.getIngredient1().getName(), drink.getIngredient2().getName(), drink.getIngredient3().getName(), prop1, prop2, prop3, sumDrinks);

    }
}
