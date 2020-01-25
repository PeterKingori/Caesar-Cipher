package models;
import java.util.List;
import java.util.ArrayList;

public class CaesarCipherEncoder {
    private String userInput;
    private int shiftKey;
    private List<String> userOutput = new ArrayList<String>();


    public CaesarCipherEncoder(String userInput, int shiftKey) {
        this.userInput = userInput;
        this.shiftKey = shiftKey;
    }

    public String encryptUserText() {
        for (int i = 0; i < userInput.length(); i++) {
            if (Character.isUpperCase(userInput.charAt(i))) {
                int newCharValue = ((int) (userInput.charAt(i)) + shiftKey - 65) % 26 + 65;
                char encodedChar = (char) (newCharValue);
                String encodedString = Character.toString(encodedChar);
                userOutput.add(encodedString);
            } else if (Character.isLowerCase(userInput.charAt(i))) {
                int newCharValue = ((int) (userInput.charAt(i)) + shiftKey - 97) % 26 + 97;
                char encodedChar = (char) (newCharValue);
                String encodedString = Character.toString(encodedChar);
                userOutput.add(encodedString);
            } else {
                String encodedString = Character.toString(userInput.charAt(i));
                userOutput.add(encodedString);
            }
        }
        return String.join("", userOutput);
    }

    public String getInputString() {
        return this.userInput;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }

}
