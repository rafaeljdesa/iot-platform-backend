package br.com.iotplatform.adminservice.controller;

import br.com.iotplatform.adminservice.dto.IotDTO;
import br.com.iotplatform.adminservice.service.IotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/admin/iot")
public class IotController {

    private Logger log = LoggerFactory.getLogger(IotController.class);

    @Autowired
    private IotService iotService;

    @PostMapping
    public ResponseEntity<IotDTO> createIot(@Valid IotDTO iotDTO) {

        log.info("POST request to create Iot");

        if (iotDTO.getId() != null) return updateIot(iotDTO);

        iotDTO = iotService.save(iotDTO);

        URI location = URI.create("/admin/iot/" + iotDTO.getId());
        return ResponseEntity.created(location).body(iotDTO);
    }

    @PutMapping
    public ResponseEntity<IotDTO> updateIot(@Valid IotDTO iotDTO) {

        log.info("PUT request to update Iot");

        if (iotDTO.getId() == null) return createIot(iotDTO);

        return ResponseEntity.ok(iotDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IotDTO> getById(@PathVariable String id) {

        log.info("GET request to find Iot by id {}", id);

        IotDTO iotDTO = iotService.findById(id);

        if (iotDTO == null) {
            log.info("Unable to find Iot by id {}", id);
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(iotDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<IotDTO>> getAll() {

        log.info("GET request to find all Iot");

        List<IotDTO> iotDTOS = iotService.findAll();

        return ResponseEntity.ok(iotDTOS);
    }

    @GetMapping
    public ResponseEntity<Page<IotDTO>> getAllPageable(@RequestParam(defaultValue = "0") Integer page,
                                                       @RequestParam(defaultValue = "10") Integer size,
                                                       @RequestParam(defaultValue = "id") String sortBy,
                                                       @RequestParam(defaultValue = "ASC") String sortDirection) {

        log.info("GET request to find all Iot");

        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortDirection), sortBy));

        Page<IotDTO> iotDTOPage = iotService.findPageable(pageable);

        return ResponseEntity.ok(iotDTOPage);
    }

}