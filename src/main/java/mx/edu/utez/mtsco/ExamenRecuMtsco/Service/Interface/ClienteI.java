package mx.edu.utez.mtsco.ExamenRecuMtsco.Service.Interface;

import mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Bean.ClienteBean;

import java.util.List;

public interface ClienteI {
    ClienteBean save(ClienteBean clienteBean);
    List<ClienteBean> readAll();
    void delete(Long id);
    ClienteBean getById(Long id);
}
