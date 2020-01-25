package models;

public class CaesarEncoder {
    private String userInputText;
    CaesarCipher encodeCaesarCipher = new CaesarCipher("", 0);

    public CaesarEncoder(String userInputText, int userShiftKey) { }

    public String setUserInputText() {
        this.userInputText = encodeCaesarCipher.getInputString();
        return this.userInputText;
    }
}
