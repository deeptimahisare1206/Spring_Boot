package com.mypackage.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.mypackage.dao.UserRepository;
import com.mypackage.entity.User;

@Service
public class AllServices {
	
//	--------------Manual input in API --------------------------
	
	
//	List<User> li = new ArrayList<User>();
//	
//	public AllServices() {
//		User user1= new User();
//		user1.setUid(1);
//		user1.setUname("Deep");
//		user1.setAge(20);
//		
//		User user2= new User();
//		user2.setUid(2);
//		user2.setUname("Yogi");
//		user2.setAge(22);
//		
//		User user3= new User();
//		user3.setUid(3);
//		user3.setUname("Nano");
//		user3.setAge(21);
//		
//		
////		----------------x----------------x------------x--------------x------------
//		
//		li.add(user1);
//		li.add(user2);
//		li.add(user3);
//		
//	
//	}
////		----------------x----------------x------------x--------------x------------
//	public List<User> getAll(){
//		return li;
//	}

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/getAll")
	public Iterable<User> getAll(){
		Iterable<User> itr = userRepository.findAll();
		return itr;
	}
	
	
	
	
}
