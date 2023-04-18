package ser.com.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ser.com.tienda.dominio.Categoria;
import ser.com.tienda.exception.DomainException;
import ser.com.tienda.servicios.ICategoriaServicio;
@RestController
@RequestMapping("/categoria")
public class CategoriaController implements ICategoriaController {
	@Autowired
	private ICategoriaServicio cDao;
	
	@GetMapping
		public List<Categoria> getCategorias(){
		return cDao.getCategorias();
	}
	
	@GetMapping(path = "/{id}")
	public  ResponseEntity<?> getCategoria(@PathVariable Integer id)  throws DomainException{ 
	return  cDao.getCategoria(id);
}
	
	@PostMapping
	public @ResponseBody Categoria createCategoria(@RequestBody Categoria categoria) {
	return cDao.createCategoria(categoria);

	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<?> updateCategoria(@RequestBody Categoria cateogiraNueva, @PathVariable Integer id) throws DomainException{
		return cDao.updateCategoria(cateogiraNueva, id);
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteCategoria(@PathVariable Integer id) {
		return cDao.deleteCategoria(id);

	}

	@Override
	public List<Categoria> getCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categoria createCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categoria deleteCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categoria updateCategoria() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
