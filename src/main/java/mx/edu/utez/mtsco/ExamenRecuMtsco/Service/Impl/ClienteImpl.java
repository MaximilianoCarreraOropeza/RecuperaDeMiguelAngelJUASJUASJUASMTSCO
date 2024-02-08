package mx.edu.utez.mtsco.ExamenRecuMtsco.Service.Impl;

import mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Bean.ClienteBean;
import mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Dao.ClienteDao;
import mx.edu.utez.mtsco.ExamenRecuMtsco.Service.Interface.ClienteI;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;


@Service
@Transactional
public class ClienteImpl implements ClienteI {

    private final ClienteDao inter;

    public ClienteImpl(ClienteDao inter) {
        this.inter = inter;
    }

    @Transactional(rollbackFor = {SQLException.class})
    @Override
    public ClienteBean save(ClienteBean clienteBean) {
        return inter.saveAndFlush(clienteBean);
    }

    @Transactional(readOnly = true, rollbackFor = {SQLException.class})
    @Override
    public List<ClienteBean> readAll() {
        return inter.findAll();
    }

    @Transactional
    public void delete(Long id) {
            inter.deleteById(id);
    }

    @Transactional(readOnly = true, rollbackFor = {SQLException.class})
    @Override
    public ClienteBean getById(Long id) {
        return (inter.findById(id).isPresent() ? inter.findById(id).get() : null);
    }
}
