
package service;

import entity.Frutas;
import java.util.List;

public interface IFrutasService {
    public void crearRegistro(Frutas fruta);
    public List<Frutas> obtenerRegistros();
    public void eliminarRegistro(Frutas fruta);
    public Frutas obtenerRegistro(int id);
    public void actualizarRegistro(Frutas fruta);
}
