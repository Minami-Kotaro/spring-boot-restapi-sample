package com.example.restapisample.domain.repositories;

import java.util.Collection;

import com.example.restapisample.domain.models.User;

public interface UserRepository {

  User selectUser(int id);

  Collection<User> selectUserList();

  void insertUser(User user);

  void updateUser(User user);

  void deleteUser(int id);
  
}
