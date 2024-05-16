package services;

import dao.OdontologoDAOH2;
import dao.iDao;
import model.Odontologo;
import java.util.List;

public class OdontologoService {
    private iDao<Odontologo> odontologDao;

    public OdontologoService(){
        odontologDao = new OdontologoDAOH2();
    }

    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologDao.guardar(odontologo);
    }

    public Odontologo buscarOdontologo(Integer id){
        return odontologDao.buscarPorID(id);
    }

    public List<Odontologo> buscarTodos(){
        return odontologDao.buscarTodos();
    }
}
