package it.duccio.service;

import it.duccio.model.Speaker;
import it.duccio.repository.SpeakerRepository;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("speakerService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {

  @Autowired
  private SpeakerRepository speakerRepository;

  @PostConstruct
  private void initializeBean(){
    System.out.println("Init the bean! This method is called after the constructor");
  }

  @Override
  public List<Speaker> findAll() {
    return speakerRepository.findAll();
  }
}
