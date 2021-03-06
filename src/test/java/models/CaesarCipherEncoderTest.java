package models;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
// TODO: Use @Before public void to refactor code and remove repeated object creation of
//  CaesarCipherEncoder class
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
    @Test
    public void encryptUserText_encryptsOneLetterString_Character() throws Exception {
        CaesarCipherEncoder testCaesarCipherEncoder=new CaesarCipherEncoder(
                "A", 20);
        assertEquals("U", testCaesarCipherEncoder.encryptUserText());
    }
    @Test
    public void encryptUserText_encryptsTwoLetterString_String() throws Exception {
        CaesarCipherEncoder testCaesarCipherEncoder=new CaesarCipherEncoder(
                "TH", 23);
        assertEquals("QE", testCaesarCipherEncoder.encryptUserText());
    }
    @Test
    public void encryptUserText_encryptsMultipleLetterString_String() throws Exception {
        CaesarCipherEncoder testCaesarCipherEncoder=new CaesarCipherEncoder(
                "BROWNFOX", 23);
        assertEquals("YOLTKCLU", testCaesarCipherEncoder.encryptUserText());
    }
    @Test
    public void encryptUserText_encryptsStringWithDifferentAlphabeticalCaseLetters_String() throws Exception {
        CaesarCipherEncoder testCaesarCipherEncoder=new CaesarCipherEncoder(
                "LookUPtaBLES", 10);
        assertEquals("VyyuEZdkLVOC", testCaesarCipherEncoder.encryptUserText());
    }
    @Test
    public void encryptUserText_encryptsStringWithASpaceInBetweenTwoStrings_String() throws Exception {
        CaesarCipherEncoder testCaesarCipherEncoder=new CaesarCipherEncoder(
                "Bye BYE", 13);
        assertEquals("Olr OLR", testCaesarCipherEncoder.encryptUserText());
    }
    @Test
    public void encryptUserText_encryptsStringWithMultipleWordsWithSpacesAndSpecialCharacters_String() throws Exception {
        CaesarCipherEncoder testCaesarCipherEncoder=new CaesarCipherEncoder(
                "1. Kwesta%Khethile Khethile ft. @Makwa", 5);
        assertEquals("1. Pbjxyf%Pmjymnqj Pmjymnqj ky. @Rfpbf",
                testCaesarCipherEncoder.encryptUserText());
    }

}