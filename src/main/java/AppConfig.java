import it.duccio.repository.HibernateSpeakerRepositoryImpl;
import it.duccio.repository.SpeakerRepository;
import it.duccio.service.SpeakerService;
import it.duccio.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // replace applicationContext.xml
public class AppConfig {

  @Bean(name = "speakerService") // Get a spring bean instance named speakerService
  @Scope(value = BeanDefinition.SCOPE_SINGLETON) // A single instance for application context
  public SpeakerService getSpeakerService() {
    System.out.println("Creating bean speakerService");
    SpeakerServiceImpl speakerService = new SpeakerServiceImpl();

    return speakerService;
  }

  @Bean(name = "speakerRepository") // Get a spring bean instance named speakerRepository
  public SpeakerRepository getSpeakerRepository() {
    System.out.println("Creating bean speakerRepository");
    return new HibernateSpeakerRepositoryImpl();
  }
}
