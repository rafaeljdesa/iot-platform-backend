package br.com.iotplatform.eventproducerservice.service;

public interface MessageProducer<M> {
    void sendMessage(M message);
}
