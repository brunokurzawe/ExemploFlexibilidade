
public class PaymentService {
    private final PaymentProcessor paymentProcessor;

    // Injeção de dependência via construtor
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment() {
        // Lógica de negócios antes do processamento de pagamento
        System.out.println("Executando lógica de negócios antes do pagamento.");

        // Processamento de pagamento delegado ao PaymentProcessor injetado
        paymentProcessor.processPayment();

        // Lógica de negócios após o processamento de pagamento
        System.out.println("Executando lógica de negócios após o pagamento.");
    }
}