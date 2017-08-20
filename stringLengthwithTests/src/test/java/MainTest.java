import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    Main m;

    @Before
    public void setup() {
        m = new Main();
    }
    @Test
    public void nullString() {
        int length = m.longestChain(null);
        assertEquals(0, length);
    }
    @Test
    public void singleChar() {
        assertEquals(1, m.longestChain("w"));
    }
    @Test
    public void singleDigit() {
        assertEquals(1,m.longestChain("2"));
    }
    @Test
    public void sameChars() {
        assertEquals(11,m.longestChain("wwwwwwwwwww"));
    }
    @Test
    public void notSameChars() {
        assertEquals(1, m.longestChain("werjfpltmsyt386"));
    }
    @Test
    public void sameDigits() {
        assertEquals(12, m.longestChain("38564399999999999906"));
    }
    @Test
    public void veryLongString() {
        assertEquals(42, m.longestChain(
                "aio;ioahsg;uioa8osijaohfoasifh" +
                        "ajkbgauihgauih;fiosdhfaohdfouahdffiosdhfaohdfouahdf" +
                        "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy" +
                        "hfiisjdufijcioephcasggcaoihgffaougfiahdf"));
    }
    @Test
    public void emptyString() {
        assertEquals(0, m.longestChain(""));
    }
    @Test
    public void abcString() {
        assertEquals(7, m.longestChain("abbccddddfffffff"));
    }
    @Test
    public void specialSigns() {
        assertEquals(7, m.longestChain("\n\n\n\n\n\n\n"));
    }
    @Test
    public void isStringLengthValid() {
        assertEquals(1, m.lengthValid("o"));
    }
    @Test
    public void isNullStringLengthValid() {
        assertEquals(0, m.lengthValid(null));
    }
    @Test
    public void isLongerStringLengthValid() {
        assertEquals(9, m.lengthValid("123456789"));
    }

}