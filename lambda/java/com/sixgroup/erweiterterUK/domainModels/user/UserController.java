package com.sixgroup.erweiterterUK.domainModels.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("")
    public @ResponseBody ResponseEntity<User> getBestEarningUser() {
        return new ResponseEntity<User>(userService.getBestEarningUser(), HttpStatus.OK);
    }

    //Aufgabe 1:
    @GetMapping("")
    public @ResponseBody ResponseEntity<User> getWorstEarningUser() {
        return new ResponseEntity<User>(userService.getWorstEarningUser(), HttpStatus.OK);
    }

    @GetMapping("")
    public @ResponseBody ResponseEntity<List<User>> allUsersWithEvenEarnings() {
        return new ResponseEntity<List<User>>(userService.allUsersWithEvenEarnings(), HttpStatus.OK);
    }

    @GetMapping("")
    public @ResponseBody ResponseEntity<List<User>> allUsersWithOddEarnings() {
        return new ResponseEntity<List<User>>(userService.allUsersWithOddEarnings(), HttpStatus.OK);
    }

    @GetMapping("")
    public @ResponseBody ResponseEntity<List<User>> allUsersEarningMoreThan() {
        return new ResponseEntity<List<User>>(userService.allUsersEarningMoreThan(2000), HttpStatus.OK);
    }

    @GetMapping("")
    public @ResponseBody ResponseEntity<List<User>> allUsersEarningLessThan() {
        return new ResponseEntity<List<User>>(userService.allUsersEarningLessThan(2000), HttpStatus.OK);
    }

    @GetMapping("")
    public @ResponseBody ResponseEntity<List<User>> allUsersEarningBetween() {
        return new ResponseEntity<List<User>>(userService.allUsersEarningBetween(2000, 3000), HttpStatus.OK);
    }

    //Zusätzliche Aufgabe:
    @GetMapping("")
    public @ResponseBody ResponseEntity<List<User>> allUsersAboveAverage() {
        return new ResponseEntity<List<User>>(userService.allUsersAboveAverage(), HttpStatus.OK);
    }

}