package ser.com.tienda.servicios;

import java.util.List;
import ser.com.tienda.dominio.Categoria;

public interface ICategoriaServicio {
	List <Categoria> leertodo();
	Categoria crear(Categoria categoria);
	Categoria insertarCategoria(Categoria cat); 
}
