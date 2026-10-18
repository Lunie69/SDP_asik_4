public class MyInv {
    private int portions = 10;

    public boolean checkIngredients(int quantity) {
        return portions >= quantity;
    }

    public void useIngredients(int quantity) {
        portions -= quantity;
        System.out.println("Ingredients prepared.");
    }
}