package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping(value = "api/v1/user")
    @CrossOrigin

    public class UserController {
        @Autowired
        private UserService userService;

        @GetMapping("/getUser")
        public List<UserDTO> getUser() {
            return userService.getAllUsers();
        }

        @PostMapping("/saveUser") //This is the method declaration for the "saveUser" method

        // which takes a UserDTO object in the request body and returns a UserDTO object
        public UserDTO saveUser(@RequestBody UserDTO userDTO) {  //jason object data to java object
        // "saveUser" method of the UserService object and passes the userDTO object.returns the result of the "saveUser" method call.
          return  userService.saveUser(userDTO);
        }


        @PutMapping("/updateUser")
        public UserDTO updateUser(@RequestBody UserDTO userDTO) {

            return userService.updateuser(userDTO);
        }

        @DeleteMapping("/deleteUser")
        public boolean deleteUser(@RequestBody UserDTO userDTO) {

            return userService.deleteUser(userDTO);
        }

    }
