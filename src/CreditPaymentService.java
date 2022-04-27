
public class CreditPaymentService {
    public double calculate (int termCredit, double procent, int amount){
        int months = 12 * termCredit;
        double ps = procent / 100 / 12;
        double month_amount = amount * ps/(1 - Math.pow(1 + ps, -months ))  ;
        return month_amount;

    }
}
