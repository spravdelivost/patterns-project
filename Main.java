public class Main {
    public static void main(String[] args) {
        // Использование Singleton
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        // Использование Factory Method
        Product product = ProductFactory.createProduct("Electronics");
        System.out.println(product.getDetails());

        // Использование Strategy
        PaymentService paymentService = new PaymentService(new CreditCardPayment());
        paymentService.processPayment(product.price);
    }
}
