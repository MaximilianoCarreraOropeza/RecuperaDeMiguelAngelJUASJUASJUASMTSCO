package mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Dao;

import mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Bean.UsuarioBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends JpaRepository<UsuarioBean, Long> {
}
