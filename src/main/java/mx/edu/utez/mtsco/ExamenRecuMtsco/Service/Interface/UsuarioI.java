package mx.edu.utez.mtsco.ExamenRecuMtsco.Service.Interface;

import mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Bean.UsuarioBean;

import java.util.List;

public interface UsuarioI {
    UsuarioBean save(UsuarioBean personBean);
    List<UsuarioBean> readAll();
    void delete(Long id);
    UsuarioBean getById(Long id);
}
