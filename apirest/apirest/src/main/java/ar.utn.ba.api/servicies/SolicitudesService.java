package ar.utn.ba.api.servicies;

import ar.utn.ba.api.models.entities.EnumEstado;
import ar.utn.ba.api.models.repository.ISolicitudRepository;

public class SolicitudesService implements ISolicitudService{

    private ISolicitudRepository solicitudRepo;
    //private IHechosRepository hechoRepository

    @Override
    public void updateEstado(Long id, EnumEstado estado) {

    }

}
