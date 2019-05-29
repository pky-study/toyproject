package com.example.toyproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.toyproject.model.User;

public interface UserDao extends JpaRepository <User, Integer> {

}