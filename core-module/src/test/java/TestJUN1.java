import model.Competitor;
import org.junit.jupiter.api.Test;
import service.Deserializer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJUN1 {

    @Test
    public void testHeight() {
        Deserializer deserializer = new Deserializer();
        Competitor competitor = deserializer.deserialize();

        assertEquals("163", competitor.getHeight());
    }
}
