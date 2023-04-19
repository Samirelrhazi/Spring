package ser.com.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ser.com.tienda.dominio.PedidoCarrito;

public interface IPedidoCarritoRepository extends JpaRepository<PedidoCarrito, Integer> {

}
