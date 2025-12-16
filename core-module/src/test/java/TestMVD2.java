import model.Competitor;
import org.junit.jupiter.api.Test;

public class TestMVD2 {

    @Test
    public void testPrintCompetitor() {
        Competitor competitor = new Competitor();
        competitor.setGivenName("Timofey");
        competitor.setFamilyName("Karpeev");
        competitor.setCountry("Madagascar");
        System.out.println(competitor);
    }
}
