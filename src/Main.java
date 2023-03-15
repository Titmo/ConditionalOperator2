import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte operatingSystem = 0;
        switch (operatingSystem) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte operatingSystem = 0;
        short clientDeviceYear = 2015;
        if (clientDeviceYear>2015) {
            switch (operatingSystem) {
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else {
            switch (operatingSystem) {
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        short year = 2021;
        if (year%4==0 && year%100 !=0 || year%400==0){
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        short deliveryDistance = 95;
        byte deliveryTime = 1;
        if (deliveryDistance<20){
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance<60) {
            System.out.println("Потребуется дней: " + (deliveryTime+1));
        } else if (deliveryDistance<100) {
            System.out.println("Потребуется дней: " + (deliveryTime+2));
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет!");
                break;
        }
    }
}