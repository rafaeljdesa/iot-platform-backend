package br.com.iotplatform.eventproducerservice.dto;

import br.com.iotplatform.eventproducerservice.utils.CustomLocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IotEventProducerDTO implements Serializable {

    private String macAddress;

    private String temperature;

    private String waterLevel;

    private String pressureLevel;

    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    private LocalDateTime eventDateTime = LocalDateTime.now();

}
