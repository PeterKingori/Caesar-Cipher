package models;

public class CaesarCipherDecoder {
    private String userText;
    private int userKey;

    private CaesarCipherEncoder EncoderDetails = new CaesarCipherEncoder("", 0);

    public CaesarCipherDecoder(String userText, int decodeKey) {
    }

    public String getUserText() {
        this.userText = EncoderDetails.getInputString();
        return userText;
    }
    public int getUserKey() {
        this.userKey = EncoderDetails.getShiftKey();
        return userKey;
    }
}
