public class creditPaymentService {
    int calculate(int amount, int period, double percent) { // переменные: сумма кредита, срок, процент
        double percent1 = (percent / (100 * percent)); // перевод процентов в число
        double Ratio = ((percent1 * Math.pow((1 + percent1), period)) / (Math.pow((1 + percent1), period) - 1));
        return (int) (Ratio * amount);
    }
}