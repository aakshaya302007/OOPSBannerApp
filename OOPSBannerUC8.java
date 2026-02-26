import java.util.HashMap;

public class OOPSBannerUC8 {
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "   ***  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  ***  "
        });

        charMap.put('P', new String[]{
                " *****  ",
                " **   ** ",
                " **   ** ",
                " *****  ",
                " **      ",
                " **      ",
                " **      ",
                "         "
        });

        charMap.put('S', new String[]{
                "  ***** ",
                " **     ",
                " **     ",
                "  ***** ",
                "      **",
                "      **",
                " *****  ",
                "        "
        });

        charMap.put(' ', new String[]{
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        });

        return charMap;
    }
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));

                System.out.print(pattern[line] + "   ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}

