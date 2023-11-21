package co.edu.usbcali.aerolinea.dto;

import co.edu.usbcali.aerolinea.domain.Avion;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Builder
public class EscalaDto {

    @NotNull
    private Integer id;
    @NotNull
    private Instant fechaSalida;
    @NotNull
    private Instant fechaLlegada;
    @NotNull
    private CiudadDTO destino;
    @NotNull
    private CiudadDTO origen;
    @NotNull
    private Avion avion;
}
