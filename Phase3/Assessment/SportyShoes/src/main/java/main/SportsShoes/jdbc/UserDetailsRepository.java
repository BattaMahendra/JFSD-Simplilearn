package main.SportsShoes.jdbc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.SportsShoes.entity.UserDetails;



@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
	

	public List<UserDetails> findByusername(String username);
}
