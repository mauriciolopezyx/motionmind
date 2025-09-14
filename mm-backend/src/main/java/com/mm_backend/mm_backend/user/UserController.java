package com.mm_backend.mm_backend.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/ok")
    public ResponseEntity<?> checkOkay() {
        System.out.println("Received ok request?");
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
