public class Main {
    public static void main(String[] args) {
        int amountLeft = 10;
        int bonusEvery = 100;
        int replenishment = 700;
        int bonus = replenishment / bonusEvery;

        if (replenishment < 100) {
            bonus = 0;
        }
        int finalAmount = amountLeft + replenishment + bonus;

        System.out.println("Остаток на счете " + finalAmount);
    }

}
