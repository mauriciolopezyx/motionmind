package com.mm_backend.mm_backend.unity;

import com.mm_backend.mm_backend.game.GameService;
import com.mm_backend.mm_backend.game.dto.VideoFrameDto;
import com.mm_backend.mm_backend.game.dto.WireframeResponse;
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

    private final GameService gameService;

    public UnityController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/latest")
    public ResponseEntity<?> getLatestPrediction() {
        WireframeResponse last = gameService.getLastPrediction();
        System.out.println("received unity 1");
        if (last == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        System.out.println("received unity 2");
        return ResponseEntity.ok(last);
    }
}
