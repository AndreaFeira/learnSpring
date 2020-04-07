package it.duccio.service;

import it.duccio.model.Speaker;
import it.duccio.repository.SpeakerRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class SpeakerServiceImpl implements SpeakerService {

  private SpeakerRepository speakerRepository;

  public SpeakerServiceImpl() {
      System.out.println("SpeakerServiceImpl no args constructor");
  }

  // This is a constructor dependency injection
  public SpeakerServiceImpl(SpeakerRepository repository) {
    this.speakerRepository = repository;
  }

  @Autowired // SpeakerRepository dependency is satisfied by the bean configurated in AppConfig. It is injected from the application context.
  public void setSpeakerRepository(SpeakerRepository speakerRepository){
      System.out.println("Autowire setter in SpeakerServiceImpl with SpeakerRepository");
      this.speakerRepository = speakerRepository;
  }

  @Override
  public List<Speaker> findAll() {
    return speakerRepository.findAll();
  }
}
