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

import ser.com.tienda.dominio.Producto;
import ser.com.tienda.exception.DomainException;
import ser.com.tienda.servicios.IProductoServicio;
@RestController
@RequestMapping("/producto")
public class ProductoController  implements IProductoController{
	@Autowired
	private IProductoServicio catSer;
	
	@GetMapping
		public List<Producto> getProductos(){
		return catSer.getProductos();
	}
	
	@GetMapping(path = "/{id}")
	public  ResponseEntity<?> getProducto(@PathVariable Integer id) { 
	return  catSer.getProducto(id);
}
	
	@PostMapping
	public @ResponseBody Producto createProducto(@RequestBody Producto producto) {
	return catSer.createProducto(producto);

	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<?> updateProducto(@RequestBody Producto producto, @PathVariable Integer id) throws DomainException{
		return catSer.updateProducto(producto, id);
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteProducto(@PathVariable Integer id) {
		return catSer.deleteProducto(id);


}
	}
