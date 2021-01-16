package br.com.iotplatform.eventconsumerservice.service;

import br.com.iotplatform.eventconsumerservice.dto.IotEventDTO;

public interface IotEventService {
    void save(IotEventDTO iotEventDTO);
}
