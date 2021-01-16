package br.com.iotplatform.eventconsumerservice.mapper.impl;

import br.com.iotplatform.eventconsumerservice.dto.IotEventDTO;
import br.com.iotplatform.eventconsumerservice.entity.IotEvent;
import br.com.iotplatform.eventconsumerservice.mapper.IotEventMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IotEventMapperImpl implements IotEventMapper {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public IotEventDTO toDto(IotEvent entity) {
        return modelMapper.map(entity, IotEventDTO.class);
    }

    @Override
    public IotEvent toEntity(IotEventDTO dto) {
        return modelMapper.map(dto, IotEvent.class);
    }
}
