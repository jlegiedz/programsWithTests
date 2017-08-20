import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Optional;
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
        Optional<Boolean> first = f.isFirst("3");
    assertTrue(first.isPresent());
    }
    @Test
    public void isDoubleNumFirst(){
        Optional<Boolean> first = f.isFirst("3.4");
        assertTrue(first.isPresent());
    }
    @Test
    public void isLargerNumFirst(){
        Optional<Boolean> first = f.isFirst("11");
        assertTrue(first.isPresent());
    }
    @Test
    public void numNotFirst(){
        Optional<Boolean> first = f.isFirst("4");
        assertFalse(first.get());
    }
    @Test
    public void equalsOne(){
        Optional<Boolean> first = f.isFirst("1");
        assertFalse(first.get());
    }
    @Test
    public void equalsZero(){
        Optional<Boolean> first = f.isFirst("0");
        assertFalse(first.get());
    }
    @Test
    public void notLargerThanOne(){
        Optional<Boolean> first = f.isFirst("-6");
        assertFalse(first.get());
    }
    @Test
    public void emptyString(){
        Optional<Boolean> first = f.isFirst("");
        assertFalse(first.isPresent());
    }
    @Test
    public void notParsabletoDouble()
    {
        Optional<Boolean> first = f.isFirst("jfghdg");
        assertFalse(first.isPresent());
    }
    @Test
    public void faileWhenNull(){
        Optional<Boolean> first = f.isFirst(null);
        assertFalse(first.isPresent());
    }

}
