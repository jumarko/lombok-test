import org.junit.Test;

import static org.junit.Assert.*;

public class LomboLoggerTest {

    @Test
    public void log() {
        new LomboLogger().loggingMethod("ahoj");
    }
}