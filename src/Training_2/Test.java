package Training_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        example();


    }

    public static void getNumber() {
        int numberTwo = 22;
        int numberThree = 13;
        int numberFour = numberThree++;
        int numberFive = 11;
        numberTwo += numberFive;
        System.out.println(numberFour);
        System.out.println(numberThree);
        System.out.println(numberTwo);

    }

    public static void example(){
        int[] num = new int[]{1, 7, 77, 21, 99};

        for (int a : num){
            System.out.println(a + 1);
        }
    }


}




