package StrategyPattern;

public class CreditCardPaymentProcessor implements PaymentStrategy {

    @Override
    public void makePayment(int paymentAmount) {

        System.out.printf("Processing Credit Card payment for amount: %s", paymentAmount);
    }
}

