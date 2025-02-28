package StrategyPatternFunctionalInterface;

public class ShoppingCartFunctional {

    public static void processPayment(StrategyFunctional strategy, int amount) {
        strategy.makePayment(amount);
    }
}
