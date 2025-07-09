package homework_9;
import java.util.Scanner;

public class MyHomeWorkNine {
    public static void main(String[] args) {
        getNumber();

    }


    public static void getNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер документа, формата xxxx-yyy-xxxx-yyy-xyxy," +
                " где: x — это цифра, y — это буква");
        String getNumber = input.nextLine();

        try {
            CheckDocument.getCheckAbc(getNumber);
            System.out.println("Проверка содержит 'abc' прошла успешно.");

            CheckDocument.checkFive(getNumber);
            System.out.println("Проверка начинается с '555' прошла успешно.");

            CheckDocument.checkEndsLettersBooks(getNumber);
            System.out.println("Проверка заканчивается на '1a2b' прошла успешно.");
        } catch (CheckAbcException e) {
            System.out.println(e.getMessage());
        } catch (StartsWith555Exception e) {
            System.out.println(e.getMessage());
        } catch (EndsWith1a2bException e) {
            System.out.println(e.getMessage());
        }
    }
}