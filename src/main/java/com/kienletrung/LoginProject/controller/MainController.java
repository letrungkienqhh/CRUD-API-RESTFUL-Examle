package com.kienletrung.LoginProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kienletrung.LoginProject.UserDao;
import com.kienletrung.LoginProject.entity.User;

@RestController
public class MainController {
	@Autowired
	private UserDao userDao;

	@ResponseBody
	@RequestMapping(value = { "/", "/home" })
	public String home() {
		return "Welcome my app";
	}

	@ResponseBody
	@RequestMapping(value = { "/users" }, method = RequestMethod.GET	, produces = { MediaType.APPLICATION_JSON_VALUE,
			 		MediaType.APPLICATION_XML_VALUE})
	public  List<User> users() {
		List<User> userList= this.userDao.getlist();
		return userList;
	}

	@ResponseBody
	@RequestMapping(value = { "/user" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public User addUser(User user) {
		System.out.println("add user" + user.getId());
		this.userDao.addUser(user);
		return user;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/{id}" }, method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public User getUser(@PathVariable("id") String id) {
		return this.userDao.getUser(id);

	}
	@ResponseBody
	@RequestMapping(value = {"/user/delete/{id}"},
					method= RequestMethod.DELETE,
					produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public void deleteUser(@PathVariable("id") String id ) {
		System.out.println("Delete user having id =" +id);
		 this.userDao.deleteUser(id);
	}
}
