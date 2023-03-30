
package model;

import entity.Frutas;
import java.util.List;

public interface IFrutasModel {
    public void crearRegistro(Frutas usuario);
    public List<Frutas> obtenerRegistros();
    public void eliminarRegistro(entity.Frutas usuario);
    public Frutas obtenerRegistro(int id);
    public void actualizarRegistro(Frutas usuario);
}
