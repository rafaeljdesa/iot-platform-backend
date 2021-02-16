package br.com.iotplatform.eventconsumerservice.repository;

import br.com.iotplatform.eventconsumerservice.entity.IotEvent;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface IotEventRepository extends ElasticsearchRepository<IotEvent, String> {
}
