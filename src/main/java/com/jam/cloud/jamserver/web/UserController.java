package com.jam.cloud.jamserver.web;

import com.jam.cloud.jamserver.data.ReContent;
import com.jam.cloud.jamserver.entity.User;
import com.jam.cloud.jamserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/id/{id}")
    public ReContent getById(@PathVariable Long id){
        ReContent reContent = ReContent.succ();

        User user = userService.getById(id);

        reContent.setContent(user);

        return reContent;
    }

    @GetMapping(value = "/hello")
    public ReContent hello(){
        return ReContent.succ();
    }


}
