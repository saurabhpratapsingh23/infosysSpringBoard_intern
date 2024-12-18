package com.rentalappapi.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rentalappapi.api.entity.saurabhUser;
import com.rentalappapi.api.model.UserRequestBody;
import com.rentalappapi.api.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository urepo;

    //get methods ------------------------------------------------------------------->
    public List<saurabhUser> listallusers() {
        return urepo.findAll();
    }

    public saurabhUser getUserbyid(int id){
        return urepo.findById(id).orElse(new saurabhUser());
    }
    //post methods ------------------------------------------------------------------>
    public String addUser(UserRequestBody user) {
        saurabhUser nuser = new saurabhUser();
        nuser.setUserId(user.getUserId());
        nuser.setFirstName(user.getFirstName());
        nuser.setLastName(user.getLastName());
        nuser.setEmail(user.getEmail());
        nuser.setPasswordHash(user.getPasswordHash());
        nuser.setPhoneNumber(user.getPhoneNumber());
        nuser.setRegistrationDate(user.getRegistrationDate());
        nuser.setUserType(null);
        urepo.save(nuser);
        return "User Added Successfully";
    }
    //put methods ------------------------------------------------------------------>
    public String UpdateUser(UserRequestBody user) {
        saurabhUser nuser = new saurabhUser();
        nuser.setUserId(user.getUserId());
        nuser.setFirstName(user.getFirstName());
        nuser.setLastName(user.getLastName());
        nuser.setEmail(user.getEmail());
        nuser.setPasswordHash(user.getPasswordHash());
        nuser.setPhoneNumber(user.getPhoneNumber());
        nuser.setRegistrationDate(user.getRegistrationDate());
        nuser.setUserType(null);
        urepo.save(nuser);
        return "User update Successfull";
    }

    //delete method ------------------------------------------------------------------------------>

    public String DeleteUser(int id) {
        urepo.deleteById(id);
        return "user deleted";
    }
}
