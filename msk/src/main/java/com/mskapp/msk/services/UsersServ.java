package com.mskapp.msk.services;

import com.mskapp.msk.modell.UsersModell;
import com.mskapp.msk.repo.UsersRepo;
import org.springframework.stereotype.Service;

@Service
public class UsersServ {

    private final UsersRepo usersRepo;

    public UsersServ(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public UsersModell signUp_users
            (String email, String password, String first_name, String last_name, String gender, String date_of_birth)
    {
        if (email == null || password == null) {
            return null;

        } else {
            if(usersRepo.findFirstByEmail(email).isPresent()){
                System.out.println("You have already registered with this email");
                return null;
            }
            UsersModell usersModell = new UsersModell();
            usersModell.setEmail(email);
            usersModell.setPassword(password);
            usersModell.setFirst_name(first_name);
            usersModell.setLast_name(last_name);
            usersModell.setGender(gender);
            usersModell.setDate_of_birth(date_of_birth);
            return usersRepo.save(usersModell);
        }
    }

    public UsersModell validate(String email, String password){
        return  usersRepo.findByEmailAndPassword(email, password).orElse(null);
    }
}
