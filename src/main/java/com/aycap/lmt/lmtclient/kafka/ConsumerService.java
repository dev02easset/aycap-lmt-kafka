package com.aycap.lmt.lmtclient.kafka;

import org.springframework.kafka.annotation.KafkaListener;

@KafkaListener(topics = "aycap-lmt-01")
public class ConsumerService {

}
