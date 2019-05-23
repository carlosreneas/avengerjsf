package avengerjsf.model.dao;

import avengerjsf.model.entities.Heroe;
import avengerjsf.util.Conexion;

public class HeroeDao 
	extends Conexion<Heroe> 
	implements GenericDao<Heroe> {

	public HeroeDao() {
		super(Heroe.class);
		// TODO Auto-generated constructor stub
	}
	
}
