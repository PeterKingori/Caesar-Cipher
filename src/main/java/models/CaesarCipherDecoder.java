package models;
import models.CaesarCipherEncoder;

import java.util.ArrayList;
import java.util.List;

public class CaesarCipherDecoder {
    private String userText;
    private int decodeKey;
    private List<String> decodedOutput = new ArrayList<String>();

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
        for (int i = 0; i < userText.length(); i++) {
            int decodedValue = ((int)(userText.charAt(i)) - decodeKey + 65) % 26 + 65;
            char decodedChar = (char)(decodedValue);
            String decodedString = Character.toString(decodedChar);
            decodedOutput.add(decodedString);
        }
        return String.join("", decodedOutput);
    }
}
