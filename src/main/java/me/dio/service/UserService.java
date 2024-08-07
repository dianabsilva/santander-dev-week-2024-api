package me.dio.service;

import me.dio.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> finbById(Long id);

    User create(User userToCreate);
}
