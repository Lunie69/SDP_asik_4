
# Cheremsha Cafe — Assignment 4 | SDP | Facade

## Classes

- **MyInv** — checks ingredient availability and updates the remaining portions.
- **Kitchen** — prepares the ordered dish.
- **Payment** — processes the payment.
- **Delivery** — packs the order and prepares it for pickup.
- **CheremshaCafeFacade** — coordinates all subsystem classes through one simple method.
- **Main** — runs the program and places an order using the Facade.

## How It Works

The client calls the `placeOrder()` method of `CheremshaCafeFacade`.
The Facade checks ingredient availability, processes the payment, updates the inventory, prepares the dish, and packs the order.
The client does not need to interact with the subsystem classes directly.

## Design Pattern
The Facade pattern provides a simplified interface to a complex subsystem.
Each subsystem class has its own responsibility and does not depend on the Facade. The Facade coordinates their operations without replacing their internal logic.

## Clean Code Principles

1. **Meaningful Names** — class and method names describe their responsibilities.
2. **Single Responsibility** — each subsystem class performs a specific task.
3. **Encapsulation** — internal fields are hidden using `private`.
4. **Low Coupling** — subsystem classes do not depend on the Facade.
5. **Separation of Concerns** — the Facade coordinates operations while subsystem classes handle their own tasks.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure all Java files are in the same source folder.
3. Run `Main.java`.
4. Check the console output to see the order process.
