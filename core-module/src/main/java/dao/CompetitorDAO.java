package dao;

import model.Competitor;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CompetitorDAO {

    private final DataSource dataSource;

    public CompetitorDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void save(Competitor competitor) {
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO competitors (name, age) VALUES (?, ?)");
            ps.setString(1, competitor.getName());
            ps.setInt(2, Integer.parseInt(competitor.getAge()));
            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

