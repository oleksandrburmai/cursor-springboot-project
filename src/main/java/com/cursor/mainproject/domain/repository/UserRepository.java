package com.cursor.mainproject.domain.repository;

import com.cursor.mainproject.domain.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
