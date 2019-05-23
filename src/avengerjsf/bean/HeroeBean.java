package avengerjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import avengerjsf.model.dao.HeroeDao;
import avengerjsf.model.entities.Heroe;



@ManagedBean
@SessionScoped
public class HeroeBean {
	
	HeroeDao hDao = new HeroeDao();
	
	public List<Heroe> retornarHeroes(){
		System.out.println("Tamaño " + hDao.list().size());
		return hDao.list();
	}
}
