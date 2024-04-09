package com.example.restapisample.infrastructure.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.restapisample.domain.models.User;
import com.example.restapisample.domain.repositories.UserRepository;
import com.example.restapisample.infrastructure.entities.MUser;

@Repository
public class UserRepositoryImpl implements UserRepository {

  private final JdbcTemplate jdbcTemplate;

  public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public User selectUser(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'selectUserList'");

  }

  @Override
  public Collection<User> selectUserList() {

    List<MUser> userList = jdbcTemplate.query("SELECT * FROM m_user",
        new DataClassRowMapper<>(MUser.class));

    return userList.stream().map(x -> new User(x.getId(), x.getName(), x.getPassword(), x.getAge())).toList();

  }

  @Override
  public void insertUser(User user) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insertUser'");
  }

  @Override
  public void updateUser(User user) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
  }

  @Override
  public void deleteUser(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
  }

}
