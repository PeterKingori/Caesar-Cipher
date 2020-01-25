package models;

public class CaesarCipherEncoder {
    private String userInput;
    private int shiftKey;
    private int newCharValue;
    private char encodedChar;
    private String encodedString;


    public CaesarCipherEncoder(String userInput, int shiftKey) {
        this.userInput = userInput;
        this.shiftKey = shiftKey;
    }

    public String encryptUserText() {
        for (int i = 0; i < userInput.length(); i++) {
            newCharValue = ((int)(userInput.charAt(i)) + shiftKey - 65) % 26 + 65;
            encodedChar = (char)(newCharValue);
            encodedString = Character.toString(encodedChar);
        }
        return encodedString;
    }


    public String getInputString() {
        return this.userInput;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }


}


//    public String encryptUserText() {
//        for (int i = 0; i < userInput.length(); i++) {
//            if (Character.isUpperCase(userInput.charAt(i))) {
//                int charValue = Character.getNumericValue(userInput.charAt(i));
//                int charCipherValue = (charValue + shiftKey);
//                newChar = (char)(charCipherValue);
//                encodedChar = newChar.toString();
//            }
//        }
//        return encodedChar;
//    }