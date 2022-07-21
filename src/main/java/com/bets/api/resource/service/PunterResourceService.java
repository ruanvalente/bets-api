package com.bets.api.resource.service;

import com.bets.api.dtos.PunterRequestDTO;
import com.bets.api.dtos.PunterResponseDTO;
import com.bets.api.entities.Punter;
import com.bets.api.exceptions.BetsException;
import com.bets.api.mappers.PunterMapper;
import com.bets.api.services.PunterService;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PunterResourceService {
    private final PunterService punterService;
    private final PunterMapper punterMapper;
    private final String FIND_MESSAGE = "Não foi possível recuperar o recurso. ID é obrigatório.";

    public PunterResourceService(PunterService punterService, PunterMapper punterMapper) {
        this.punterService = punterService;
        this.punterMapper = punterMapper;
    }

    public List<Punter> listAll () {
        return this.punterService.listAll();
    }

    public PunterResponseDTO save(PunterRequestDTO punterRequestDTO) {
        Punter punterConverted = punterMapper.sourceToDestination(punterRequestDTO);
        Punter punterSaved = punterService.save(punterConverted);

        return punterMapper.destinationToSource(punterSaved);
    }

    public PunterResponseDTO findById(Integer id) {
        if (Objects.isNull(id)) {
            throw new BetsException(HttpStatus.PRECONDITION_FAILED, FIND_MESSAGE);
        }
        Punter punter = punterService.findById(id);

        if (Objects.isNull(punter)) {
            throw new EmptyResultDataAccessException(1);
        }

        return punterMapper.destinationToSource(punter);
    }

    public PunterResponseDTO update(Integer id, PunterRequestDTO punterRequestDTO) {
        if (Objects.isNull(id)) {
            throw new BetsException(HttpStatus.PRECONDITION_FAILED, FIND_MESSAGE);
        }

        Punter punter = punterService.findById(id);

        if (Objects.isNull(punter)) {
            throw new EmptyResultDataAccessException(1);
        }

        punterMapper.updateSourceToDestination(punterRequestDTO, punter);

        return punterMapper.destinationToSource(punterService.save(punter));
    }

    public void delete(Integer id) {
        if (Objects.isNull(id)) {
            String DELETE_MESSAGE = "Não foi possível exluir o recurso. ID não pode ser nulo.";
            throw new BetsException(HttpStatus.PRECONDITION_FAILED, DELETE_MESSAGE);
        }
        Punter punter = punterService.findById(id);

        if (Objects.isNull(punter)) {
            throw new EmptyResultDataAccessException(1);
        }

        punterService.delete(id);
    }
}
