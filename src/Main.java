import StrategyPattern.BitcoinPaymentProcessor;
import StrategyPattern.CreditCardPaymentProcessor;
import StrategyPattern.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        BitcoinPaymentProcessor bitcoinPaymentProcessor = new BitcoinPaymentProcessor();
        ShoppingCart shoppingCart = new ShoppingCart(bitcoinPaymentProcessor);
        shoppingCart.makePayment(50);

        CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();
        shoppingCart.setPaymentStrategy(creditCardPaymentProcessor);
        shoppingCart.makePayment(75);
        }
    }
