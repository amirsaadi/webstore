package com.saadi.amir.model;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Amir on 2016-10-08.
 *  webstore
 */

@Entity
public class User  {
    @Id
    @GeneratedValue
    private int userId ;
    private String name;
    private String Email;
    private String password;
    @OneToMany
    private Collection<Topic> topics= new ArrayList<>();

    public User(){}

    public User(String name, String email, String password) {
        this.name = name;
        Email = email;
        this.password = password;
    }

    public Collection<Topic> getTopics() {
        return topics;
    }

    public void setTopics(Collection<Topic> topics) {
        this.topics = topics;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String userFirstname) {
        this.name = userFirstname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String userLastname) {
        this.Email = userLastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User users = (User) o;

        if (userId != users.userId) return false;
        if (name != null ? !name.equals(users.name) : users.name != null)
            return false;
        if (Email != null ? !Email.equals(users.Email) : users.Email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (Email != null ? Email.hashCode() : 0);
        return result;
    }


}
