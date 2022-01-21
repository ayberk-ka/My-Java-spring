package com.mskapp.msk.services;

import com.mskapp.msk.modell.UsersModell;
import com.mskapp.msk.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServ {

    private final UsersRepo usersRepo;

    public UsersServ(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public UsersModell sginUp_users(String user_name, String password, String email){
        if (email == null || password == null) {
            return null;

        } else {
            UsersModell usersModell = new UsersModell();
            usersModell.setUser_name(user_name);
            usersModell.setPassword(password);
            usersModell.setEmail(email);
            return usersRepo.save(usersModell);
        }
    }

    public UsersModell validate(String email, String password){
        return  usersRepo.findByEmailAndPassword(email, password).orElse(null);
    }
}
