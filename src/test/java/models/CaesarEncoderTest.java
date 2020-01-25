package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarEncoderTest {
    @Test
    public void newCaesarEncoder_instantiatesCorrectly() {
        CaesarEncoder testCaesarEncoder = new CaesarEncoder("A", 1);
        assertEquals(true, testCaesarEncoder instanceof CaesarEncoder);
    }
}

//    @Test
//    public void getInputStringFromCaesarCipherClass_getsString_String() {
//        CaesarEncoder testCaesarEncoder = new CaesarEncoder("A", 1);
//        assertEquals("A", testCaesarEncoder.receivedInputString());
//    }