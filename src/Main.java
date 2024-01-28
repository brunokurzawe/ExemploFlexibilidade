public class Main {
    public static void main(String[] args) {

        // Usando Injeção de Dependência para fornecer o processador de pagamento desejado
        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        PaymentService creditCardPaymentService = new PaymentService(creditCardProcessor);
        creditCardPaymentService.processPayment();

        // Agora, usando Injeção de Dependência para suportar carteiras digitais sem modificar o código existente
        PaymentProcessor walletProcessor = new DigitalWalletPaymentProcessor();
        PaymentService walletPaymentService = new PaymentService(walletProcessor);
        walletPaymentService.processPayment();

    }
}