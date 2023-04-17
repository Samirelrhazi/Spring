package ser.com.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ser.com.tienda.dominio.Categoria;
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
}
