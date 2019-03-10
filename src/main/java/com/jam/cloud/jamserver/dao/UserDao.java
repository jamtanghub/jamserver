package com.jam.cloud.jamserver.dao;

import com.jam.cloud.jamserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User,Long> {

    @Query("select o from User  o where  o.id = ?1")
    User getById(Long id);
}
