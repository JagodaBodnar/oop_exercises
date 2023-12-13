package exercise2;
public class Main {
    public static void main(String[] args) {
        Drink drink1 = Bartender.createDrink("pineapple juice", 100, "malibu liqueur", 50, "coconut milk", 100);
        Bartender.printDrink(drink1);
    }
}