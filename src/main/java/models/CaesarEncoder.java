package models;

public class CaesarEncoder {
    private String receivedUserInput;
    CaesarCipher encodeCaesarCipher = new CaesarCipher("", 0);

    public CaesarEncoder(String receivedUserInput, int receivedKey) { }

    public String CaesarEncoderInput() {
        receivedUserInput = encodeCaesarCipher.getInputString();
        this.receivedUserInput = receivedUserInput;
        return this.receivedUserInput;
    }
}
