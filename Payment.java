public class Payment {
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment!");
            return false;
        }

        System.out.println("Payment accepted: " + amount + " KZT");
        return true;
    }
}