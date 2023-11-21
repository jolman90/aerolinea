package co.edu.usbcali.aerolinea.controller;

import co.edu.usbcali.aerolinea.dto.AeropuertoDto;
import co.edu.usbcali.aerolinea.service.AeropuertoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aeropuerto")
@RequiredArgsConstructor
public class AeropuertoController {

    private final AeropuertoService service;

    @PostMapping
    public ResponseEntity<AeropuertoDto> save(@RequestBody @Valid AeropuertoDto request) {
        AeropuertoDto dto = service.save(request);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AeropuertoDto> getById(@PathVariable Integer id) {
        AeropuertoDto dto = service.getById(id);
        return ResponseEntity.ok(dto);
    }
    @GetMapping("/all")
    public ResponseEntity<List<AeropuertoDto>> getAll(Pageable page) {
        List<AeropuertoDto> dto = service.getAll(page);
        return ResponseEntity.ok(dto);
    }

    @PutMapping
    public ResponseEntity<AeropuertoDto> update(@RequestBody @Valid AeropuertoDto request) {
        AeropuertoDto dto = service.update(request);
        return ResponseEntity.ok(dto);
    }

    @PatchMapping
    public ResponseEntity<AeropuertoDto> partialUpdate(@RequestBody @Valid AeropuertoDto request) {
        AeropuertoDto dto = service.partialUpdate(request);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
