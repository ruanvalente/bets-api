package com.bets.api.services;

import com.bets.api.dtos.PunterRequestDTO;
import com.bets.api.dtos.PunterResponseDTO;
import com.bets.api.entities.Punter;
import com.bets.api.respository.PunterRepository;
import org.springframework.stereotype.Service;

@Service
public class punterService {
    private final PunterRepository punterRepository;

    public punterService(PunterRepository punterRepository) {
        this.punterRepository = punterRepository;
    }

    public Punter savePunter(Punter punter) {
        return this.punterRepository.save(punter);
    }
}
