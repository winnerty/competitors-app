import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

public class TestRST2 {

    @Test
    public void testController() {
        RestTemplate rt = new RestTemplate();

        String getResp = rt.getForObject("http://localhost:8080/competitors", String.class);
        System.out.println("GET response: " + getResp);

        String postResp = rt.postForObject("http://localhost:8080/competitors", null, String.class);
        System.out.println("POST response: " + postResp);
    }
}