interface PaymentStrategy {
    boolean pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Оплата картой на сумму: " + amount);
        return true;
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Оплата через PayPal на сумму: " + amount);
        return true;
    }
}

class PaymentService {
    private PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean processPayment(double amount) {
        return strategy.pay(amount);
    }
}
