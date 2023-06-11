package com.epicode.gestione_dispositivi_aziendali.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Dispositivo {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String tipo;
	    private String stato;

	    public Dispositivo() {
	    }

	    public Dispositivo(String tipo, String stato) {
	        this.tipo = tipo;
	        this.stato = stato;
	    }


	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }

	    public String getStato() {
	        return stato;
	    }

	    public void setStato(String stato) {
	        this.stato = stato;
	    }
}
