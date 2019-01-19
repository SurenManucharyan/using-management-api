package com.management.system.beans.request;

import com.management.system.beans.tableBeans.User;

import javax.validation.constraints.Size;

public class EditUserRequest {
    @Size(min = 4)
    private String userName;

    @Size(min = 6)
    private String password;

    @Size(min = 2)
    private String firstName;

    @Size(min = 2)
    private String lastName;


    public User updateUser(User user){

        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.setPassword(this.password);
        user.setUserName(this.userName);

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

}
