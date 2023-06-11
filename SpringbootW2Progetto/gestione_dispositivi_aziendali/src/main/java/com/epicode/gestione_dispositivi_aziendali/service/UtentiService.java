package com.epicode.gestione_dispositivi_aziendali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestione_dispositivi_aziendali.model.Utente;
import com.epicode.gestione_dispositivi_aziendali.repository.UtentiRepository;

@Service
public class UtentiService {

    private final UtentiRepository utentiRepository;

    @Autowired
    public UtentiService(UtentiRepository utentiRepository) {
        this.utentiRepository = utentiRepository;
    }

    public List<Utente> getAllUtenti() {
        return utentiRepository.findAll();
    }

    public Utente getUtenteById(Long id) {
        return utentiRepository.findById(id).orElse(null);
    }

    public Utente createUtente(Utente utente) {
        return utentiRepository.save(utente);
    }

    public Utente updateUtente(Long id, Utente utente) {
        Utente existingUtente = utentiRepository.findById(id).orElse(null);
        if (existingUtente != null) {
            existingUtente.setUsername(utente.getUsername());
            existingUtente.setNome(utente.getNome());
            existingUtente.setCognome(utente.getCognome());
            existingUtente.setEmail(utente.getEmail());
            return utentiRepository.save(existingUtente);
        } else {
            return null;
        }
    }

    public boolean deleteUtente(Long id) {
        Utente utente = utentiRepository.findById(id).orElse(null);
        if (utente != null) {
            utentiRepository.delete(utente);
            return true;
        } else {
            return false;
        }
    }
}
