package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void newCaesarCipher_instantiatesCorrectly() throws Exception {
        CaesarCipher testCaesarCipher = new CaesarCipher("A", 1);
        assertEquals(true, testCaesarCipher instanceof CaesarCipher);
    }

    @Test
    public void getInputString_getsString_A() throws Exception {
        CaesarCipher testCaesarCipher = new CaesarCipher("A", 1);
        assertEquals("A", testCaesarCipher.getInputString());
    }

    @Test
    public void getShiftKey_getsIntShiftKey_1() throws Exception {
        CaesarCipher testCaesarCipher = new CaesarCipher("A", 1);
        assertEquals(1, testCaesarCipher.getShiftKey());
    }
}