package br.com.tiago.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tiago.api.domain.User;

@Repository
public interface UserRepositorie extends JpaRepository<User, Integer> {

}
