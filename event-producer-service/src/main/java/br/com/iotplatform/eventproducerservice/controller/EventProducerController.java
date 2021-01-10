package br.com.iotplatform.eventproducerservice.controller;

import br.com.iotplatform.eventproducerservice.dto.IotEventProducerDTO;
import br.com.iotplatform.eventproducerservice.service.IotEventMessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/event-producer/iot")
public class EventProducerController {

    private final Logger log = LoggerFactory.getLogger(EventProducerController.class);

    @Autowired
    private IotEventMessageProducer messageProducer;

    @PostMapping
    public ResponseEntity<?> produceEvent(@RequestBody @Valid IotEventProducerDTO event) {
        log.info("POST - request to produce event from iot device");
        messageProducer.sendMessage(event);
        return ResponseEntity.ok().build();
    }

}
