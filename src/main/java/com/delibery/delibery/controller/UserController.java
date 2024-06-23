package com.delibery.delibery.controller;

import com.delibery.delibery.entity.User;
import com.delibery.delibery.repository.UserRepository;
import com.delibery.delibery.service.UserServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping(path="/alluser")
    public UserServices getUserServices() {
        return userServices;
    }


    @PostMapping(path="/adduser")
    public @ResponseBody String saveUserService(@RequestParam String username, @RequestParam String surname
    , @RequestParam String domicile) {
        User newUser = new User(username, surname, domicile);
        return "saved";
    }
    public Optional<User> findUserById(Long id){
        Optional<User> user = userServices.getUserById(id);
        return user;
    }
}
