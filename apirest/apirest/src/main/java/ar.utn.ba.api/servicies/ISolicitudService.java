package ar.utn.ba.api.servicies;

import ar.utn.ba.api.models.entities.EnumEstado;

public interface ISolicitudService {

    public void updateEstado (Long id , EnumEstado estado);
}
