package com.aycap.lmt.lmtclient.kafka;

import java.io.IOException;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    private static final Logger logger = LogManager.getFormatterLogger(Consumer.class);

    @KafkaListener(topics = "aycap-lmt-01", groupId = "myGroup")
    public void consume(String message) throws IOException {
        logger.info("Consume Message: %s", message);
    }
}
