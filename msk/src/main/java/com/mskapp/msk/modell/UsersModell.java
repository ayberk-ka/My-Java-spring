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
    String user_name;
    String password;
    String email;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersModell that = (UsersModell) o;
        return Objects.equals(user_id, that.user_id) && Objects.equals(user_name, that.user_name) && Objects.equals(password, that.password) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, user_name, password, email);
    }

    @Override
    public String toString() {
        return "UsersModell{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
