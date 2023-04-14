package ser.com.tienda.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ser.com.tienda.dominio.Categoria;
import ser.com.tienda.repository.CategoriaRepository;

@Service
public class CategoriaServicio implements ICategoriaServicio {
	@Autowired
	CategoriaRepository repositorio;

	@Override
	public List<Categoria> leertodo() {
		return repositorio.findAll();
	}

	@Override
	public Categoria crear(Categoria categoria) {
		return repositorio.save(categoria);
	}
	
	@Override
	public Categoria insertarCategoria(Categoria cat) {
		return repositorio.save(cat);
	}
	

}
