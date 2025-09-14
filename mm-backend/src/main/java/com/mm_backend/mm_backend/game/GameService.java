package com.mm_backend.mm_backend.game;

import com.mm_backend.mm_backend.game.dto.VideoFrameDto;
import com.mm_backend.mm_backend.game.dto.WireframeResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GameService {

    private final RestTemplate restTemplate;
    private final SimpMessagingTemplate messagingTemplate;

    public GameService(
            RestTemplateBuilder builder,
            SimpMessagingTemplate simpMessagingTemplate
    ) {
        this.restTemplate = builder.build();
        this.messagingTemplate = simpMessagingTemplate;
    }

    public void processVideoFrame(
            VideoFrameDto videoFrameDto,
            SimpMessageHeaderAccessor headerAccessor,
            String username
    ) {
        try {
            WireframeResponse result = restTemplate.postForObject(
                    "http://localhost:5000/predict",
                    videoFrameDto,
                    WireframeResponse.class
            );
            assert result != null;

            //WireframeResponse result = new WireframeResponse("PLACEHOLDER", 100.0, null);

            messagingTemplate.convertAndSendToUser(username, "/topic/lesson/1", result);

        } catch (Exception e) {
            System.out.println("Error calling Flask: " + e.getMessage());
        }
    }

}
