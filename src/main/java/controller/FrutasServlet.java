package controller;

import entity.Frutas;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.FrutasServiceImpl;
import service.IFrutasService;

public class FrutasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cadena = request.getParameter("accion");

        switch (cadena) {
            case "crear":
                crear(request, response);
                break;
            case "listar":
                listar(request, response);
                break;
            case "eliminar":
                eliminar(request, response);
                break;
            case "actualizarFormulario":
                actualizarFormulario(request, response);
                break;
            case "actualizar":
                actualizar(request, response);
                break;
            default:
                break;
        }
    }

    private void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/usuario/listarUsuario.jsp");
        
        IFrutasService service = new FrutasServiceImpl();
        List<Frutas> listaFrutas = service.obtenerRegistros();
        request.setAttribute("listaFrutas", listaFrutas);
        
        dispatcher.forward(request, response);
    }

    private void crear(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/usuario/listarUsuario.jsp");
        
        Frutas usuario = new Frutas();
        usuario.setNombre(request.getParameter("nombre"));
        usuario.setTipo(request.getParameter("tipo"));
        
        IFrutasService service = new FrutasServiceImpl();
        service.crearRegistro(usuario);
        
        List<Frutas> listaFrutas = service.obtenerRegistros();
        request.setAttribute("listaFrutas", listaFrutas);
        
        dispatcher.forward(request, response);
    }
    
    private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/usuario/listarUsuario.jsp");

        int id = Integer.parseInt(request.getParameter("id"));

        IFrutasService service = new FrutasServiceImpl();
        Frutas fruta = service.obtenerRegistro(id);
        service.eliminarRegistro(fruta);
        
        List<Frutas> listaFrutas = service.obtenerRegistros();
        request.setAttribute("listaFrutas", listaFrutas);
        
        dispatcher.forward(request, response);

    }
    
    private void actualizarFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/usuario/actualizarUsuario.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
       
        IFrutasService service = new FrutasServiceImpl();
        Frutas usuario = service.obtenerRegistro(id);
        
        request.setAttribute("frutas", usuario);
        
        dispatcher.forward(request, response);
    }
    
    private void actualizar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/usuario/listarUsuario.jsp");
        
        Frutas fruta = new Frutas();
        fruta.setId(Integer.valueOf(request.getParameter("id")));
        fruta.setNombre(request.getParameter("nombre"));
        fruta.setTipo(request.getParameter("tipo"));
        
        IFrutasService service = new FrutasServiceImpl();
        service.actualizarRegistro(fruta);
        
        List<Frutas> listaFrutas = service.obtenerRegistros();
        request.setAttribute("listaFrutas", listaFrutas);
        
        dispatcher.forward(request, response);
    }    
}
