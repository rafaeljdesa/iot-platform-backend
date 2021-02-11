package br.com.iotplatform.eventconsumerservice.dto;

import br.com.iotplatform.eventconsumerservice.utils.CustomLocalDateTimeDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IotEventDTO implements Serializable {

    private String deviceId;

    private Map<String, Object> eventData;

    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    private LocalDateTime eventDateTime;

}
