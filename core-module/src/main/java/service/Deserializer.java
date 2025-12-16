package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Competitor;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Deserializer {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public Competitor deserialize() {
        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream("2.json");
            Competitor competitor = objectMapper.readValue(is, Competitor.class);
            System.out.println(competitor);
            return competitor;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Competitor> scanFolder(String folderPath) {
        List<Competitor> competitors = new ArrayList<>();
        File folder = new File(folderPath);
        File[] jsonFiles = folder.listFiles((dir, name) -> name.endsWith(".json"));

        assert jsonFiles != null;
        for (File file : jsonFiles) {
            try {
                String json = Files.readString(file.toPath());
                Competitor competitor = objectMapper.readValue(json, Competitor.class);
                competitors.add(competitor);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return competitors;
    }
}
