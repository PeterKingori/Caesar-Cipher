import models.CaesarCipherEncoder;
import models.CaesarCipherDecoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I am a Caesar Cipher program. Enter the text you want to be " +
                    "encrypted:");
        String inputText = bufferedReader.readLine();
        System.out.println("Enter an integer that you want to use as the encoding key:");
        String stringInputKey = bufferedReader.readLine();
        int inputKey = Integer.parseInt(stringInputKey);

        CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder(inputText, inputKey);
        String encodingResult = caesarCipherEncoder.encryptUserText();
        System.out.println("Encrytped Text: " + encodingResult);

    }
}
