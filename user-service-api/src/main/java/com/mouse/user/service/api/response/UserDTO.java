package com.mouse.user.service.api.response;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @author mouse
 * @version 1.0
 * @date 2020-04-09
 * @description
 */
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -5391962718269065195L;

    private String userId;

    private String username;

    private Integer age;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
