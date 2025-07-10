public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.processPayment(100.0);

        context.setPaymentStrategy(new PayPalPayment());
        context.processPayment(200.0);
    }
}
