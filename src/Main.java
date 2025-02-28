import StrategyPattern.BitcoinPaymentProcessor;
import StrategyPattern.CreditCardPaymentProcessor;
import StrategyPattern.ShoppingCart;
import StrategyPatternFunctionalInterface.ShoppingCartFunctional;
import StrategyPatternFunctionalInterface.StrategyFunctional;

public class Main {
    public static void main(String[] args) {

        BitcoinPaymentProcessor bitcoinPaymentProcessor = new BitcoinPaymentProcessor();
        ShoppingCart shoppingCart = new ShoppingCart(bitcoinPaymentProcessor);
        shoppingCart.makePayment(50);

        CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();
        shoppingCart.setPaymentStrategy(creditCardPaymentProcessor);
        shoppingCart.makePayment(75);

        StrategyFunctional bitcoinPaymentProcessorFunc = (amount) -> System.out.println("Processed Bitcoin Payment $" + amount);
        StrategyFunctional creditCardPaymentProcessorFunc = (amount) -> System.out.println("Processed Credit Card Payment $" + amount);

        ShoppingCartFunctional.processPayment(bitcoinPaymentProcessorFunc, 500);
        ShoppingCartFunctional.processPayment(creditCardPaymentProcessorFunc, 300);
        }
    }