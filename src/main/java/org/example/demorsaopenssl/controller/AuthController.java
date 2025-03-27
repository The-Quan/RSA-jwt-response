package org.example.demorsaopenssl.controller;

import org.example.demorsaopenssl.payload.ApiResponse;
import org.example.demorsaopenssl.payload.Token;
import org.example.demorsaopenssl.payload.UserLogin;
import org.example.demorsaopenssl.service.TokenService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {
    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;
    public AuthController(TokenService tokenService, AuthenticationManager authenticationManager) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticationManager;
    }
    @PostMapping("/token")
    public ApiResponse Login(@RequestBody UserLogin user) {
        var authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        String token =  tokenService.generateToken(authentication);
        Token token1 = new Token(token);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setCode(200);
        apiResponse.setData(token1);
        apiResponse.setMsg("dang nhap thanh cong");
        return apiResponse;
    }
}