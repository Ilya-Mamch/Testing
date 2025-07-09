package homework_10;
import java.util.Scanner;

public class MyHomeWorkTen {
    public static void main(String[] args) {
        documentVerification();

    }

    public static void documentVerification(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер документа, формата xxxx-yyy-xxxx-yyy-xyxy," +
                " где: x — это цифра, y — это буква");
        String getNumber = input.nextLine();
        System.out.println(getNumber);

        String firstTwoBlock = Text.getTwoFirstBlock(getNumber);
        System.out.println(firstTwoBlock);

        String getNewTextWithStars = Text.getStars(getNumber);
        System.out.println(getNewTextWithStars);

        String doc = Text.getOnlyLetters(getNumber);
        System.out.println(doc);

        String onlyLetterBuilder = Text.getOnlyLetterBuilder(getNumber);
        System.out.println(onlyLetterBuilder);

        boolean lettersAbc = Text.getLettersAbc(getNumber);
        if (lettersAbc) {
            System.out.println("Номер документа содержит последовательность 'abc'.");
        } else {
            System.out.println("Номер документа не содержит последовательность 'abc'.");
        }


        if (Text.getNumberFive(getNumber)) {
            System.out.println("Номер документа начинается с '555'.");
        } else {
            System.out.println("Номер документа не начинается с '555'.");
        }

        if (Text.getEndsNumberWithLetter(getNumber)) {
            System.out.println("Номер документа заканчивается на '1a2b'.");
        } else {
            System.out.println("Номер документа не заканчивается на '1a2b'.");
        }




    }
}
