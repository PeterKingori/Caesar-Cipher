package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarCipherEncoderTest {
    @Test
    public void newCaesarCipher_instantiatesCorrectly() throws Exception {
        CaesarCipherEncoder testCaesarCipher = new CaesarCipherEncoder("A", 1);
        assertEquals(true, testCaesarCipher instanceof CaesarCipherEncoder);
    }

    @Test
    public void getInputString_getsString_A() throws Exception {
        CaesarCipherEncoder testCaesarCipher = new CaesarCipherEncoder("A", 1);
        assertEquals("A", testCaesarCipher.getInputString());
    }

    @Test
    public void getShiftKey_getsIntShiftKey_1() throws Exception {
        CaesarCipherEncoder testCaesarCipher = new CaesarCipherEncoder("A", 1);
        assertEquals(1, testCaesarCipher.getShiftKey());
    }
}