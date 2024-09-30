package com.backbill.crst_backbill.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backbill.crst_backbill.entity.User;
 

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	public User save(User user); 
	
	User findByEmailAndPassword(String email, String password);
	
}
