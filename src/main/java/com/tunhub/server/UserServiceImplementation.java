

package com.tunhub.server;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunhub.Entity.Users;
import com.tunhub.repository.UserRepository;

@Service
public class UserServiceImplementation implements UsersService{
	@Autowired
	UserRepository repo;

@Override
	public String addUser(Users user) {
		// TODO Auto-generated method stub
		repo.save(user);
		return "user added succesfully";
	}


	@Override
	public boolean emailExists(String email) {
		// TODO Auto-generated method stub
		if(repo.findByEmail(email)==null) {
			return false;
		}
		else {
			return true;
		}
		}
@Override
	public boolean validateUser(String password, String email) {
		Users user=repo.findByEmail(email);
		String db_pass=user.getPassword();
		if(password.equals(db_pass)) {
		return true;
	}
	else {
		return false;
	}
	}
@Override
	public String getRole(String email) {
		Users user=repo.findByEmail(email);
		
		return user.getRole();
	}


@Override
public Users getUser(String email) {
return repo.findByEmail(email);
	
}


@Override
public void updateUser(Users user) {
repo.save(user);
	
}}