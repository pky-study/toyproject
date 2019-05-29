package com.example.toyproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.toyproject.dao.UserDao;
import com.example.toyproject.model.User;

@RestController
public class HelloRestController {
	@Autowired
	private UserDao userDao;

	@RequestMapping("/add")
	public User add(User user) {

		User helloData = userDao.save(user);

		return helloData;
	}

	@RequestMapping("/list")
	public List<User> list(Model model) {

		List<User> userList = userDao.findAll();

		return userList;
	}
	@RequestMapping("/")
	public String index() {
		return "helloworld!";
	}
}