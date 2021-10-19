package ru.vladborisov.kafkaproducerexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vladborisov.kafkaproducerexample.service.ProducerService;
import ru.vladborisov.model.Message;

import java.time.LocalDateTime;

@RestController
public class ExampleController {
    @Autowired
    private ProducerService producerService;

    @GetMapping("/produce")
    public ResponseEntity<Message> generate(@RequestParam String payload){
        if(payload == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Message message = new Message(payload, LocalDateTime.now());
        producerService.produce(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
