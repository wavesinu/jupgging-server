package com.gdsc.jupgging.controller;

import com.gdsc.jupgging.domain.User;
import com.gdsc.jupgging.service.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirebaseController {

    @Autowired
    FirebaseService firebaseService;

    @GetMapping("/insertUser")
    public String insertUser(@RequestParam User user) throws Exception {
        return firebaseService.insertUser(user);
    }

    @GetMapping("/getUserDetail")
    public User getUserDetail(@RequestParam String id) throws Exception {
        return firebaseService.getUserDetail(id);
    }

    @GetMapping("/updateUser")
    public String updateUser(@RequestParam User user) throws Exception {
        return firebaseService.updateUser(user);
    }

    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam String id) throws Exception {
        return firebaseService.deleteUser(id);
    }

}
