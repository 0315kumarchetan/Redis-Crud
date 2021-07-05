package com.demo.Controller;

import com.demo.Model.User;
import com.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/saveUser")
    public ResponseEntity<String> saveUser(@RequestBody User user){

        boolean result = userService.saveUser(user);

        if(result){
         return    ResponseEntity.ok("User save successfully");
        }
        else{
          return   ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @RequestMapping("/getUser/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id")  Long id){

        User user = userService.getUser(id);

        if(user !=null){
            return ResponseEntity.ok(user);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @RequestMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> user = userService.getAllUser();

        if(user != null){
            return ResponseEntity.ok(user);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){

        boolean result = userService.deleteUser(id);
        if(result){
            return ResponseEntity.ok("Delete Successfully!");
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PutMapping("/upadateUser/{id}")
     public ResponseEntity<String> updateUser(@PathVariable("id") Long id  , @RequestBody User user){

        boolean result =  userService.updateUser(id, user);
        if(result){
            return ResponseEntity.ok("Updated Successfully!");
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
     }

}
