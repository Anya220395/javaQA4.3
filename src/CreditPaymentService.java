public class CreditPaymentService {

    public double calculate(double sumOfCredit, double percentInYear, int month) {

        double percentInMonth = percentInYear / 12 / 100; // месячная ставка
        double mp = Math.pow((1 + percentInMonth), month); // возводим в степень 1+месячную ставку
        double annuitent = sumOfCredit * (percentInMonth * mp) / (mp - 1); //считаем коэффициент платежа
        int payInMonth = (int) annuitent; // приведем к целому числу
        return payInMonth;
    }
}
