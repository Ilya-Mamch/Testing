package homework_3;

import java.util.Scanner;

public class MyHomeWork {
    public static void main(String[] args){

    }


    // Управляющие конструкции: 1-ое задание
    public static void taskNumberOne() {
        System.out.print("Введите номер месяца: ");
        Scanner input = new Scanner(System.in);
        int monthNumber = input.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }


    // Управляющие конструкции: 1-ое задание второй варинат
    public static void taskNumberOneAnalog() {
        System.out.print("Введите номер месяца: ");
        Scanner input = new Scanner(System.in);
        int monthNumberAnalog = input.nextInt();

        switch (monthNumberAnalog) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }


    // Управляющие конструкции: 2-ое задание
    public static void taskNumberTwo() {
        System.out.print("Введите номер месяца: ");
        Scanner input = new Scanner(System.in);
        int monthNumbs = input.nextInt();

        if (monthNumbs == 1) {
            System.out.println("Зима");
        } else if (monthNumbs == 2) {
            System.out.println("Зима");
        } else if (monthNumbs == 3) {
            System.out.println("Весна");
        } else if (monthNumbs == 4) {
            System.out.println("Весна");
        } else if (monthNumbs == 5) {
            System.out.println("Весна");
        } else if (monthNumbs == 6) {
            System.out.println("Лето");
        } else if (monthNumbs == 7) {
            System.out.println("Лето");
        } else if (monthNumbs == 8) {
            System.out.println("Лето");
        } else if (monthNumbs == 9) {
            System.out.println("Осень");
        } else if (monthNumbs == 10) {
            System.out.println("Осень");
        } else if (monthNumbs == 11) {
            System.out.println("Осень");
        } else if (monthNumbs == 12) {
            System.out.println("Зима");
        } else {
            System.out.println("Нет такого месяца");
        }

    }


    // Управляющие конструкции: 2-ое задание втрой вариант
    public static void taskNumberTwoAnalog() {
        System.out.print("Введите номер месяца: ");
        Scanner input = new Scanner(System.in);
        int monthNumbs = input.nextInt();

        if ((monthNumbs > 0 && monthNumbs < 3) || monthNumbs == 12) {
            System.out.println("Зима");
        } else if (monthNumbs > 2 && monthNumbs < 6) {
            System.out.println("Весна");
        } else if (monthNumbs > 5 && monthNumbs < 9) {
            System.out.println("Лето");
        } else if (monthNumbs > 8 && monthNumbs < 12) {
            System.out.println("Осень");
        } else {
            System.out.println("Нет такого месяца");
        }
    }


    // Управляющие конструкции: 3-е задание
    public static void taskNumberThree() {
        System.out.print("Введите число для определения четности: ");
        Scanner input = new Scanner(System.in);
        int parityNumbers = input.nextInt();
        int resultNumber = parityNumbers % 2;

        switch (resultNumber) {
            case 0:
                System.out.println("Четное");
                break;
            default:
                System.out.println("Нечетное");
        }
    }


    // Управляющие конструкции: 4-ое задание
    public static void taskNumberFour(){
        System.out.print("Введите температуру на улице: ");
        Scanner input = new Scanner(System.in);
        int temperature = input.nextInt();

        if (temperature > -5){
            System.out.println("Тепло");
        }else if (-5 >= temperature && temperature > -20){
            System.out.println("Нормально");
        } else if (-20 >= temperature) {
            System.out.println("Холодно");
        }

    }


    // Управляющие конструкции: 5-ое задание
    public static void taskNumberFive(){
        System.out.print("Введите цвет радуги: ");
        Scanner input = new Scanner(System.in);
        int rainbowColor = input.nextInt();

        switch (rainbowColor){
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Нет такого номера радуги");
        }
    }


    // Циклы: 1-ое задание
    public static void taskNumberSix(){
        System.out.println("Нечетные числа от 1 до 99:");
        for(int numOdd = 1; numOdd < 100; numOdd++ ){
            if (numOdd % 2 != 0){
                System.out.println(numOdd);
            }
        }
    }


    // Циклы: 2-ое задание
    public static void taskNumberSeven(){
        System.out.println("Числа от 5 до 1: ");
        for (int num = 5; num > 0; num--){
            System.out.println(num);
        }
    }


    // Циклы: 3-е задание
    public static void taskNumberEight(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int getNumbs = input.nextInt();
        int numSum = 0;

        if (getNumbs <= 0){
            System.out.println("Введенное число не является положительным");
        }else {
            for (int numPositive = 1; numPositive < getNumbs; numPositive++){
                numSum += numPositive;
                System.out.println(numSum);
            }
        }

    }


    // Циклы: 4-ое задание
    public static void taskNumberNine(){
        int numSubsequence = 7;
        while (numSubsequence < 99){
            if (numSubsequence % 7 == 0){
                System.out.print(numSubsequence + "\t");
            }
            numSubsequence++;
        }
    }


    // Циклы: 5-ое задание
    public static void taskNumberTen(){
        for (int numNegative = 0; numNegative > -50; numNegative--){
            if (numNegative % 5 == 0){
                System.out.print(numNegative + "\t");
            }
        }
    }


    // Циклы: 6-ое задание
    public static void taskNumberEleven(){
        for (int numSquare = 10; numSquare <= 20; numSquare++){
            System.out.println(numSquare * numSquare);
        }
    }

}
