package com.bets.api.controller;

import com.bets.api.dtos.PunterRequestDTO;
import com.bets.api.dtos.PunterResponseDTO;
import com.bets.api.entities.Punter;
import com.bets.api.services.punterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/punters")
@RestController
public class PunterController {
    private final com.bets.api.services.punterService punterService;

    public PunterController(punterService punterService) {
        this.punterService = punterService;
    }

    @PostMapping
    public ResponseEntity<Punter> createPunter(@RequestBody Punter punterRequest) {
        Punter punterResponse = this.punterService.savePunter(punterRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(punterResponse);
    }
}
