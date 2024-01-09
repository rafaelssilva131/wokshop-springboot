package com.cursoudemy.course.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
