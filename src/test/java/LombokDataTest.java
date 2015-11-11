import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LombokDataTest {

    @Test
    public void lombok() {
        final LombokData me = new LombokData("juraj", "martinka", 30);
        assertThat(me.getName(), is("juraj"));
        assertThat(me.getSurname(), is("martinka"));
        assertThat(me.getAge(), is(30));

    }

    @Test
    public void lombokMock() {
        final LombokData me = mock(LombokData.class);
        when(me.getName()).thenReturn("hala");
        assertThat(me.getName(), is("hala"));

    }
}