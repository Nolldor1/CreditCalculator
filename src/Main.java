public class Main {
    public static void main(String[] args) {
        creditPaymentService service = new creditPaymentService();
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 12, 9.99));
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 24, 9.99));
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 36, 9.99));

    }
}