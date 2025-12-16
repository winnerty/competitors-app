import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;
import rest.dto.CompetitionDto;
import java.util.Arrays;
import java.util.List;

public class TestRST3 {

    @Test
    public void testEndToEnd() {
        RestTemplate rt = new RestTemplate();
        CompetitionDto dto = new CompetitionDto("Timofey", 20);
        rt.postForObject("http://localhost:8080/competitors", dto, Void.class);

        CompetitionDto[] response = rt.getForObject("http://localhost:8080/competitors", CompetitionDto[].class);
        Assertions.assertNotNull(response);
        List<CompetitionDto> list = Arrays.asList(response);
        assert !list.isEmpty();
    }
}