package co.edu.usbcali.aerolinea.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AeropuertoDto {
    @NotNull
    private Integer id;
    @NotNull
    private Integer ciudadId;
    private String ciudadNombre;
    private String nombre;
    private String descripcion;
}
