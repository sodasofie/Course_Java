package com.example.fitness.repositories;

import com.example.fitness.domain.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {
}
