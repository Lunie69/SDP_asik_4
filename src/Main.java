public class Main {
    public static void main(String[] args) {
        CheremshaCafeFacade restaurant =
                new CheremshaCafeFacade();

        restaurant.placeOrder("Cheremsha", 3, 2500);
    }
}