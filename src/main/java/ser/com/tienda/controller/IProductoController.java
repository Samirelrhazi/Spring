package ser.com.tienda.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ser.com.tienda.dominio.Producto;
import ser.com.tienda.exception.DomainException;

public interface IProductoController {
	List<Producto> getProductos();
	Producto createProducto(Producto producto);
	public abstract ResponseEntity updateProducto(Producto producto, Integer id) throws DomainException;
	public abstract ResponseEntity deleteProducto(Integer id);
	public abstract ResponseEntity getProducto(Integer id);
}
