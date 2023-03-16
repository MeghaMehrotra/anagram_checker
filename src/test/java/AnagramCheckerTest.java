import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mmehrotra
 */
public class AnagramCheckerTest {


    @Test
    public void testValidAnagrams() {
        assertTrue(AnagramChecker.areAnagrams("anagram", "nagamar"));
    }

    @Test
    public void testInvalidAnagrams(){
        assertFalse(AnagramChecker.areAnagrams("student", "sntudnt"));
    }

    @Test
    public void testValidAnagramsWithSpaces(){
        assertTrue(AnagramChecker.areAnagrams(" plus", "s upl"));
    }

    @Test
    public void testValidAnagramWithNumbers(){
        assertTrue(AnagramChecker.areAnagrams("1123", "3211"));
    }

    @Test
    public void testInvalidWithSpecialCharacters(){
        assertFalse(AnagramChecker.areAnagrams("lawyer!", "wlayer"));
    }
}
