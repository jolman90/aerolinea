package co.edu.usbcali.aerolinea.mapper;

import co.edu.usbcali.aerolinea.domain.Asiento;
import co.edu.usbcali.aerolinea.dto.AsientoDTO;

import java.util.List;

public class AsientoMapper {

    public static AsientoDTO domainToDto(Asiento asiento) {
        return AsientoDTO.builder()
                .id(asiento.getId())
                .fila(asiento.getFila())
                .silla(asiento.getSilla())
                .build();
    }

    public static Asiento dtoToDomain(AsientoDTO asientoDTO) {
        return Asiento.builder()
                .id(asientoDTO.getId())
                .fila(asientoDTO.getFila())
                .silla(asientoDTO.getSilla())
                .build();
    }

    public static List<AsientoDTO> domainToDtoList(List<Asiento> asientos) {
        return asientos.stream().map(AsientoMapper::domainToDto).toList();
    }

    public static List<Asiento> dtoToDomainList(List<AsientoDTO> asientosDto) {
        return asientosDto.stream().map(AsientoMapper::dtoToDomain).toList();
    }

}
