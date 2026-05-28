public class Main {
    public static void main(String[] args) {
        System.out.println("conditional operators");
        int oc = 1;
        if (oc <= 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else if (oc >= 0) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        }
        int ocPk = 1;
        int clientDeviceYear = 2010;
        if (ocPk <= 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (ocPk >= 0 && clientDeviceYear <= 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        } else if (ocPk <= 0 && clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке ");
        } else if (ocPk >= 0 && clientDeviceYear > 2015) {
            System.out.println(" Установите обычную версию приложения для Android по ссылке ");
        }
        int year = 2021;
        if (year < 1584) {
            System.out.println(year + " Год не являеться высокосным ");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "  год является високосным");
        } else {
            System.out.println(year + " год не является високосным ");
            int deliveryDistance = 95;
            int days = 1;
            if (deliveryDistance < 20) {
                days = 1;
                System.out.println(" Потребуеться " + days + " дней ");
            } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
                days += 1;
                System.out.println("Потребуется " + days + " дней ");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                days += 2;
                System.out.println(" Потребуеться " + days + " дней ");
            } else if (deliveryDistance > 100) {
                System.out.println(" Доставки нет ");
            }
                int monthNumber = 12;
                switch (monthNumber) {
                    case 1:
                        System.out.println(" Зима ");
                        break;
                    case 2:
                        System.out.println(" Зима ");
                        break;
                    case 3:
                        System.out.println(" Зима ");
                        break;
                    case 4:
                        System.out.println(" Весна ");
                        break;
                    case 5:
                        System.out.println(" Весна");
                        break;
                    case 6:
                        System.out.println(" Весна ");
                        break;
                    case 7:
                        System.out.println(" Лето ");
                        break;
                    case 8:
                        System.out.println(" Лето ");
                        break;
                    case 9:
                        System.out.println(" Лето ");
                        break;
                    case 10:
                        System.out.println(" Осень ");
                        break;
                    case 11:
                        System.out.println(" Осень ");
                    case 12:
                        System.out.println(" Осень ");
                        break;
                    default:
                        System.out.println(" Такого месяца нету ");
                }
            }
        }
    }




















