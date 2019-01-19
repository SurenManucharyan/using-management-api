package com.management.system.dao;

import com.management.system.beans.tableBeans.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {


    User findOneByUserNameAndPassword(String userName, String password);
    User findOneByAuthorization(String authorization);
    List<User> findAllByPositionIsLessThanEqual(Integer position);


}
