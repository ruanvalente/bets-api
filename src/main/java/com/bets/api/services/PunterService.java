package com.bets.api.services;

import com.bets.api.entities.Punter;
import com.bets.api.respository.PunterRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PunterService {
    private final PunterRepository punterRepository;

    public PunterService(PunterRepository punterRepository) {
        this.punterRepository = punterRepository;
    }

    @Transactional
    public List<Punter> listAll () { return this.punterRepository.findAll();}

    @Transactional
    public Punter findById(Integer id) { return this.punterRepository.findById(id).orElse(null);}

    @Transactional
    public Punter save(Punter punter) {
        return this.punterRepository.save(punter);
    }
    @Transactional
    public void delete(Integer id) { this.punterRepository.deleteById(id);}
}
