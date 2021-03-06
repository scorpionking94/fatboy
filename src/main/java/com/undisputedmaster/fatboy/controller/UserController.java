package com.undisputedmaster.fatboy.controller;

import com.undisputedmaster.fatboy.assembler.UserAssembler;
import com.undisputedmaster.fatboy.entity.UserEntity;
import com.undisputedmaster.fatboy.model.UserModel;
import com.undisputedmaster.fatboy.service.UserService;
import com.undisputedmaster.fatboy.util.Helper;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Swapnil.Khandizod on 26-06-2018.
 */
@RestController
//@RequestMapping("/matrimony")
public class UserController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Add a new User", notes = "Add User to DB",
            response = UserModel.class)
    @PostMapping("/user/addUser")
    public ModelMap  registerUserToDb(@RequestBody UserModel model) {
        if(null!=userService.findOneByEmail(model.getEmail()))
            return new ModelMap("Error","Email Already Present");
        logger.info("Saving User To Db");
        UserEntity entity = UserAssembler.getUserEntityFromModel(model);
        entity.setUserId(Helper.getRandomUUID());
        entity.setCreatedDate(Helper.getCurrentTime());
        return new ModelMap("UserModel",userService.save(entity));

    }
    @ApiOperation(value = "Get List of All Users", notes = "Provide Criteria For User",
            response = UserEntity.class,responseContainer = "List")
    @GetMapping("/rest/user/getAllUsers")
    public List<UserEntity> getAllUsers(){
        return userService.findAll();
    }

    
}
