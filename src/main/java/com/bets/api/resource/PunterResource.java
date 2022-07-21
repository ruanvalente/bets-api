package com.bets.api.resource;

import com.bets.api.dtos.PunterRequestDTO;
import com.bets.api.dtos.PunterResponseDTO;
import com.bets.api.entities.Punter;
import com.bets.api.mappers.PunterMapper;
import com.bets.api.resource.service.PunterResourceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(value = "/punters")
@RestController
public class PunterResource {

    private final PunterResourceService punterResourceService;
    private final PunterMapper punterMapper;

    public PunterResource(PunterResourceService punterResourceService, PunterMapper punterMapper) {
        this.punterResourceService = punterResourceService;
        this.punterMapper = punterMapper;
    }

    @GetMapping
    public List<Punter> listAll() {
        return punterResourceService.listAll();
    }

    @PostMapping
    public ResponseEntity<PunterResponseDTO> createPunter(@Valid @RequestBody PunterRequestDTO punterRequestDTO) {
       PunterResponseDTO punter = punterResourceService.save(punterRequestDTO);
       return ResponseEntity.status(HttpStatus.CREATED).body(punter);
    }
}
