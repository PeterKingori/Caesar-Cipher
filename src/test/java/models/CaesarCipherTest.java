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
    public void newCaesarCipher_getsString_A() {
        CaesarCipher testCaesarCipher = new CaesarCipher("A", 1);
        assertEquals("A", testCaesarCipher.getInputString());
    }
}