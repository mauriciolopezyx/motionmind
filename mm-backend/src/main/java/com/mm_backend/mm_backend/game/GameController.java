package com.mm_backend.mm_backend.game;

import com.mm_backend.mm_backend.game.dto.VideoFrameDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @MessageMapping("video-input")
    public void processVideoFrame(
            VideoFrameDto videoFrameDto,
            SimpMessageHeaderAccessor headerAccessor,
            Principal principal
    ) {
        gameService.processVideoFrame(videoFrameDto, headerAccessor, principal.getName());
    }


}
