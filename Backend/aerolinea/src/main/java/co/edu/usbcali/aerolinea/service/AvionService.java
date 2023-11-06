package co.edu.usbcali.aerolinea.service;

import co.edu.usbcali.aerolinea.dto.AvionDTO;

public interface AvionService {

    AvionDTO guardarNuevoAvion(AvionDTO avionDTO) throws Exception;

    AvionDTO modificarAvion(AvionDTO avionDTO) throws Exception;

}
