public class Main1 {
    public static void main(String[] args) {
       int amountOfMoney = 200;
       int replenishmentAmount = 2000;

       int percent;
       if (replenishmentAmount >= 1000) {
           percent = replenishmentAmount / 100;
       } else {
           percent = 0;
       }
        System.out.println("Сумма ваших бонусов: " + percent);
    }
}
