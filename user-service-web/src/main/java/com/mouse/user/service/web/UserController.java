package com.mouse.user.service.web;

import com.mouse.user.service.api.UserService;
import com.mouse.user.service.api.response.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotBlank;

/**
 * @author mouse
 * @version 1.0
 * @date 2020-04-09
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/get")
    public UserDTO findByUserId(@NotBlank String userId){
        return userService.findByUserId(userId);
    }

}
