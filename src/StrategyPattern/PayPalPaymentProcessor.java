package StrategyPattern;

public class PayPalPaymentProcessor implements PaymentStrategy {

    @Override
    public void makePayment(int paymentAmount) {

        System.out.printf("Processing PayPal payment for amount: %s", paymentAmount);
    }
}
