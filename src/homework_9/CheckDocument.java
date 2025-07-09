package homework_9;

public class CheckDocument {
    public static void getCheckAbc(String documentNumber) throws CheckAbcException {
        if (documentNumber == null || !documentNumber.contains("abc")) {
            throw new CheckAbcException("Ошибка: номер документа не содержит 'abc'.");
        }
    }

    public static void checkFive(String documentNumber) throws StartsWith555Exception {
        if (documentNumber == null || !documentNumber.startsWith("555")) {
            throw new StartsWith555Exception("Ошибка: номер документа не начинается с '555'.");
        }
    }

    public static void checkEndsLettersBooks(String documentNumber) throws EndsWith1a2bException {
        if (documentNumber == null || !documentNumber.endsWith("1a2b")) {
            throw new EndsWith1a2bException("Ошибка: номер документа не заканчивается на '1a2b'.");
        }
    }
}
