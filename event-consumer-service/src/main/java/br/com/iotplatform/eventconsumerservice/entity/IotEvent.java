package br.com.iotplatform.eventconsumerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class IotEvent implements Serializable {

    @Id
    private String id;

    private String macAddress;

    private String temperature;

    private String waterLevel;

    private String pressureLevel;

    private LocalDateTime eventDateTime;

}
