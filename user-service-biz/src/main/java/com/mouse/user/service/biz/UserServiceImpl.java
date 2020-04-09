package com.mouse.user.service.biz;

import com.mouse.user.service.api.UserService;
import com.mouse.user.service.api.response.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author mouse
 * @version 1.0
 * @date 2020-04-09
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public UserDTO findByUserId(String userId) {
        LOGGER.info("findByUserId, userId:{}.", userId);
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        userDTO.setUsername("mouse");
        userDTO.setAge(24);

        return userDTO;
    }

}
