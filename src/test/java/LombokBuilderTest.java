import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LombokBuilderTest {

    @Test
    public void builder() {
        final LombokBuilder lombok = new LombokBuilder.LombokBuilderBuilder()
                .name("me")
                .motherName("mother")
                .build();

        assertThat(lombok.getMotherName(), is("mother"));
    }
}