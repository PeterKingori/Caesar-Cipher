package models;
import models.CaesarCipherEncoder;

public class CaesarCipherDecoder {
    private String userText;
    private int decodeKey;
    private String decodedString;

    private CaesarCipherEncoder EncoderDetails = new CaesarCipherEncoder("", 0);

    public CaesarCipherDecoder(String userText, int decodeKey) {
        this.userText = userText;
        this.decodeKey = decodeKey;
    }

    public String getUserText() {
        this.userText = EncoderDetails.getInputString();
        return this.userText;
    }
    public int getUserKey() {
        this.decodeKey = EncoderDetails.getShiftKey();
        return this.decodeKey;
    }
    public String decodeUserText() {
            int decodedValue = ((int)(userText.charAt(0)) - decodeKey - 65) % 26 + 65;
            char decodedChar = (char)(decodedValue);
            decodedString = Character.toString(decodedChar);
        return decodedString;
    }
}
