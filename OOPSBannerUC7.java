public class OOPSBannerUC7 {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                "  ***  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  ***  "
        };

        String[] pPattern = {
                " *****  ",
                " **   ** ",
                " **   ** ",
                " *****  ",
                " **      ",
                " **      ",
                " **      ",
                "         "
        };

        String[] sPattern = {
                "  ***** ",
                " **     ",
                " **     ",
                "  ***** ",
                "      **",
                "      **",
                " *****  ",
                "        "
        };

        String[] spacePattern = {
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        };

        return new CharacterPatternMap[] {
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern),
                new CharacterPatternMap(' ', spacePattern)
        };
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = charMaps[0].getPattern().length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < message.length(); j++) {
                String[] pattern = getCharacterPattern(message.charAt(j), charMaps);
                System.out.print(pattern[i] + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
    
