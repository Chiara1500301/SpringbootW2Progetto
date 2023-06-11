package com.epicode.gestione_dispositivi_aziendali.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.epicode.gestione_dispositivi_aziendali.model.Utente;
import com.epicode.gestione_dispositivi_aziendali.repository.UtentiRepository;

@Service
public class UserServiceImpl implements UtentiService {

    @Autowired
    private UtentiRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Utente saveUtente(Utente utente) {
        utente.setPassword(passwordEncoder.encode(utente.getPassword()));
        return UtentiRepository.save(utente);
    }

    @Override
    public Utente getUserByUsername(String username) {
        return UtentiRepository.findByUsername(username);
    }
}

