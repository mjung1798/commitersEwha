package com.jyami.commitersewha.controller;

import com.jyami.commitersewha.domain.User;
import com.jyami.commitersewha.security.CurrentUser;
import com.jyami.commitersewha.security.UserPrincipal;
import com.jyami.commitersewha.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by jyami on 2020/09/22
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userService.getCurrentUser(userPrincipal);
    }

}