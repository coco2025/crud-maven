package Test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TblAuto;

//import model.TblAuto;

public class TestAuto {

	public static void main(String[] args) {
		         // establecer conexión  --> con la unidad de persistencia
				EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("ProyectoMavenProfesor");
				// manejador de entidades --> según la fábrica
				EntityManager em = fabrica.createEntityManager();
				
				// proceso -> "registro/actualización/eliminación" --> transacción
				em.getTransaction().begin();
				TblAuto auto=new TblAuto();
				auto.setMarca("kiamaven2");
				auto.setModelo("riomaven2");
				auto.setColor("rojomaven2");
				auto.setPrecio(15000);
				auto.setMoto("1.2");
				//em.remove(elim);
				//registramos datos
				em.persist(auto);
			    em.getTransaction().commit();
			    em.close();
			    
			 

	}    //fin del metodo principal....

}     //fin de la clase auto...
