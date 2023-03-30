
package service;

import entity.Frutas;
import java.util.List;
import model.FrutasModelImpl;
import model.IFrutasModel;

public class FrutasServiceImpl implements IFrutasService{
    private IFrutasModel model = new FrutasModelImpl();
    @Override
    public void crearRegistro(Frutas usuario) {
        model.crearRegistro(usuario);
    }

    @Override
    public List<Frutas> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Frutas usuario) {
        model.eliminarRegistro(usuario);
    }

    @Override
    public Frutas obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(Frutas usuario) {
        model.actualizarRegistro(usuario);
    }
}
