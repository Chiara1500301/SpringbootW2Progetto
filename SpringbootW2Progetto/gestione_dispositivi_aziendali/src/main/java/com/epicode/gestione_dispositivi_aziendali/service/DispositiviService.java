package com.epicode.gestione_dispositivi_aziendali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestione_dispositivi_aziendali.model.Dispositivo;
import com.epicode.gestione_dispositivi_aziendali.repository.DispositiviRepository;


@Service
public class DispositiviService {

    private final DispositiviRepository dispositiviRepository;

    @Autowired
    public DispositiviService(DispositiviRepository dispositiviRepository) {
        this.dispositiviRepository = dispositiviRepository;
    }

    public List<Dispositivo> getAllDispositivi() {
        return dispositiviRepository.findAll();
    }

    public Dispositivo getDispositivoById(Long id) {
        return dispositiviRepository.findById(id).orElse(null);
    }

    public Dispositivo createDispositivo(Dispositivo dispositivo) {
        return dispositiviRepository.save(dispositivo);
    }

    public Dispositivo updateDispositivo(Long id, Dispositivo dispositivo) {
        Dispositivo existingDispositivo = dispositiviRepository.findById(id).orElse(null);
        if (existingDispositivo != null) {
            existingDispositivo.setTipo(dispositivo.getTipo());
            existingDispositivo.setStato(dispositivo.getStato());
            return dispositiviRepository.save(existingDispositivo);
        } else {
            return null;
        }
    }

    public boolean deleteDispositivo(Long id) {
        Dispositivo dispositivo = dispositiviRepository.findById(id).orElse(null);
        if (dispositivo != null) {
            dispositiviRepository.delete(dispositivo);
            return true;
        } else {
            return false;
        }
    }
}
