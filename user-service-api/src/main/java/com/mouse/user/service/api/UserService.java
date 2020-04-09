package com.mouse.user.service.api;

import com.mouse.user.service.api.response.UserDTO;

/**
 * @author mouse
 * @version 1.0
 * @date 2020-04-09
 * @description
 */
public interface UserService {

    UserDTO findByUserId(String userId);

}
