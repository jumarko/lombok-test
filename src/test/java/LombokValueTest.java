import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LombokValueTest {

    @Test
    public void immutable() {
        final LombokValue lombokValue = new LombokValue("ahoj", "len", 88);
        // you can try to assign value to the age which fails with compilation error
//        lombokValue.age = 10;
        assertThat(lombokValue.getAge(), is(88));
    }

    @Test
    public void other() {
        final LombokValue value = new LombokValue("name1", "surname1", 100);
        assertThat(value.other(), is("ahoj"));

    }
}