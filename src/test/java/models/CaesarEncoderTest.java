package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarEncoderTest {
    @Test
    public void newCaesarEncoder_instantiatesCorrectly() throws Exception {
        CaesarEncoder testCaesarEncoder = new CaesarEncoder("A", 1);
        assertEquals(true, testCaesarEncoder instanceof CaesarEncoder);
    }

    @Test
    public void testSetEncodingUserInput_SetsVariableCorrectly_String() throws Exception {
        CaesarEncoder testCaesarEncoder = new CaesarEncoder("", 1);
        assertEquals("", testCaesarEncoder.setEncodingUserInput());
    }

}