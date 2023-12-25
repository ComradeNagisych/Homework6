public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задача №2");
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }
        System.out.println("Задача №3");
        for (int k = 0; k <= 17; k = k + 2) {
            System.out.println(k);
        }
        System.out.println("Задача №4");
        for (int l = 10; l >= -10; l--) {
            System.out.println(l);
        }
        System.out.println("Задача №5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println("Задача №6");
        for (int m = 7; m <= 98; m = m + 7) {
            System.out.println(m);
        }
        System.out.println("Задача №7");
        for (int n = 1; n <= 512; n = n * 2) {
            System.out.println(n);
        }
        System.out.println("Задача №8");
        int deposit = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month ++) {
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача №9");
        deposit = 29000;
        total = 0;
        for (int month = 1; month <= 12; month ++) {
            total = total + total / 100;
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача №10");
        for (int o = 1; o <= 10; o++) {
            System.out.println("2*" + o + "=" + (2 * o));
        }
    }
}