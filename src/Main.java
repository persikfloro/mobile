public class Main {
    public static void main(String[] args) {
        int check588 = 10; // начальный счет клиента ID588
        int refill588 = 100;  // сумма пополнения клиента ID588
        if (refill588 < 1000) {
            System.out.println("Начальный счет клиента ID588 " + (check588) + " руб. Он пополнил счёт на " + (refill588) + " руб. - " + "бонусов нет" + ", итоговая сумма на счету клиента — " + (check588 + refill588) + " руб.");
        } else {
            System.out.println("Начальный счет клиента ID588" + (check588) + ". Он пополнил счёт на " + (refill588) + "руб. — бонус равен" + (refill588 / 1000) + " руб., итоговая сумма на счету клиента — " + (check588 + refill588 + (refill588 / 1000)) + "руб.");
        }
        int check799 = 500; // начальный счет клиента ID799
        int refill799 = 22000;  // сумма пополнения клиента ID799
        if (refill799 < 1000) {
            System.out.println("Начальный счет клиента ID799 " + (check799) + " руб. Он пополнил счёт на " + (refill799) + " руб. - " + "бонусов нет" + ", итоговая сумма на счету клиента — " + (check799 + refill799) + " руб.");
        } else {
            System.out.println("Начальный счет клиента ID799 " + (check799) + " руб. Он пополнил счёт на " + (refill799) + " руб. — бонус равен " + (refill799 / 1000) + " руб., итоговая сумма на счету клиента — " + (check799 + refill799 + (refill799 / 1000)) + " руб.");
        }

        int check833 = 349; // начальный счет клиента ID833
        int refill833 = 1555;  // сумма пополнения клиента ID833
        if (refill833 < 1000) {
            System.out.println("Начальный счет клиента ID833 " + (check833) + " руб. Он пополнил счёт на " + (refill833) + " руб. - " + "бонусов нет" + ", итоговая сумма на счету клиента — " + (check833 + refill833) + "руб.");
        } else {
            System.out.println("Начальный счет клиента ID833 " + (check833) + " руб. Он пополнил счёт на " + (refill833) + " руб. — бонус равен " + (refill833 / 1000) + " руб., итоговая сумма на счету клиента — " + (check799 + refill833 + (refill833 / 1000)) + " руб.");
        }
    }
}