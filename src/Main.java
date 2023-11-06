import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        isLeapYear(2023);
        //Задача 2
        isOS(2015,1);

    }
    public static void isLeapYear(int year){
        if ((year >= 1584 && year % 4 == 0 && year % 100 != 0) || (year >= 1584 && year % 4 == 0 && year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void isOS(int clientDeviceYear, int clientOS){
        if (clientOS == 0 && clientDeviceYear > LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear <= LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear > LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear <= LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

}