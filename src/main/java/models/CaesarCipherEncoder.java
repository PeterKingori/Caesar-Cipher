package models;

public class CaesarCipherEncoder {
    private String userInput;
    private int shiftKey;

    public CaesarCipherEncoder(String userInput, int shiftKey) {
        this.userInput = userInput;
        this.shiftKey = shiftKey;
    }




    public String getInputString() {
        return this.userInput;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }
}
