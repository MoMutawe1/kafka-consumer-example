package com.consumerex.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaMessageListener {

    @KafkaListener(topics = "NewTopic3", groupId = "jt-group-3")
    public void consumeEvents(String message) {
        log.info("consumer1 consume the events {} ", message);
    }
}
