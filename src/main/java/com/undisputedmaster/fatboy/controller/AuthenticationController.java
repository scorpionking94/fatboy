package com.undisputedmaster.fatboy.controller;

import com.undisputedmaster.fatboy.security.model.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.undisputedmaster.fatboy.assembler.UserAssembler;
import com.undisputedmaster.fatboy.entity.UserEntity;
import com.undisputedmaster.fatboy.model.UserModel;
import com.undisputedmaster.fatboy.security.model.AccountCredentials;
import com.undisputedmaster.fatboy.security.JwtGenerator;
import com.undisputedmaster.fatboy.security.model.JwtUser;
import com.undisputedmaster.fatboy.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/matrimony")
public class AuthenticationController {


    private JwtGenerator jwtGenerator;
    @Autowired
    private UserService userService;

    public AuthenticationController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }


    @ApiOperation(value = "Verify User", notes = "Provide Email and Password Will return a Token For Valid User",
            response = LoginResponse.class)
    @PostMapping("/login")
    public LoginResponse login(@RequestBody AccountCredentials credentials){

        if (credentials != null && (credentials.getEmail()!=null && credentials.getPassword()!=null) ) {
            UserEntity entity=userService.findOneByEmailAndPassword(credentials.getEmail(),credentials.getPassword());
            if(entity !=null)
            {
                JwtUser user = new JwtUser(entity.getEmail(),entity.getUserId().toString(),"USER");
                return new LoginResponse(jwtGenerator.generate(user),true,"Valid Credentials with role "+user.getRole());
            }return new LoginResponse(null,false,"Invalid Email or Password");
        }
        return new LoginResponse(null,false,"Empty Credentials");
    }
}
