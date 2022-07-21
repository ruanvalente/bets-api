package com.bets.api.respository;

import com.bets.api.entities.Punter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PunterRepository extends JpaRepository<Punter, Integer> {
}

