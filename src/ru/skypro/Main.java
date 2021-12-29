package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Задание 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS");
        }
        // Задание 2
        int clientDeviceYear = 2010;
        int operatingSystem = 0;
        if (clientDeviceYear < 2015 && operatingSystem == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }  if (clientDeviceYear < 2015 && operatingSystem == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        // Задание 3
        int year = 2021;
        boolean isLeapYear = ((year%100 != 0) && (year%4==0) || (year%400==0));
        if (isLeapYear) {
            System.out.println("Год является високосным" + year);
        } else {
            System.out.println("Год не является високосным");
        }
        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance < 20){
            System.out.println("Потребуется один день");
        } if (deliveryDistance > 20 && deliveryDistance < 60){
            System.out.println("Потребуется два дня");
        } if (deliveryDistance > 60 && deliveryDistance < 100){
            System.out.println("Потребуется 3 дня");
        }
        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
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
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }


    }

}



