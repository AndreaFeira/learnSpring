package it.duccio.repository;

import static java.util.Arrays.asList;

import it.duccio.model.Speaker;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

  @Autowired
  private Calendar calendar;

  @Override
  public List<Speaker> findAll() {
    Speaker speaker = new Speaker();
    speaker.setFirstName("Duccio");
    speaker.setLastName("Oiccud");

    System.out.println("cal: " + calendar.getTime());

    return asList(speaker);
  }
}