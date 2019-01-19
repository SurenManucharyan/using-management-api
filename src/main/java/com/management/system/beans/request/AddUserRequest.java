package com.management.system.beans.request;


import com.management.system.beans.tableBeans.User;
import com.management.system.utils.Generator;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.UUID;


public class AddUserRequest {

    @Size(min = 4)
    private String userName;

    @Size(min = 6)
    private String password;

    @Size(min = 2)
    private String firstName;

    @Size(min = 2)
    private String lastName;

    @Max(3)
    @Min(1)
    private Integer position;


    public User getUser(){
        User user = new User();

        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.setPassword(Generator.stringToSha256(this.password));
        user.setUserName(this.userName);
        user.setPosition(this.position);
        user.setAuthorization(UUID.randomUUID().toString());

        return user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
