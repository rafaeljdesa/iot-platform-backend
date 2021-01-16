package br.com.iotplatform.eventconsumerservice.repository;

import br.com.iotplatform.eventconsumerservice.entity.IotEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IotEventRepository extends MongoRepository<IotEvent, String> {
}
