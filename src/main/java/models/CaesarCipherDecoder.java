package models;

public class CaesarCipherDecoder {
    private String userText;
    private CaesarCipherEncoder EncoderDetails = new CaesarCipherEncoder("", 0);

    public CaesarCipherDecoder(String userText, int decodeKey) {
    }

    public String getUserText() {
        this.userText = EncoderDetails.getInputString();
        return userText;
    }
}
