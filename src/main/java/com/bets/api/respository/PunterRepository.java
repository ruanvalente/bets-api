package com.bets.api.respository;

import com.bets.api.entities.Punter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PunterRepository extends JpaRepository<Punter, Long> {
}

