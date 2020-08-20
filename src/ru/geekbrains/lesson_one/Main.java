package ru.geekbrains.lesson_one;

public class Main {

    public static void main(String[] args) {

        byte a = 100;
        short b = (short) 155000;
        int c = 15;
        long d = 106589L;
        float e = 15.34f;
        double f = 15.15;
        char g = '\u1532';
        boolean h = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        System.out.println(HW3(14, 12, 6, 9));
        System.out.println(fromTentoTwenty(7, 9));
        positiveOrNegative(-1);
        System.out.println(isNegative(-15));
        printName("Никита");
        leapYear(2020);
    }

    static int HW3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static boolean fromTentoTwenty(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    static void positiveOrNegative(int a) {
        if (0 > a) {
            System.out.println(a + " - отрицательное число");
        } else {
            System.out.println(a + " - положительное число");
        }
    }

    static boolean isNegative(int a) {
        return a < 0;
    }

    static void printName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    static void leapYear(int a) {
        if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
            System.out.println(a + " - вискосоный год");
        } else {
            System.out.println(a + " - невисокосный год");
        }
    }
}
