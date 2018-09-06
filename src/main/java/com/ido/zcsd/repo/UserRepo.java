package com.ido.zcsd.repo;

import com.ido.zcsd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
