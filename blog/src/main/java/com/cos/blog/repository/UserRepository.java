package com.cos.blog.repository;

import com.cos.blog.model.User;

//DAO
//자동으로 bean 등록됨
//@repository //생략 가능

public interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<User,Integer> {


}
