public class Main {
    public static void main(String[] args) {
        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(100.0);

        PaymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment(200.0);
    }
}
