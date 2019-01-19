package com.management.system.service.interfaces;


import com.management.system.beans.tableBeans.User;

import java.util.List;

public interface UserService {

    User getUser(String userName, String password);
    User getUserByAuthorization(String authorization);
    void saveUser(User user);
    void delete(User user);
    List<User> getAll(Integer position);

}
