public class Main {

    public static void main(String[] args) {
        int amount = 106;
        int refill = 1500;
        boolean limit = refill > 1000;

        int bonus;
        int summary;
        if (limit) {
            bonus = refill / 100;
            summary = amount + refill + bonus;
        } else {
            bonus = 0;
            summary = amount + refill;
        }

        System.out.println("Начисленные бонусы = " + bonus);
        System.out.println("Итоговоая сумма = " + summary);
    }
}