package com.mskapp.msk.repo;

import com.mskapp.msk.modell.UsersModell;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Entity (UsersModell) & Primary Key Type
public interface UsersRepo extends JpaRepository<UsersModell, Integer> {

    Optional<UsersModell>findByEmailAndPassword(String email, String password);
}
