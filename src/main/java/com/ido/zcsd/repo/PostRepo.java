package com.ido.zcsd.repo;

import com.ido.zcsd.entity.Post;
import com.ido.zcsd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Integer> {
}
