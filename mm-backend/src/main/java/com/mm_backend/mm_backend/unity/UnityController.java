package com.mm_backend.mm_backend.unity;

import com.mm_backend.mm_backend.game.GameService;
import com.mm_backend.mm_backend.game.dto.VideoFrameDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/unity")
public class UnityController {

    @GetMapping("/ok")
    public ResponseEntity<?> checkOkay() {
        System.out.println("Received ok request?");
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
