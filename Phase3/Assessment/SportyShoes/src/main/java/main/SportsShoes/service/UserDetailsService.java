package main.SportsShoes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.SportsShoes.entity.UserDetails;
import main.SportsShoes.jdbc.UserDetailsRepository;

@Service
public class UserDetailsService {
	@Autowired
	UserDetailsRepository userRepo;
	
	//public List<UserDetails> listAll(){
		//List<UserDetails> ud=new ArrayList<UserDetails>();
		//ud= userRepo.findAll();
		//System.out.println("userdetails "+ud);
		//return ud;
	//}
	
	
	public List<UserDetails> listAll()
	{
		return userRepo.findAll();
	}
	
	public List<UserDetails> get(String username) {
		return userRepo.findByusername(username);
	}


/*public List<UserDetails> searchUsers(String username) {
		
		
		List<UserDetails> su= new ArrayList<UserDetails>();	
		su= userRepo.findByusername(username);
		return su;	
		
		
	}*/
}


