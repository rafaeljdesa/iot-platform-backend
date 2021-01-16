package br.com.iotplatform.eventconsumerservice.dto;

import br.com.iotplatform.eventconsumerservice.utils.CustomLocalDateTimeDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IotEventDTO implements Serializable {

    private String macAddress;

    private String temperature;

    private String waterLevel;

    private String pressureLevel;

    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    private LocalDateTime eventDateTime;

}
