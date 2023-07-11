package com.example.demo.repository;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.example.demo.appUser.AppUser;
import jakarta.transaction.Transactional;

@Repository
@Transactional()
public interface AppUserRepository {
  Optional<AppUser> findByEmail(String email);
}
