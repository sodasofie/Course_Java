package com.example.fitness.repositories;

import com.example.fitness.domain.Memberships;
import org.springframework.data.repository.CrudRepository;

public interface MembershipsRepository extends CrudRepository<Memberships, Long> {
}
