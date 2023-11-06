package co.edu.usbcali.aerolinea.dto;

import co.edu.usbcali.aerolinea.domain.Pais;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CiudadDTO {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String latitud;
    private String longitud;
    private Integer idPais;
}
