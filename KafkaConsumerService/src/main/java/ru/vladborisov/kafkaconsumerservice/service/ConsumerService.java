package ru.vladborisov.kafkaconsumerservice.service;


import ru.vladborisov.model.Message;

public interface ConsumerService {
    void consume(Message message);
}
