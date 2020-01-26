package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarCipherDecoderTest {
    @Test
    public void newCaesarCipherObject_instantiatesCorrectly() throws Exception {
        CaesarCipherDecoder testCaesarCipherDecoder = new CaesarCipherDecoder("A", 1);
        assertEquals(true, testCaesarCipherDecoder instanceof CaesarCipherDecoder);
    }
    @Test
    public void newCaesarCipherDecoder_getUserText_String() throws Exception {
        CaesarCipherDecoder testCaesarCipherDecoder = new CaesarCipherDecoder("", 1);
        assertEquals("", testCaesarCipherDecoder.getUserText());
    }
    @Test
    public void newCaesarCipherDecoder_getUserShiftKey_int() throws Exception {
        CaesarCipherDecoder testCaesarCipherDecoder = new CaesarCipherDecoder("", 0);
        assertEquals(0, testCaesarCipherDecoder.getUserKey());
    }
    @Test
    public void decodeUserText_decodesOneLetterString_String() throws Exception {
        CaesarCipherDecoder testCaesarCipherDecoder=new CaesarCipherDecoder("D", 1);
        assertEquals("C", testCaesarCipherDecoder.decodeUserText());
    }
    @Test
    public void decodesUserText_decodesTwoLetterString_String() throws Exception {
        CaesarCipherDecoder testCaesarCipherDecoder=new CaesarCipherDecoder("TH", 1);
        assertEquals("SG", testCaesarCipherDecoder.decodeUserText());
    }

}