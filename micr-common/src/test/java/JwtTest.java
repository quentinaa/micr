import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/8/7 11:17:34
 */
public class JwtTest {
    @Test
    public void testCreateJwt(){
        String key = "81a6f25668d94a909245efbd676635f8";
        Date curDate=new Date();
        Map<String,Object> data=new HashMap<>();
        data.put("12",11);
        data.put("13","14");
        SecretKey secretKey = Keys.hmacShaKeyFor(key.getBytes(StandardCharsets.UTF_8));
        String jwt = Jwts.builder().signWith(secretKey, SignatureAlgorithm.ES256)
                .setExpiration(DateUtils.addMilliseconds(curDate, 10))
                .setIssuedAt(curDate)
                .setId(UUID.randomUUID().toString())
                .addClaims(data).compact();
        System.out.println(jwt);
    }
}
