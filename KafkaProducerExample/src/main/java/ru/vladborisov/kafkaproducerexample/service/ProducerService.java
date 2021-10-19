package ru.vladborisov.kafkaproducerexample.service;


import ru.vladborisov.model.Message;

public interface ProducerService {
    void produce(Message message);
}
