public class Main {
    public static void main(String[] args) {
        //Задание 1

        int i = 1;
        for (i = 1; i <= 10; i++)
            System.out.println(i);

        //Задание 2


        for (int a = 10; a >= 1; a--)
            System.out.println(a);

        //Задание 3

        for (int b = 2; b <= 17; b = b + 2)
            System.out.println(b);

        //Задание 4

        for (int c = 10; c >= -10; c--)
            System.out.println(c);

        // Заданиу 5

        for (int year = 1904; year <= 2097; year = year + 4)
            System.out.println(year + " год является високосным ");

        //Задание 6

        for (int d = 7; d <= 98; d = d + 7)
            System.out.println(d);

        // Задание 7

        for (int e = 1; e <= 512; e = e * 2)
            System.out.println(e);

        //Задание 8
        int salary = 29000;
        int total = 0;
        for (int g = 1; g <= 12; g++) {
            total = total + salary;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + total + " рублей ");
        }

        //Задание 9

        int salary1 = 29000;
        int total1 = 0;
        for (int f = 1; f <= 12; f++) {
            total1 = total1 + total1 / 100 ;
            total1 = total1 + salary1;
            System.out.println("Месяц " + f + ", сумма накоплений равна " + total1 + " рублей ");
        }
    }
}
