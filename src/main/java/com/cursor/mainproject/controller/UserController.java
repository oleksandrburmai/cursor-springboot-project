package com.cursor.mainproject.controller;

import com.cursor.mainproject.domain.model.dto.Response;
import com.cursor.mainproject.domain.model.dto.UserDTO;
import com.cursor.mainproject.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping("/sign-up")
    public Response signUP(@Valid @RequestBody UserDTO userDTO) {
        userService.saveNewUser(userDTO);
        return Response.builder()
                .message("New user has registered")
                .build();
    }
}
