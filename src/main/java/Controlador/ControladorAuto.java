package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassCrudAuto;
import model.TblAuto;

/**
 * Servlet implementation class ControladorAuto
 */
public class ControladorAuto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorAuto() {
      //  super();
        // TODO Auto-generated constructor stub
    }   //fin del constructor...

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//recuperamos los valores
		String marca=request.getParameter("marca");
		String modelo=request.getParameter("modelo");
		String color=request.getParameter("color");
		double precio=Double.parseDouble(request.getParameter("precio"));
		String motor=request.getParameter("motor");
		
		TblAuto auto=new TblAuto();
		auto.setMarca(marca);
		auto.setModelo(modelo);
		auto.setColor(color);
		auto.setPrecio(precio);
		auto.setMoto(motor);
		//invocamos al metodo registrar...
        ClassCrudAuto crudauto=new ClassCrudAuto();	
        crudauto.RegistrarAuto(auto);
        request.setAttribute("mensaje","Dato Registrado en la BD");
        //redireccionamos
        request.getRequestDispatcher("/index.jsp").forward(request, response);
	
	}   //fin del dopost...

}
