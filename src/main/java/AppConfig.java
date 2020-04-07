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
        /*
        Why we call getSpeakerRepository instead of instantiate a new HibernateSpeakerRepositoryImpl?
        Because getSpeakerRepository is a bean in the Spring context and it is SINGLETON
        If we instantiate a new HibernateSpeakerRepositoryImpl, each time this method is called we'll get a new instance */
    return new SpeakerServiceImpl(getSpeakerRepository()); // <- satisfy the dependency using a bean
  }

  @Bean(name = "speakerRepository") // Get a spring bean instance named speakerRepository
  public SpeakerRepository getSpeakerRepository() {
    return new HibernateSpeakerRepositoryImpl();
  }
}
