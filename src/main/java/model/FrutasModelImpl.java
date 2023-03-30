
package model;

import entity.Frutas;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FrutasModelImpl implements IFrutasModel{
    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Frutas usuario) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(usuario);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }  

    @Override
    public List<Frutas> obtenerRegistros() {
        List<Frutas> listaUsuario = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaUsuario = s.createCriteria(Frutas.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaUsuario;
    }

    @Override
    public void eliminarRegistro(Frutas usuario) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(usuario);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public Frutas obtenerRegistro(int id) {
        Frutas fruta = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            fruta = s.get(Frutas.class, id);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return fruta;
    }

    @Override
    public void actualizarRegistro(Frutas usuario) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(usuario);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    
}
