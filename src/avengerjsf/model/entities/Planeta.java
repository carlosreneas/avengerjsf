package avengerjsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the planeta database table.
 * 
 */
@Entity
@Table(name="planeta")
@NamedQuery(name="Planeta.findAll", query="SELECT p FROM Planeta p")
public class Planeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=100)
	private String nombre;

	//bi-directional many-to-many association to Pelicula
	@ManyToMany
	@JoinTable(
		name="ubicacion"
		, joinColumns={
			@JoinColumn(name="idplaneta", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="idpelicula", nullable=false)
			}
		)
	private List<Pelicula> peliculas;

	public Planeta() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pelicula> getPeliculas() {
		return this.peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

}