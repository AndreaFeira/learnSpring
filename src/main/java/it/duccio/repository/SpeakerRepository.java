package it.duccio.repository;

import it.duccio.model.Speaker;

import java.util.List;

public interface SpeakerRepository {

  List<Speaker> findAll();
}
