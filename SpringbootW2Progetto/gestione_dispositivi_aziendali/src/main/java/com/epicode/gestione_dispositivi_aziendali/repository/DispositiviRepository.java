package com.epicode.gestione_dispositivi_aziendali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestione_dispositivi_aziendali.model.Dispositivo;

@Repository
public interface DispositiviRepository extends JpaRepository<Dispositivo, Long>{
}
