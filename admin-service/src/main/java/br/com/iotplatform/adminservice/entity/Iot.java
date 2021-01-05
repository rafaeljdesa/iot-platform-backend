package br.com.iotplatform.adminservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Iot implements Serializable {

    @Id
    private String id;

    @NotNull
    private String latitude;

    @NotNull
    private String longitude;

    @NotNull
    private String model;

    @NotNull
    private String type;

    @NotNull
    private String macAddress;

}
