package com.epicode.gestione_dispositivi_aziendali.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestione_dispositivi_aziendali.model.Utente;

@Repository
public interface UtentiRepository  extends JpaRepository<Utente, Long>{

	Optional<Utente> findByUsername(String username);
}
