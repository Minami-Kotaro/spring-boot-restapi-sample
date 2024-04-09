package com.example.restapisample.domain.services;

import java.util.Collection;

import com.example.restapisample.domain.models.User;

public interface UserService {

  User getUser(int id);

  Collection<User> getUserList();

  void registerUser(String name, String password, int age);

  void editUser(int id, String name, String password, int age);

  void deleteUser(int id);

}
