import it.duccio.repository.HibernateSpeakerRepositoryImpl;
import it.duccio.repository.SpeakerRepository;
import it.duccio.service.SpeakerService;
import it.duccio.service.SpeakerServiceImpl;
import it.duccio.util.CalendarFactory;
import java.util.Calendar;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // replace applicationContext.xml
@ComponentScan("it.duccio")
public class AppConfig {

  @Bean(name = "cal")
  public CalendarFactory getCalendarFactory() {
    System.out.println("Init bean CalendarFactory");
    CalendarFactory calendarFactory = new CalendarFactory();
    calendarFactory.addDays(2);
    return calendarFactory;
  }

  @Bean
  public Calendar cal() throws Exception {
    System.out.println("Init bean Calendar");
    return getCalendarFactory().getObject();
  }
}
