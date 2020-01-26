package models;

public class CaesarCipherDecoder {
    private CaesarCipherEncoder EncoderDetails = new CaesarCipherEncoder("", 0);

    public CaesarCipherDecoder(String userText, int decodeKey) {
    }

    public String getUserText() {
        return EncoderDetails.getInputString();
    }
}
