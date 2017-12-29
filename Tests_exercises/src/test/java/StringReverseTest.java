import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class StringReverseTest {


    @Parameters
    private Object[] getStrings() {
        return new Object[]{
                new Object[]{"abcdefg", "gfedcba"},
                new Object[]{"Ala ma kota, a kot ma Ale", "elA am tok a ,atok am alA"}};

    }


    @Test
    @Parameters(method = "getStrings")
    public void validStringtoBeReversed(String toReverse, String valid) {
        Assert.assertEquals(valid, StringReverse.reverse(toReverse));
    }

}
