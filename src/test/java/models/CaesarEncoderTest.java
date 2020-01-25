package models;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class CaesarEncoderTest {
    @Test
    public void newCaesarEncoder_instantiatesCorrectly() throws Exception {
        CaesarEncoder testCaesarEncoder = new CaesarEncoder("A", 1);
        assertEquals(true, testCaesarEncoder instanceof CaesarEncoder);
    }

    @Test
    public void testSetUserInputText_setsUserTextProperly() throws Exception {
        CaesarEncoder testCaesarEncoder = new CaesarEncoder("", 0);
        assertEquals("", testCaesarEncoder.setUserInputText());
    }

}