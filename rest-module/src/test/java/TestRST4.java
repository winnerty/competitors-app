import org.junit.jupiter.api.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import rest.CompetitionDto;

public class TestRST4 {

    private final RestTemplate rt = new RestTemplate();
    private final String base = "http://localhost:8080/competitors";

    @Test
    public void testPutPatchDelete() {
        CompetitionDto dto = new CompetitionDto("Tim", 20);
        rt.postForObject(base, dto, Void.class);

        CompetitionDto newDto = new CompetitionDto("Alice", 23);
        rt.put(base + "/0", newDto);

        CompetitionDto patchDto = new CompetitionDto();
        patchDto.setAge(25);

        HttpEntity<CompetitionDto> entity = new HttpEntity<>(patchDto, new HttpHeaders());
        rt.exchange(base + "/0", HttpMethod.PATCH, entity, Void.class);
        rt.delete(base + "/0");

        CompetitionDto[] arr = rt.getForObject(base, CompetitionDto[].class);
        assert arr.length == 0;
    }
}
