package StrategyPattern;

public class BitcoinPaymentProcessor implements PaymentStrategy {

    @Override
    public void makePayment(int paymentAmount) {

        System.out.printf("Processing Bitcoin payment for amount: %s", paymentAmount);
    }
}