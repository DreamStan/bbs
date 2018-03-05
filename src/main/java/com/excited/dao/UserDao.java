package com.excited.dao;

import com.excited.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    User findUserByUserName(@Param("userName") String userName);

    User findUserByUserId(int id);

    void addUser(@Param("user") User user);

    void deleteUserByUserName(String username);

    void updateUserByUserName(User user);

    String getUserPasswordByUserName(String username);

    List<User> getAllUserInfo();
}
