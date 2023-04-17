package ser.com.tienda.domain;

import ser.com.tienda.dominio.Categoria;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ser.com.tienda.util.Validator;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
@SpringBootTest
public class CategoriaTest {
	Categoria categoria;
	@BeforeAll
	void categoria() {
		categoria = new Categoria();
	}
	@Test
	void contextLoads() {
	}
	
}
