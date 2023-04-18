package ser.com.tienda.controller;

import java.util.List;
import ser.com.tienda.dominio.Categoria;

public interface ICategoriaController {
	List<Categoria> getCategorias();
	List<Categoria> getCategoria();
	Categoria createCategoria();
	Categoria deleteCategoria();
	Categoria updateCategoria();
	
}
