public class CheremshaCafeFacade {
    private MyInv inventory = new MyInv();
    private Kitchen kitchen = new Kitchen();
    private Payment payment = new Payment();
    private Delivery delivery = new Delivery();

    public void placeOrder(String dish, int quantity, double price) {
        if (!inventory.checkIngredients(quantity)) {
            System.out.println("Not enough ingredients!");
            return;
        }

        double total = quantity * price;

        if (!payment.pay(total)) {
            return;
        }

        inventory.useIngredients(quantity);
        kitchen.cook(dish, quantity);
        delivery.pack(dish, quantity);

        System.out.println("Order completed!");
    }
}