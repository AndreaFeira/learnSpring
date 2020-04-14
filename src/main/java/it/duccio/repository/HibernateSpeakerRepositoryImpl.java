package it.duccio.repository;

import it.duccio.model.Speaker;

import static java.util.Arrays.asList;

import java.util.List;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

  @Override
  public List<Speaker> findAll() {
    Speaker speaker = new Speaker();
    speaker.setFirstName("Duccio");
    speaker.setLastName("Oiccud");

    return asList(speaker);
  }
}
