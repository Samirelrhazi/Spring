package ser.com.tienda.servicios;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ser.com.tienda.dominio.Categoria;
import ser.com.tienda.exception.DomainException;

public interface ICategoriaServicio {
	List<Categoria> getCategorias();
	Categoria createCategoria(Categoria categoria);
	public abstract ResponseEntity updateCategoria(Categoria categoriaNueva, Integer id) throws DomainException;
	public abstract ResponseEntity deleteCategoria(Integer id);
	public abstract ResponseEntity getCategoria(Integer id);
}


