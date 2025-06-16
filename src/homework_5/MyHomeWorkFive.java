package homework_5;
import java.util.Scanner;



public class MyHomeWorkFive {
    public static void main(String[] args) {
        taskNumberOne();

    }

    // Задание номер 1
    public static void taskNumberOne (){
        int [][][] arrayOne = new int [][][] {
            {
                {0, 1, 2},
                {5, 3, 7},
                {5, 4, 6}
            },
            {
                {0, 1, 2},
                {5, 3, 7},
                {5, 4, 6}
            },
            {
                {1, 5, 8},
                {3, 6, 8},
                {6, 8, 9}
            }
        };

        System.out.println("Значения находящиеся в массиве:");
        for (int i = 0; i < arrayOne.length; i++){
            for (int k = 0; k < arrayOne[i].length; k++){
                for (int g = 0; g < arrayOne[i][k].length; g++){
                    System.out.print(arrayOne[i][k][g] + "\t");
                }
            }
        }

        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число, на которое хотите увеличить значение массива: ");
        int mathArray = input.nextInt();

        System.out.println("Значения находящиеся в массиве после увеличения: ");
        for (int i = 0; i < arrayOne.length; i++){
            for (int k = 0; k < arrayOne[i].length; k++){
                for (int g = 0; g < arrayOne[i][k].length; g++){
                    System.out.print((arrayOne[i][k][g]  += mathArray) + "\t");
                }
            }
        }


    }


    // Задание номер 2
    public static void taskNumberTwo (){
        String [][] arrayChess = new String[8][8];

        System.out.println("Шахматная доска: ");

        for (int i = 0; i < arrayChess.length; i++){
            for (int j = 0; j < arrayChess[i].length; j++){
                if ((i +j) % 2 == 0) {
                    arrayChess[i][j] = "W";
                }else {
                    arrayChess [i][j] = "B";
                }
            }
        }

        for (int i = 0; i < arrayChess.length; i++) {
            for (int j = 0; j < arrayChess[i].length; j++) {
                System.out.print(" " + arrayChess[i][j] + " ");
            }
            System.out.println();
        }
    }
}
