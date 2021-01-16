package br.com.iotplatform.eventconsumerservice.service;

public interface MessageConsumer<M> {
    void consumeMessage(M message);
}
