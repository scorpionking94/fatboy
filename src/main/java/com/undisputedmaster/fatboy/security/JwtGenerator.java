package com.undisputedmaster.fatboy.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.undisputedmaster.fatboy.security.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

@Component
public class JwtGenerator {

	@Value("${secret.key}")
    private  String SECRET ;
    private long expiry=System.currentTimeMillis()+600000;//10 minutes expiry

    public String generate(JwtUser jwtUser) {
        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUserName());
        claims.put("userId", jwtUser.getId()+(System.currentTimeMillis()));
        claims.put("role", jwtUser.getRole());


        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(new Date(expiry))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
    }
}
