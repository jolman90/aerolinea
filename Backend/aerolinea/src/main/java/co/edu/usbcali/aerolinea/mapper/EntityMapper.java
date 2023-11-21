package co.edu.usbcali.aerolinea.mapper;

import org.mapstruct.MappingTarget;

import java.util.List;

/**
 * Contract for a generic dto to entity mapper.
 *
 * @param <D> -> DTO type parameter.
 * @param <E> -> Entity type parameter.
 */

public interface EntityMapper <E, D>{

    D toDto(E entity);
    E toEntity(D dto);

    E partialUpdate(@MappingTarget E entity, D dto);

    List<D> toDto(List<E> entities);
    List<E> toEntity(List<D> dto);
}
