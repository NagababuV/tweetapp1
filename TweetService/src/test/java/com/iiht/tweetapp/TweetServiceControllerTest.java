package com.iiht.tweetapp;

import com.iiht.tweetapp.config.AuthFeign;
import com.iiht.tweetapp.controller.TweetServiceController;
import com.iiht.tweetapp.exception.InvalidTokenException;
import com.iiht.tweetapp.model.TweetDetails;
import com.iiht.tweetapp.service.TweetServices;
import org.aspectj.weaver.patterns.IToken;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class TweetServiceControllerTest {
    @Mock
    TweetServices tweetService;
    @InjectMocks
    TweetServiceController tweetServiceController;

    @Mock
    AuthFeign authFeign;

    TweetDetails tweet;



//
//    @Test
//  void getAllTweets() throws InvalidTokenException {
//    when(tweetService.getAllTweets(token).thenReturn(new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK));
//        String TOKEN = "token";
//       when(authFeign.getValidity(TOKEN).getBody()).isValid().thenReturn(true);
//      assertEquals(200, tweetServiceController.getAllTweets(TOKEN).getStatusCodeValue());
//
//   }




//    public ResponseEntity<Object> getAllTweets(@RequestHeader("Authorization") String token) throws InvalidTokenException {
//        log.info("inside tweet service controller to get all tweets");
//        if (authFeign.getValidity(token).getBody().isValid()) {
//            return tweetService.getAllTweets();
//        }


}

//    @Test
//    void getAllUsers() {
//
//        when(userServices.getAllUsers()).thenReturn(new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK));
//        assertEquals(200, userController.getAllUsers().getStatusCodeValue());
//    }
//
