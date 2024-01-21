package com.tunhub.server;

import com.tunhub.Entity.Users;

public interface UsersService {
public String addUser(Users user);
public boolean emailExists(String email);
public boolean validateUser(String password,String email);
public String getRole(String email);
public Users getUser(String email);
public void updateUser(Users user);
}
