import it.duccio.model.Speaker;
import it.duccio.service.SpeakerService;
import it.duccio.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {
        /*
        The purpose of this application is to demostrate how the spring framework simplify the configuration steps.
        In this case configuration are not in a xml file but it's all coded in a class annotated with @Configuration
        This class contains 2 methods annotated with @Bean, it means they live in the spring context and are managed from the
        spring framework.
        Another argument treated is the Dependency injection using the constructor
         */

    // Get application context throw the @Configuration annotation used in the AppConfig class
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    // Get a bean from the Spring context specifying name and class
    SpeakerService service = context.getBean("speakerService", SpeakerService.class);

    System.out.println(service.findAll().get(0).getFirstName());
  }
}
