package homework_10;

public class Text {
    public static String getTwoFirstBlock(String doc) {
        String block1 = "";
        String block2 = "";

        block1 = doc.substring(0, 4);
        block2 = doc.substring(9, 13);

        return block1 + " " + block2;
    }

    public static String getStars(String doc) {
        String newText = doc.replaceAll("\\b[a-zA-Z]{3}\\b", "***");
        return newText;
    }

    public static String getOnlyLetters(String doc) {
        String docOnlyLetters = doc.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String docAfterFormated = docOnlyLetters.substring(0, 3) + "/" + docOnlyLetters.substring(3, 6) + "/"
                + docOnlyLetters.substring(6, 7) + "/" + docOnlyLetters.substring(7, 8);
        return docAfterFormated;
    }

    public static String getOnlyLetterBuilder(String doc) {
        StringBuilder lettersBuilder = new StringBuilder();

        for (char ch : doc.toCharArray()) {
            if (Character.isLetter(ch)) {
                lettersBuilder.append(Character.toUpperCase(ch));
            }
        }

        String letters = lettersBuilder.toString();

        StringBuilder formatted = new StringBuilder("Letters:");

        int index = 0;
        int length = letters.length();

        while (index < length) {
            int end = Math.min(index + 3, length);
            formatted.append(letters.substring(index, end));
            index += 3;
            if (index < length) {
                formatted.append("/");
            }
        }
        return formatted.toString();
    }

    public static boolean getLettersAbc(String doc) {
        if (doc == null) {
            return false;
        }
        return doc.toLowerCase().contains("abc");

    }

    public static boolean getNumberFive(String doc) {
        if (doc == null) {
            return false;
        }
        return doc.startsWith("555");
    }

    public static boolean getEndsNumberWithLetter(String doc) {
        if (doc == null) {
            return false;
        }
        return doc.endsWith("1a2b");
    }
}

