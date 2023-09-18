package com.consumerex.service;

import com.consumerex.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaMessageListener {

    @KafkaListener(topics = "CustomerEvents", groupId = "jt-customer-group")
    public void consumeEvents(Customer customerEvent) {
        log.info("consumer consume the events {} ", customerEvent.toString());
    }
}
