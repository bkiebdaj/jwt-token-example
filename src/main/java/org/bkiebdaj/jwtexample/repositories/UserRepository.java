package org.bkiebdaj.jwtexample.repositories;

import org.bkiebdaj.jwtexample.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    List<User> findAll();
}
