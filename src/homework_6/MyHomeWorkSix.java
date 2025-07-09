package homework_6;

import java.util.Scanner;

public class MyHomeWorkSix {
    public static void main(String[] args) {
        creditCardUse();


    }


    public static void creditCardUse(){
        CreditCard cardOne = new CreditCard(100001, 0);
        CreditCard cardTwo = new CreditCard(100002, 10);
        CreditCard cardThree = new CreditCard(100003, 300);

        System.out.println("Введите номер счета: ");
        Scanner input = new Scanner(System.in);
        long numberCardForAdd = input.nextLong();

        if (numberCardForAdd == cardOne.numberAccount){
            System.out.print("Введите сумму для пополнения: ");
            long money = input.nextLong();
            cardOne.addMoney(money);
            System.out.println("Счет пополнен на: " + money);
        } else if (numberCardForAdd == cardTwo.numberAccount){
            System.out.print("Введите сумму для пополнения: ");
            long money = input.nextLong();
            cardTwo.addMoney(money);
            System.out.println("Счет пополнен на: " + money);
        }else if (numberCardForAdd == cardThree.numberAccount){
            System.out.print("Введите сумму для пополнения: ");
            long money = input.nextLong();
            cardThree.addMoney(money);
            System.out.println("Счет пополнен на: " + money);
        }else {
            System.out.println("Номер счет не найден, проверьте введённые данные");
        }

        System.out.println("Баланс счета 1 равняется: " + cardOne.getBalance());
        System.out.println("Баланс счета 2 равняется: " + cardTwo.getBalance());
        System.out.println("Баланс счета 3 равняется: " + cardThree.getBalance());


        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Введите номер счета: ");
        long numberCardForAddTwo = input.nextLong();

        if (numberCardForAddTwo == cardOne.numberAccount){
            System.out.print("Введите сумму для пополнения: ");
            long money = input.nextLong();
            cardOne.addMoney(money);
            System.out.println("Счет пополнен на: " + money);
        } else if (numberCardForAddTwo == cardTwo.numberAccount){
            System.out.print("Введите сумму для пополнения: ");
            long money = input.nextLong();
            cardTwo.addMoney(money);
            System.out.println("Счет пополнен на: " + money);
        }else if (numberCardForAddTwo == cardThree.numberAccount){
            System.out.print("Введите сумму для пополнения: ");
            long money = input.nextLong();
            cardThree.addMoney(money);
            System.out.println("Счет пополнен на: " + money);
        }else {
            System.out.println("Номер счет не найден, проверьте введённые данные");
        }

        System.out.println("Баланс счета 1 равняется: " + cardOne.getBalance());
        System.out.println("Баланс счета 2 равняется: " + cardTwo.getBalance());
        System.out.println("Баланс счета 3 равняется: " + cardThree.getBalance());


        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Введите номер счета: ");
        long numberCardForWithdraw = input.nextLong();

        if (numberCardForWithdraw == cardOne.numberAccount){
            System.out.print("Введите сумму для снятия: ");
            long money = input.nextLong();
            cardOne.withdrawMoney(money);
            System.out.println("Со счета снято: " + money);
        } else if (numberCardForWithdraw == cardTwo.numberAccount){
            System.out.print("Введите сумму для снятия: ");
            long money = input.nextLong();
            cardTwo.withdrawMoney(money);
            System.out.println("Со счета снято: " + money);
        }else if (numberCardForWithdraw == cardThree.numberAccount){
            System.out.print("Введите сумму для снятия: ");
            long money = input.nextLong();
            cardThree.withdrawMoney(money);
            System.out.println("Со счета снято: " + money);
        }else {
            System.out.println("Номер счет не найден, проверьте введённые данные");
        }

        System.out.println("Баланс счета 1 равняется: " + cardOne.getBalance());
        System.out.println("Баланс счета 2 равняется: " + cardTwo.getBalance());
        System.out.println("Баланс счета 3 равняется: " + cardThree.getBalance());

    }









}
