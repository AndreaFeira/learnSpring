package it.duccio.repository;

import it.duccio.model.Speaker;

import static java.util.Arrays.asList;

import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

  @Override
  public List<Speaker> findAll() {
    Speaker speaker = new Speaker();
    speaker.setFirstName("Duccio");
    speaker.setLastName("Oiccud");

    return asList(speaker);
  }
}
