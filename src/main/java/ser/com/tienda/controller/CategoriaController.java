package ser.com.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ser.com.tienda.dominio.Categoria;
import ser.com.tienda.servicios.ICategoriaServicio;
@Repository
@RequestMapping("/catogaria")
public class CategoriaController {
	@Autowired
	private ICategoriaServicio cDao;
	
	@GetMapping()
		public List<Categoria> listCategoria(){
		return cDao.leertodo();
	}
}
