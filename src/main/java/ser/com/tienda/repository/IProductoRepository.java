package ser.com.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ser.com.tienda.dominio.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {


}
