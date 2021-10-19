package ru.vladborisov.kafkaconsumerservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.vladborisov.model.Message;

@Service
public class ConsumerServiceImpl implements ConsumerService{


    @Override
    @KafkaListener(topics = "messages", groupId = "message_group_id")
    public void consume(Message message) {
        System.out.println("Consuming message: " + message);
    }
}
