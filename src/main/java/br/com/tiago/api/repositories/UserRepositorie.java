package br.com.tiago.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiago.api.domain.User;

public interface UserRepositorie extends JpaRepository<User, Integer> {

}
