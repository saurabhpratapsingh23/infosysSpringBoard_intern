package com.rentalappapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rentalappapi.api.entity.saurabhUser;
import com.rentalappapi.api.model.UserRequestBody;
import com.rentalappapi.api.service.UserService;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService uservice;

    //get method -------------------------------------------------------------------------------------->

    @GetMapping("/listAllUsers")
    public List<saurabhUser> listallusers(){
        return uservice.listallusers();
    }
    @GetMapping("/GetUserById/{id}")
    public saurabhUser GetUserById(@PathVariable int id) {
        return uservice.getUserbyid(id);
    }

    //post method --------------------------------------------------------------------------------------->

    @PostMapping("/CreateUser")
    public String CreateUser (@RequestBody UserRequestBody user) {
        return uservice.addUser(user);
    }

    //put method --------------------------------------------------------------------------------------->

    @PutMapping("/UpdateUser")
    public String UpdateUser (@RequestBody UserRequestBody user) {
        return uservice.UpdateUser(user);
    }

    //delete method ----------------------------------------------------------------------------------->
    @DeleteMapping("/DeleteUser/{id}")
    public String DeleteUser (@PathVariable int id) {
        return uservice.DeleteUser(id);
    }
}
