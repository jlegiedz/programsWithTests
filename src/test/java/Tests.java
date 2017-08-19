import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;



/**
 * Created by asia on 19/08/17.
 */
public class Tests {
    FirstNumbers f;

    @Before
    public void setup(){
        f = new FirstNumbers();
    }

    @Test
    public void isNumFirst(){
    boolean first = f.isFirst("3");
    assertTrue(first);
    }
    @Test
    public void isDoubleNumFirst(){
        boolean first = f.isFirst("3.4");
        assertTrue(first);
    }
    @Test
    public void isLargerNumFirst(){
        boolean first = f.isFirst("11");
        assertTrue(first);
    }

    @Test
    public void numNotFirst(){
        boolean first = f.isFirst("4");
        assertFalse(first);
    }

    @Test
    public void equalsOne(){
        boolean first = f.isFirst("1");
        assertFalse(first);
    }
    @Test
    public void equalsZero(){
        boolean first = f.isFirst("0");
        assertFalse(first);
    }
    @Test
    public void notLargerThanOne(){
        boolean first = f.isFirst("-6");
        assertFalse(first);
    }
    @Test(expected = NumberFormatException.class)
    public void notParsableShouldthrowException() throws NumberFormatException
    {
        boolean first = f.isFirst("jfghdg");
    }

    @Test(expected = NullPointerException.class)
    public void entryIsNullShouldThrowException(){
        boolean first = f.isFirst(null);
    }

}
