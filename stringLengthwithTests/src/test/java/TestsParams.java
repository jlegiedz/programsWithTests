import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class TestsParams {

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
        assertEquals(1, m.longestChain("2"));
    }

    @Test
    public void sameChars() {
        assertEquals(11, m.longestChain("wwwwwwwwwww"));
    }

    @Test
    @Parameters({
            // expected value and input can be also separated
            "werjfpltmsyt386|1",
            "38564399999999999906|12",
            "abbccddddfffffff|7",
            "o|1",
            "aaaabbb|4",
            "aaabbbb|4",
            "\"\n\n\n\n\"|4",
            "\"\b\b\b\b\t\t\t\"|4",
            "\"     \b\b\b\b\"|5",
            "るるあああ|3",
            "あああaaaa|4"
    })
    public void parametrizedTest(String input, int expected) {
        assertEquals(expected, m.longestChain(input));
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
    public void isLongerStringLengthValid() {
        assertEquals(9, m.lengthValid("123456789"));
    }

}