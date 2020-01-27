import models.CaesarCipherEncoder;
import models.CaesarCipherDecoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;

        while (programRunning) {
            System.out.println("I am a Caesar Cipher program. Choose one of the following options: " +
                    "Encrypt, Decrypt or Exit");
            try {
                String choice = bufferedReader.readLine();
                if(choice.equals("Encrypt")) {
                    System.out.println("Enter the text that you want to be encrypted:");
                    String userInputText = bufferedReader.readLine();
                    System.out.println("Enter an integer that you want to use as the encoding key:");
                    String stringInputKey = bufferedReader.readLine();
                    int inputKey = Integer.parseInt(stringInputKey);
                    CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder(userInputText,inputKey);
                    String encodingResult = caesarCipherEncoder.encryptUserText();
                    System.out.println("Encrytped Text: " + encodingResult);
                } else if (choice.equals("Decrypt")) {
                    System.out.println("Enter the text that you want to be decrypted:");
                    String userInputText = bufferedReader.readLine();
                    System.out.println("Enter an integer that you want to use as the decoding key:");
                    String stringInputKey = bufferedReader.readLine();
                    int inputKey = Integer.parseInt(stringInputKey);
                    CaesarCipherDecoder caesarCipherDecoder = new CaesarCipherDecoder(userInputText,
                            inputKey);
                    String decodingResult = caesarCipherDecoder.decodeUserText();
                    System.out.println("Decrytped Text: " + decodingResult);
                } else if (choice.equals("Exit")) {
                    System.out.println("Goodbye!");
                    programRunning = false;
                } else {
                    System.out.println("That input cannot be recognized.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
