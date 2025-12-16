package config;

import dao.CompetitorDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.h2.jdbcx.JdbcDataSource;
import javax.sql.DataSource;

@Configuration
public class AppConfigSPR2 {

    @Bean
    public DataSource dataSource() {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");
        ds.setUser("sa");
        ds.setPassword("");
        return ds;
    }

    @Bean
    public CompetitorDAO competitorDAO(DataSource ds) {
        return new CompetitorDAO(ds);
    }
}
