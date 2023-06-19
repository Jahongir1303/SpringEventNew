package org.example.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ZeeCafePublisher {

    private final ApplicationEventPublisher eventPublisher;

    public ZeeCafePublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void streamBigBangTheory(String episodeNo) {
        System.out.println("Zee Cafe: Starting BBT " + episodeNo);
        System.out.println();
//        eventPublisher.publishEvent();
    }
}
