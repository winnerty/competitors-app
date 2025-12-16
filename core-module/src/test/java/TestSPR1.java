import config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSPR1 {

    @Test
    public void testSpringInjection() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        String message = context.getBean(String.class);
        System.out.println(message);
        context.close();
    }
}
