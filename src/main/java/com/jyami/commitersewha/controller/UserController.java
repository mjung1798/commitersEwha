package com.jyami.commitersewha.controller;

import com.jyami.commitersewha.domain.User;
import com.jyami.commitersewha.security.CurrentUser;
import com.jyami.commitersewha.security.UserPrincipal;
import com.jyami.commitersewha.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by jyami on 2020/09/22
 */
@RequestMapping("api/user")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/me")
//    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<User> getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        User currentUser = userService.getCurrentUser(userPrincipal);
        return ResponseEntity.ok().body(currentUser);
    }

}
