package it.duccio.service;

import it.duccio.model.Speaker;
import it.duccio.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository speakerRepository;

    // This is a constructor dependency injection
    public SpeakerServiceImpl(SpeakerRepository repository){
        this.speakerRepository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }
}
