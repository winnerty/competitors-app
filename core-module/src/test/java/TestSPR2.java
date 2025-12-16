import config.AppConfigSPR2;
import dao.CompetitorDAO;
import model.Competitor;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.Deserializer;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class TestSPR2 {

    @Test
    public void testLoadingIntoDatabase() throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigSPR2.class);
        DataSource ds = ctx.getBean(DataSource.class);
        CompetitorDAO dao = ctx.getBean(CompetitorDAO.class);

        try (Connection conn = ds.getConnection()) {
            Statement st = conn.createStatement();
            st.execute("CREATE TABLE competitors(id INT AUTO_INCREMENT, name VARCHAR(255), age INT)");
        }

        Deserializer deserializer = new Deserializer();
        List<Competitor> competitors = deserializer.scanFolder("src/test/resources/competitors-dump");
        for (Competitor c : competitors) {
            dao.save(c);
        }

        try (Connection conn = ds.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM competitors");
            rs.next();
            int count = rs.getInt(1);

            assert count == competitors.size();
        }

        ctx.close();
    }
}
