package br.com.iotplatform.eventproducerservice.service.impl;

import br.com.iotplatform.eventproducerservice.dto.IotEventProducerDTO;
import br.com.iotplatform.eventproducerservice.service.IotEventMessageProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IotEventMessageProducerImpl implements IotEventMessageProducer {

    @Autowired
    private RabbitTemplate template;

    @Override
    public void sendMessage(IotEventProducerDTO message) {
        template.convertAndSend("event-exchange", "event-key", message);
    }
}
