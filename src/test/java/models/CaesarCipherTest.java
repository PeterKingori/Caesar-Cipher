package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void newCaesarCipher_instantiatesCorrectly() {
        CaesarCipher testCaesarCipher = new CaesarCipher("A", 1);
        assertEquals(true, testCaesarCipher instanceof CaesarCipher);
    }
}