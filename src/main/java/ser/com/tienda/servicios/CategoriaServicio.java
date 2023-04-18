package ser.com.tienda.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ser.com.tienda.dominio.Categoria;
import ser.com.tienda.exception.DomainException;
import ser.com.tienda.repository.CategoriaRepository;

@Service
public class CategoriaServicio implements ICategoriaServicio {
	@Autowired
	CategoriaRepository repositorio;

	@Override
	public List<Categoria> getCategorias() {
		return repositorio.findAll();
	}
	
	@Override
	public ResponseEntity getCategoria(Integer id)  {
		Optional<Categoria> categoria = repositorio.findById(id);
		if(!categoria.isPresent()) {
			return new ResponseEntity("No existe la cateogoria con ese ID", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(categoria, HttpStatus.OK);
	}
	
	@Override
	public Categoria createCategoria(Categoria categoria) {
		return repositorio.save(categoria);
	}
	
	@Override

	public ResponseEntity  updateCategoria(Categoria categoriaNueva, Integer id) throws DomainException {
		Optional<Categoria> categoria = repositorio.findById(id);
		if(!categoria.isPresent()) {
			return new ResponseEntity("No existe la cateogoria con ese ID", HttpStatus.NOT_FOUND);
		}
		categoria.get().setCat_nombre(categoriaNueva.getCat_nombre());
		categoria.get().setCat_descripcion(categoriaNueva.getCat_descripcion());
		repositorio.save(categoria.get());
		
		return new ResponseEntity(getCategoria(id), HttpStatus.OK);
	}


	@Override
	public ResponseEntity deleteCategoria(Integer id) {
	Optional<Categoria> categoria = repositorio.findById(id);
	if(!categoria.isPresent()) {
	return new ResponseEntity("No existe la cateogoria con ese ID", HttpStatus.NOT_FOUND);
	}
	repositorio.deleteById(id);

	return new ResponseEntity(categoria, HttpStatus.OK);


	}




	
	

}
