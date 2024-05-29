package br.com.tiago.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiago.api.domain.User;
import br.com.tiago.api.repositories.UserRepositorie;
import br.com.tiago.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepositorie repositorie;

	@Override
	public User findById(Integer id) {
		Optional<User> obj = repositorie.findById(id);
		return obj.orElse(null);
	}

	
}
