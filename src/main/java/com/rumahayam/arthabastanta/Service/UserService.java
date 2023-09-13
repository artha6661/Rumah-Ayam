package com.rumahayam.arthabastanta.Service;

import java.util.List;

import com.rumahayam.arthabastanta.Bean.UserBean;
import com.rumahayam.arthabastanta.Entity.UserEntity;

public interface UserService {
    void saveUser(UserBean userDto);

    UserEntity findUserByEmail(String email);

    List<UserBean> findAllUsers();
}
