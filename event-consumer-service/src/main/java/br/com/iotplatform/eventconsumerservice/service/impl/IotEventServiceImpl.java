package br.com.iotplatform.eventconsumerservice.service.impl;

import br.com.iotplatform.eventconsumerservice.dto.IotEventDTO;
import br.com.iotplatform.eventconsumerservice.entity.IotEvent;
import br.com.iotplatform.eventconsumerservice.mapper.IotEventMapper;
import br.com.iotplatform.eventconsumerservice.repository.IotEventRepository;
import br.com.iotplatform.eventconsumerservice.service.IotEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IotEventServiceImpl implements IotEventService {

    @Autowired
    private IotEventRepository iotEventRepository;

    @Autowired
    private IotEventMapper iotEventMapper;

    @Override
    public void save(IotEventDTO iotEventDTO) {
        IotEvent iotEvent = iotEventMapper.toEntity(iotEventDTO);
        iotEventRepository.save(iotEvent);
    }
}
