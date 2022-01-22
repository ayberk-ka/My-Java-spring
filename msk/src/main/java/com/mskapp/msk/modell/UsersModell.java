package com.mskapp.msk.modell;


import javax.persistence.*;
import java.util.Objects;

@Entity
// Table name in Database
@Table(name = "accounts")
public class UsersModell {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer user_id;
    String email;
    String password;
    String first_name;
    String last_name;
    String gender;
    String date_of_birth;



    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getFirst_name() {return first_name;}

    public void setFirst_name(String first_name) {this.first_name = first_name;}


    public String getLast_name() {return last_name;}

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public String getGender() {return gender;}

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getDate_of_birth() {return date_of_birth;}

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersModell that = (UsersModell) o;
        return Objects.equals(user_id, that.user_id)
                && Objects.equals(email, that.email)
                && Objects.equals(password, that.password)
                && Objects.equals(first_name, that.first_name)
                && Objects.equals(last_name, that.last_name)
                && Objects.equals(gender, that.gender)
                && Objects.equals(date_of_birth, that.date_of_birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, email, password, first_name , last_name, gender, date_of_birth);
    }

    @Override
    public String toString() {
        return "UsersModell{" +
                "user_id=" + user_id +
                ", email='" + email + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                '}';
    }
}
