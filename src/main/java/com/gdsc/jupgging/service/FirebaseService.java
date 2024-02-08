package com.gdsc.jupgging.service;

import com.gdsc.jupgging.domain.User;

public interface FirebaseService {

    public String insertUser(User user) throws Exception;

    public User getUserDetail(String id) throws Exception;

    public String updateUser(User user) throws Exception;

    public String deleteUser(String id) throws Exception;

}
