package org.example.demorsaopenssl;

import org.example.demorsaopenssl.payload.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

    @PostMapping("/token")
    public String Login(@RequestBody User user){
        return "success";
    }
}
