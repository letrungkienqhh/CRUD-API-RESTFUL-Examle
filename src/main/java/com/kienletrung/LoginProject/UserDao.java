package com.kienletrung.LoginProject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.kienletrung.LoginProject.entity.User;

@Repository
public class UserDao {
	private static final Map<String, User> listUser = new HashMap<String, User>();
	static {
		init();
	}

	private static void init() {
		User u1 = new User("1", "AAAA", "33sgsg3333");
		User u2 = new User("2", "BBBB", "3333asd33");
		User u3 = new User("3", "CCCC", "3332");
		User u4 = new User("4", "DDDD", "333333");
		User u5 = new User("5", "EEEE", "33wafgda3333");
		User u6 = new User("6", "FFFF", "3333sdaw33");
		listUser.put(u1.getId(), u1);
		listUser.put(u2.getId(), u2);
		listUser.put(u3.getId(), u3);
		listUser.put(u4.getId(), u4);
		listUser.put(u5.getId(), u5);
		listUser.put(u6.getId(), u6);

	}

	public User getUser(String id) {
		return listUser.get(id);
	}

	public User updateUser(User user) {
		listUser.put(user.getId(), user);
		return user;
	}

	public User addUser(User user) {
		listUser.put(user.getId(), user);
		return user;
	}

	public void deleteUser(String id) {
		listUser.remove(id);
	}
	
	public List<User> getlist() {
		// TODO Auto-generated method stub
		return (List<User>) listUser.values();
	}

}
