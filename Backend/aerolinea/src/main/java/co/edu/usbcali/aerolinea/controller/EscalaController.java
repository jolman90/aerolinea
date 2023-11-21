package co.edu.usbcali.aerolinea.controller;

import co.edu.usbcali.aerolinea.dto.EscalaDto;
import co.edu.usbcali.aerolinea.service.EscalaService;
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
@RequestMapping("/escala")
@RequiredArgsConstructor
public class EscalaController {

    private final EscalaService service;

    @PostMapping
    public ResponseEntity<EscalaDto> save(@RequestBody @Valid EscalaDto request) {
        EscalaDto dto = service.save(request);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EscalaDto> getById(@PathVariable Integer id) {
        EscalaDto dto = service.getById(id);
        return ResponseEntity.ok(dto);
    }
    @GetMapping("/all")
    public ResponseEntity<List<EscalaDto>> getAll(Pageable page) {
        List<EscalaDto> dto = service.getAll(page);
        return ResponseEntity.ok(dto);
    }

    @PutMapping
    public ResponseEntity<EscalaDto> update(@RequestBody @Valid EscalaDto request) {
        EscalaDto dto = service.update(request);
        return ResponseEntity.ok(dto);
    }

    @PatchMapping
    public ResponseEntity<EscalaDto> partialUpdate(@RequestBody @Valid EscalaDto request) {
        EscalaDto dto = service.partialUpdate(request);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
