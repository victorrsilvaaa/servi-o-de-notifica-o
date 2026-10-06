package com.rbtmqexample.MensageriaRabbitMQ.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumerService {

    @RabbitListener(queues = "notification.email")
    public void helloWorld(String message) {

        System.out.println(message);

    }

}
