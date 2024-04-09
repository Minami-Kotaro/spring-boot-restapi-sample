package com.example.restapisample.domain.models;

public class User {

  public User(String id, String name, String password, int age) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.age = age;
  }

  private String id;

  private String name;

  private String password;

  private int age;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }

  public int getAge() {
    return age;
  }

}
