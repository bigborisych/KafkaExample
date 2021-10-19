package ru.vladborisov.kafkaproducerexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.vladborisov.model.Message;

@Service
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    KafkaTemplate<String, Message> kafkaTemplate;

    @Override
    public void produce(Message message){
        System.out.println("Producing: " + message);
        kafkaTemplate.send("messages", message);
    }
}
