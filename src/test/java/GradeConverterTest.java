import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradeConverterTest {

    private GradeConverter converter;
    @org.junit.Before
    public void setUp() throws Exception {
    }
    /*
    @org.junit.Test
    public void convert() {
    }*/
    @org.junit.Test
    public void testConverter1() {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testConverter2() {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected, actual);
    }
}