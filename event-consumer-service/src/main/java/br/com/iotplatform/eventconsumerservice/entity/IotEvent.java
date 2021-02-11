package br.com.iotplatform.eventconsumerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class IotEvent implements Serializable {

    @Id
    private ObjectId _id;

    private String deviceId;

    private Map<String, Object> eventData;

    private LocalDateTime eventDateTime;

}
