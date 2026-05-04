package org.tibo.warsha.repository;

import org.tibo.warsha.model.User;

import java.util.*;

public interface UserRepository {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void deleteById(Long id);
}
