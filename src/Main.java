public class Main {
    public static void main(String[] args) {

        int x=1;    //период кредита (в годах)
        double y=9.99; //процентная ставка
        int z=1_000_000; // сумма кредита

        CreditPaymentService credit= new CreditPaymentService();
        int payment = (int) credit.calculate(x, y, z);
        System.out.println("OP: 87911. ФР: " + payment);

        x= 2;
        payment = (int) credit.calculate(x, y, z);
        System.out.println("OP: 46140. ФР: " + payment);

        x= 3;
        payment = (int) credit.calculate(x, y, z);
        System.out.println("OP: 32262. ФР: " + payment);


    }
}

