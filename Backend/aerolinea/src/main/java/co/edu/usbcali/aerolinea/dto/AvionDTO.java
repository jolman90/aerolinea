package co.edu.usbcali.aerolinea.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AvionDTO {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String referencia;
    private String tipo;
    private Integer capacidad;
}
