package com.epicode.gestione_dispositivi_aziendali.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epicode.gestione_dispositivi_aziendali.model.Utente;
import com.epicode.gestione_dispositivi_aziendali.repository.UtentiRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UtentiRepository utentiRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Utente> user = utentiRepository.findByUsername(username);

		if (user.isPresent()) {
			return UserDetailsImpl.build(user.get());
		} else {
			throw new UsernameNotFoundException("User Not Found with username: " + username);
		}
	}

}
