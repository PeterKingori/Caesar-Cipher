package models;

public class CaesarCipher {
    private String userInput;

    public CaesarCipher(String userInput, Integer shiftKey) {
        this.userInput = userInput;
    }

    public String getInputString() {
        return this.userInput;
    }
}
