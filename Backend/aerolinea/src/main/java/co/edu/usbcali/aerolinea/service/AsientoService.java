package co.edu.usbcali.aerolinea.service;

import co.edu.usbcali.aerolinea.dto.AsientoDTO;

public interface AsientoService {

    AsientoDTO guardarNuevoAsiento(AsientoDTO asientoDTO) throws Exception;

    AsientoDTO modificarAsiento(AsientoDTO asientoDTO) throws Exception;

}
