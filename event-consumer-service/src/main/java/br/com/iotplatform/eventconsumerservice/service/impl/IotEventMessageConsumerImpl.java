package br.com.iotplatform.eventconsumerservice.service.impl;

import br.com.iotplatform.eventconsumerservice.dto.IotEventDTO;
import br.com.iotplatform.eventconsumerservice.service.IotEventMessageConsumer;
import br.com.iotplatform.eventconsumerservice.service.IotEventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IotEventMessageConsumerImpl implements IotEventMessageConsumer {

    private final Logger log = LoggerFactory.getLogger(IotEventMessageConsumerImpl.class);

    @Autowired
    private IotEventService iotEventService;

    @Override
    @RabbitListener(queues = "event-queue")
    public void consumeMessage(IotEventDTO message) {
        log.info("Consuming message from queue event-queue");
        iotEventService.save(message);
    }
}
