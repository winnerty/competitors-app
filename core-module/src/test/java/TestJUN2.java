import model.Competitor;
import org.junit.jupiter.api.Test;
import service.Deserializer;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestJUN2 {

    @Test
    public void testScanCompetitorFolder() {
        Deserializer service = new Deserializer();
        List<Competitor> competitors = service.scanFolder("src/test/resources/competitors-dump");

        assertNotNull(competitors);
        assertEquals(6, competitors.size());

        Competitor c = competitors.getFirst();

        assertNotNull(c.getName());
        assertTrue(Integer.parseInt(c.getAge()) > 0);
    }
}