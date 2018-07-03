package com.undisputedmaster.fatboy.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.undisputedmaster.fatboy.security.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {

	@Value("${secret.key}")
    private  String SECRET ;

    public JwtUser validate(String token) {

        JwtUser jwtUser = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token)
                    .getBody();
            jwtUser = new JwtUser();
            jwtUser.setUserName(body.getSubject());
            jwtUser.setId((String) body.get("userId"));
            jwtUser.setRole((String) body.get("role"));
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return jwtUser;
    }
}
