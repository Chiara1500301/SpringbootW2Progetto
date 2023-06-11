package com.epicode.gestione_dispositivi_aziendali.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Utente {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String username;
	    private String nome;
	    private String cognome;
	    private String email;

	    public Utente() {
	    }

	    public Utente(String username, String nome, String cognome, String email) {
	        this.username = username;
	        this.nome = nome;
	        this.cognome = cognome;
	        this.email = email;
	    }

	    // Getter e setter

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCognome() {
	        return cognome;
	    }

	    public void setCognome(String cognome) {
	        this.cognome = cognome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

		public CharSequence getPassword() {
			return null;
		}

		public void setPassword(String encode) {
			
		}

		public Collection<? extends GrantedAuthority> getRoles() {
			return null;
		}

		public boolean getActive() {
			// TODO Auto-generated method stub
			return false;
		}
}
