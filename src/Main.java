public class Main {
    public static void main(String[] args) {
        int check588 = 15; // начальный счет клиента ID588
        int refill588 = 2000;  // сумма пополнения клиента ID588
        int bonus = refill588 / 1000; // начислено бонусов
        if (refill588 < 1000) {
            System.out.println("Бонусов нет. " +
                    "Итоговая сумма на счету клиента — " + (check588 + refill588) + " руб.");
        } else {
            System.out.println("Бонус равен " + (refill588 / 1000) + " руб. " +
                    "Итоговая сумма на счету клиента — " + (check588 + refill588 + (bonus)) + " руб.");
        }
    }
}
