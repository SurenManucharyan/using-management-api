package com.management.system.service.implementation;

import com.management.system.beans.tableBeans.User;
import com.management.system.dao.UserRepository;
import com.management.system.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(String userName, String password) {
        return userRepository.findOneByUserNameAndPassword(userName, password);
    }

    @Override
    public User getUserByAuthorization(String authorization) {
        return userRepository.findOneByAuthorization(authorization);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public List<User> getAll(Integer position) {
        return userRepository.findAllByPositionIsLessThanEqual(position);
    }
}
