public class Main {

    public static void main(String[] args) {

        int check = 150;
        int replenished = 900;
        int bonus;
        int total;

        if (replenished > 1000) {
            bonus = replenished / 100;
        } else {
            bonus = 0;
        }
        total = check + replenished + bonus;
        System.out.println(bonus);
        System.out.println(total);
    }
}