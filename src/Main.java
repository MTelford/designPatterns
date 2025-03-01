import StratFunc.Checkout;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        BitcoinPaymentProcessor bitcoinPaymentProcessor = new BitcoinPaymentProcessor();
//        ShoppingCart shoppingCart = new ShoppingCart(bitcoinPaymentProcessor);
//        shoppingCart.makePayment(50);
//
//        CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();
//        shoppingCart.setPaymentStrategy(creditCardPaymentProcessor);
//        shoppingCart.makePayment(75);
//
//        StrategyFunctional bitcoinPaymentProcessorFunc = (amount) -> System.out.println("Processed Bitcoin Payment $" + amount);
//        StrategyFunctional creditCardPaymentProcessorFunc = (amount) -> System.out.println("Processed Credit Card Payment $" + amount);
//
//        ShoppingCartFunctional.processPayment((amount) -> System.out.println("Processed Bitcoin Payment $" + amount), 500);
//        ShoppingCartFunctional.processPayment(creditCardPaymentProcessorFunc, 300);


//        Consumer<String> printer = System.out::println;
////        printer.accept("Eureka!");
//
//        Supplier<Double> supplier = Math::random;
//        supplier.get();
//        printer.accept(supplier.get().toString());
//
//        Function<Integer, Integer> function = (amount) -> (amount + 1);
//        Integer result = function.apply(50);
//        printer.accept(result.toString());
//
//        List<String> myListOfStrings = new ArrayList<>();
//        myListOfStrings.add("Alice");
//        myListOfStrings.add("Bob");
//        myListOfStrings.add("Janice");
//
//        Set<String> res = myListOfStrings.stream()
//                .filter((name) -> name.endsWith("ce"))
//                .collect(Collectors.toSet());
//
//        System.out.println(res);

        Checkout.processPayment((amount) -> System.out.println("Paid: $" + amount), 50);


        List<String> arr = new ArrayList<>();
        arr.add("Mike");
        arr.add("Michael");

        String res = arr.stream()
                .filter((name) -> name.contains("c"))
                .collect(Collectors.joining());

        Consumer<String> printer = System.out::println;
        printer.accept(res);


    }
    }