package br.com.tiago.api.service;

import br.com.tiago.api.domain.User;

public interface UserService {

	User findById(Integer id);
}
