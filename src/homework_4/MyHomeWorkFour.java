package homework_4;
import java.util.Scanner;


public class MyHomeWorkFour {
    public static void main(String[] args) {
        taskNumberOne();
    }

    // Задание номер 1
    public static void taskNumberOne() {
        int[] num = new int[]{1, 7, 77, 21, 99};
        System.out.print("Введите число, которое желаете найти: ");
        Scanner input = new Scanner(System.in);
        int numFromArray = input.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (numFromArray == num[i]) {
                System.out.println("Число " + numFromArray + " входит в массив");
                return;
            }
        }
        System.out.println("Число " + numFromArray + " не входит в массив");
    }

    // Задание номер 2
    public static void taskNumberTwo(){
        int[] array = new int[] {1, 3, 77, 4, 22, 66};
        System.out.print("Введите число необходимое для удаления: ");
        Scanner input = new Scanner(System.in);
        int numDelete = input.nextInt();

        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (numDelete == array[i]){
                count++;
            }
        }

        if (count == 0){
            System.out.println("Введенное число - " + numDelete + " не входит в массив");
            return;
        }

        int[] newArray = new int[array.length - count];

        int p = 0;
        for (int i = 0; i < array.length; i++){
            if (numDelete != array[i]){
               newArray [p] = array [i];
               p++;
            }
        }

        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + "\t");
        }

        System.out.println("- Массив содержит данные значения");


    }

    // Задание номер 3
    public static void taskNumberThree(){

        int minRandom = 1;
        int maxRandom = 50;

        System.out.print("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int sizeArray = input.nextInt();

        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (minRandom + (maxRandom - minRandom + 1) * Math.random());
        }

        System.out.println("Массив содержит следующие значения: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        int minValue = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
            }
        }

        int maxValue= array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }

        int averageSum = 0;
        for (int i = 0; i < array.length; i++){
            averageSum += array[i];
        }

        double averageValue = (double) averageSum / array.length;

        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Максимальное значение: " + maxValue);
        System.out.println("Среднее значение: " + averageValue);

    }

    // Задание номер 4
    public static void taskNumberFour(){
        int[] arrayOne = new int[]{5, 4, 6, 7, 10};
        int[] arrayTwo = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arrayTwo.length; i++){
            System.out.print("Введите значение массива: ");
            int arrayValue = input.nextInt();
            arrayTwo[i] = arrayValue;
        }

        System.out.println("Массив номер 1 содержит следующие значения: ");
        for (int i = 0; i < arrayOne.length; i++){
            System.out.print(arrayOne[i] + "\t");
        }

        System.out.println();

        System.out.println("Массив номер 2 содержит следующие значения: ");
        for (int i = 0; i < arrayTwo.length; i++){
            System.out.print(arrayTwo[i] + "\t");
        }

        System.out.println();

        int arrayOneSum = 0;
        for (int i = 0; i < arrayOne.length; i++){
            arrayOneSum += arrayOne[i];
        }

        int arrayTwoSum = 0;
        for (int i = 0; i < arrayTwo.length; i++){
            arrayTwoSum += arrayTwo[i];
        }

        double arithmeticOne = (double) arrayOneSum / arrayOne.length;
        double arithmeticTwo = (double) arrayTwoSum / arrayTwo.length;

        if (arithmeticOne > arithmeticTwo){
            System.out.println("Среднее арифметическое значение первого массива оказалось больше. Значение: " + arithmeticOne);
        }else if (arithmeticTwo > arithmeticOne){
            System.out.println("Среднее арифметическое значение второго массива оказалось больше. Значение: " + arithmeticTwo);
        }else {
            System.out.println("Среднее арифметическое значение первого и второго массива равны");
        }


    }
}