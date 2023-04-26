package com.auth.JwTAuthentication.repository;

import com.auth.JwTAuthentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User , UUID> {
}
