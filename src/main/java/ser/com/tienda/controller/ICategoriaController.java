package ser.com.tienda.controller;

import java.util.List;
import ser.com.tienda.dominio.Categoria;

public interface ICategoriaController {
	List<Categoria> leertodo();
	Categoria crear();
	Categoria insertarCategoria(Categoria cat); 
	
}
