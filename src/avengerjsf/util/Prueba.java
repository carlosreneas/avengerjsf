package avengerjsf.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import avengerjsf.model.dao.HeroeDao;
import avengerjsf.model.entities.Heroe;

public class Prueba {

	public Prueba() {
		// TODO Auto-generated constructor stub
	}
	
	public static EntityManager getEm() {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("avengerjsf");
		EntityManager em = emf.createEntityManager();
		return em;
		
	}
	
	public static void main(String[] args) {

		//EntityManager em = Prueba.getEm();	
		
		
		
		
		Heroe h = new Heroe();
		/*
		usuario.setEmail("crangarita@gmail.com");
		usuario.setNombre("Carlos");
		usuario.setApellido("Angarita");
		usuario.setPass("1234");
		usuario.setUsuario("crangarita");
		*/
		HeroeDao hDao = new HeroeDao();
		
		h = hDao.findByField("nombre", "Tony Stark");
		
		/*
		uDao.insertar(usuario);
		*/
		//usuario = uDao.find(3);
		
		System.out.println(h.getHeroe());
		
		/*
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		
		*/

	}

}
