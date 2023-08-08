package com.xiong.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.apache.commons.lang3.time.DateUtils;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * @author xiong
 * @version 1.0
 * @description JWT
 * @date 2023/8/7 15:01:43
 */
public class JwtUtil {
    private String selfKey;

    public JwtUtil(String selfKey) {
        this.selfKey = selfKey;
    }

    //创建jwt
    public String create(Map<String, Object>data,Integer minute)throws Exception{
        Date curDate = new Date();
        SecretKey secretKey = Keys.hmacShaKeyFor(selfKey.getBytes(StandardCharsets.UTF_8));
        String jwt = Jwts.builder().signWith(secretKey, SignatureAlgorithm.HS256)
                .setExpiration(DateUtils.addMinutes(curDate,minute))
                .setIssuedAt(curDate)
                .setId(UUID.randomUUID().toString().replaceAll("-","").toUpperCase())
                .addClaims(data)
                .compact();
        return jwt;
    }
    //读取jwt
    public Claims readJwt(String jwt){
        SecretKey secretKey = Keys.hmacShaKeyFor(selfKey.getBytes(StandardCharsets.UTF_8));
        Claims body = Jwts.parserBuilder().setSigningKey(secretKey)
                .build().parseClaimsJws(jwt).getBody();

        return body;
    }
}
