package StrategyPattern;

public class ShoppingCart {

    PaymentStrategy paymentStrategy;

    public ShoppingCart (PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy (PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void makePayment(int amount) {
        this.paymentStrategy.makePayment(amount);
    }
}
