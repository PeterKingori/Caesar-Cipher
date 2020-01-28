import models.CaesarCipherEncoder;
import models.CaesarCipherDecoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        //TODO: Research on Java data persistency and use it to add functionality so that the
        // encoded message can be picked up by the decoder function and decoded to the original
        // input from the user.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;

        // Initialize the constructor to create new instances of the CaesarCipherEncoder and
        // CaesarCipherDecoder classes at the beginning of the program instead of when the
        // program is running. This will make the program run more efficiently instead of having
        CaesarCipherEncoder encoder = new CaesarCipherEncoder("", 0);

        while (programRunning) {
            System.out.println("I am a Caesar Cipher program. Choose one of the following options:");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Exit");
            try {
                String choice = bufferedReader.readLine();
                if(choice.equals("1")) {
                    System.out.println("Enter the text that you want to be encrypted:");
                    String userInputText = bufferedReader.readLine();
                    System.out.println("Enter an integer that you want to use as the encoding key:");
                    String stringInputKey = bufferedReader.readLine();
                    int inputKey = Integer.parseInt(stringInputKey);
                    // The constructor is moved to the top of the program
                    // CaesarCipherEncoder caesarCipherEncoder=new CaesarCipherEncoder(userInputText,inputKey);
                    //Use the setter methods  in CaesarCipherEncoder.java to set the values
                    // entered by the user as values to be used
                    encoder.setUserText(userInputText);
                    encoder.setUserKey(inputKey);
                    String encodingResult = encoder.encryptUserText();
                    System.out.println("Encrytped Text: " + encodingResult);
                } else if (choice.equals("2")) {
                    System.out.println("Enter the text that you want to be decrypted:");
                    String userInputText = bufferedReader.readLine();
                    System.out.println("Enter an integer that you want to use as the decoding key:");
                    String stringInputKey = bufferedReader.readLine();
                    int inputKey = Integer.parseInt(stringInputKey);
                    CaesarCipherDecoder caesarCipherDecoder = new CaesarCipherDecoder(userInputText,
                            inputKey);
                    String decodingResult = caesarCipherDecoder.decodeUserText();
                    System.out.println("Decrytped Text: " + decodingResult);
                } else if (choice.equals("3")) {
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
