package ser.com.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ser.com.tienda.dominio.Categoria;
import ser.com.tienda.servicios.ICategoriaServicio;
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	private ICategoriaServicio cDao;
	
	@GetMapping
		public List<Categoria> listCategoria(){
		return cDao.leertodo();
	}
	
	@PostMapping
	public @ResponseBody Categoria insertarDatos(@RequestBody Categoria categoria) {
	return cDao.crear(categoria);

	}}
