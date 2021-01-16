package br.com.iotplatform.eventconsumerservice.dto;

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

    private LocalDateTime eventDateTime;

}
