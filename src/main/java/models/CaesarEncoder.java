package models;

public class CaesarEncoder {
    private String encodingUserInput;
    CaesarCipher encodeCaesarCipher = new CaesarCipher("", 0);

    public CaesarEncoder(String encodingUserInput, int receivedKey) { }

    public String setEncodingUserInput() {
        this.encodingUserInput = encodeCaesarCipher.getInputString();
        return this.encodingUserInput;
    }
}
