package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iautoable;
import model.TblAuto;

public class ClassCrudAuto implements Iautoable {

	@Override
	public void RegistrarAuto(TblAuto tblauto) {
		  // establecer conexión  --> con la unidad de persistencia
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("ProyectoMavenProfesor");
		// manejador de entidades --> según la fábrica
		EntityManager em = fabrica.createEntityManager();		
		// proceso -> "registro/actualización/eliminación" --> transacción
		em.getTransaction().begin();
		//registramos
		em.persist(tblauto);
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	}   //fin del metodo registrar...

	@Override
	public void ActualizarAuto(TblAuto tblauto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarAuto(TblAuto tblauto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblAuto> ListadoAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblAuto BuscarAuto(TblAuto tblauto) {
		// TODO Auto-generated method stub
		return null;
	}

}   //fin de la clase clas...
