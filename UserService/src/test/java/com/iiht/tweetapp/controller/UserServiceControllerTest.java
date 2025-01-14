package com.iiht.tweetapp.controller;

import com.iiht.tweetapp.model.AuthResponse;
import com.iiht.tweetapp.model.LoginDetails;
import com.iiht.tweetapp.model.UserData;
import com.iiht.tweetapp.service.UserServices;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class UserServiceControllerTest {

    @Mock
    UserServices userServices;

    @InjectMocks
    UserServiceController userController;

    UserDetails userdetails;
    UserData userData;
    Optional<UserData> user;
    LoginDetails data;

    @Test
    void register() {

        userData = new UserData("harvey", "P R", "harvey", "harvey", 0);
        when(userServices.register(userData)).thenReturn(new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED));
        assertEquals(201, userController.register(userData).getStatusCodeValue());
    }

    @Test
    void login() {
        data = new LoginDetails("harvey", "harvey1");
        when(userServices.login(data)).thenReturn(new ResponseEntity<>(new AuthResponse(), HttpStatus.OK));
        assertEquals(200, userController.login(data).getStatusCodeValue());
    }

    @Test
    void forgotPassword() {
        data = new LoginDetails("harvey", "harvey1");
        when(userServices.forgotPassword(data)).thenReturn(new ResponseEntity<>(new AuthResponse(), HttpStatus.OK));
        assertEquals(200, userController.forgotPassword("harvey", data).getStatusCodeValue());
    }

    @Test
    void validate() {
        when(userServices.validate("token")).thenReturn(new ResponseEntity<>(new AuthResponse(), HttpStatus.OK));
        assertEquals(200, userController.getValidity("token").getStatusCodeValue());
    }

    @Test
    void getAllUsers() {

        when(userServices.getAllUsers()).thenReturn(new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK));
        assertEquals(200, userController.getAllUsers().getStatusCodeValue());
    }

    @Test
    void searchuser() {

        when(userServices.searchByUsername("har")).thenReturn(new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK));
        assertEquals(200, userController.searchByUsername("har").getStatusCodeValue());
    }


}
