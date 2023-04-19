package ser.com.tienda.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ser.com.tienda.dominio.Producto;
import ser.com.tienda.exception.DomainException;
import ser.com.tienda.repository.IProductoRepository;

@Service
public class ProductoServicio implements IProductoServicio {

	@Autowired
	IProductoRepository repositorio;

	@Override
	public List<Producto> getProductos() {
		return repositorio.findAll();
	}

	@Override
	public ResponseEntity getProducto(Integer id) {
		Optional<Producto> categoria = repositorio.findById(id);
		if (!categoria.isPresent()) {
			return new ResponseEntity("No existe la cateogoria con ese ID", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(categoria, HttpStatus.OK);
	}

	@Override
	public Producto createProducto(Producto producto) {
		return repositorio.save(producto);
	}

	@Override

	public ResponseEntity updateProducto(Producto producto, Integer id) throws DomainException {
		Optional<Producto> producto1 = repositorio.findById(id);
		if (!producto1.isPresent()) {
			return new ResponseEntity("No existe la cateogoria con ese ID", HttpStatus.NOT_FOUND);
		}
		producto1.get().setId_producto(producto.getId_producto());
		producto1.get().setPro_descripcion(producto.getPro_descripcion());
		producto1.get().setPro_desLarga(producto.getPro_desLarga());
		producto1.get().setPro_precio(producto.getPro_precio());
		producto1.get().setPro_stock(producto.getPro_stock());
		producto1.get().setPro_fecRepos(producto.getPro_fecRepos());
		producto1.get().setPro_fecActi(producto.getPro_fecActi());
		producto1.get().setPro_fecDesacti(producto.getPro_fecDesacti());
		producto1.get().setPro_uniVenta(producto.getPro_uniVenta());
		producto1.get().setPro_cantXUniVenta(producto.getPro_cantXUniVenta());
		producto1.get().setPro_uniUltNivel(producto.getPro_uniUltNivel());
		producto1.get().setPro_usoRecomendado(producto.getPro_usoRecomendado());
		producto1.get().setPro_stkReservado(producto.getPro_stkReservado());
		producto1.get().setPro_nStkAlto(producto.getPro_nStkAlto());
		producto1.get().setPro_nStkBajo(producto.getPro_nStkBajo());
		producto1.get().setPro_stat(producto.getPro_stat());
		producto1.get().setId_categoria(producto.getId_categoria());
		producto1.get().setId_pais(producto.getId_pais());
		
		repositorio.save(producto1.get());

		return new ResponseEntity(getProducto(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity deleteProducto(Integer id) {
		Optional<Producto> producto = repositorio.findById(id);
		if (!producto.isPresent()) {
			return new ResponseEntity("No existe la cateogoria con ese ID", HttpStatus.NOT_FOUND);
		}
		repositorio.deleteById(id);
		return new ResponseEntity(producto, HttpStatus.OK);

	}

}
