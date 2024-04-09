package com.example.restapisample.domain.services.impl;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.restapisample.domain.models.User;
import com.example.restapisample.domain.repositories.UserRepository;
import com.example.restapisample.domain.services.UserService;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User getUser(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUser'");
  }

  @Override
  public Collection<User> getUserList() {
    return userRepository.selectUserList();
  }

  @Override
  public void registerUser(String name, String password, int age) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'registerUser'");
  }

  @Override
  public void editUser(int id, String name, String password, int age) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'editUser'");
  }

  @Override
  public void deleteUser(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
  }

}
