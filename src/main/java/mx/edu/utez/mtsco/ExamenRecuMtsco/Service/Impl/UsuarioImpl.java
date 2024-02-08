package mx.edu.utez.mtsco.ExamenRecuMtsco.Service.Impl;

import mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Bean.UsuarioBean;
import mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Dao.UsuarioDao;
import mx.edu.utez.mtsco.ExamenRecuMtsco.Service.Interface.UsuarioI;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;


@Service
@Transactional
public class UsuarioImpl implements UsuarioI {

    private final UsuarioDao inter;

    public UsuarioImpl(UsuarioDao inter) {
        this.inter = inter;
    }

    @Transactional(rollbackFor = {SQLException.class})
    @Override
    public UsuarioBean save(UsuarioBean personBean) {
        personBean.setContrasenia(generarContrasenia());
        personBean.setEstado(true);
        return inter.saveAndFlush(personBean);
    }

    @Transactional(readOnly = true, rollbackFor = {SQLException.class})
    @Override
    public List<UsuarioBean> readAll() {
        return inter.findAll();
    }

    @Transactional
    public void delete(Long id) {
        inter.deleteById(id);
    }

    @Transactional(readOnly = true, rollbackFor = {SQLException.class})
    @Override
    public UsuarioBean getById(Long id) {
        return (inter.findById(id).isPresent() ? inter.findById(id).get() : null);
    }

    public String generarContrasenia(){
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+";
        StringBuilder contrasena = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(index));
        }
        return contrasena.toString();
    }
}
