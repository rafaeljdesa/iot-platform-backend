package br.com.iotplatform.eventconsumerservice.mapper;

public interface Mapper<E, D> {
    D toDto(E entity);
    E toEntity(D dto);
}
