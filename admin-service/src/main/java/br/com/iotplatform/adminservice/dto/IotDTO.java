package br.com.iotplatform.adminservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IotDTO implements Serializable {

    private String id;

    private String macAddress;

    @NotNull
    private String latitude;

    @NotNull
    private String longitude;

    @NotNull
    private String model;

    @NotNull
    private String type;


}
