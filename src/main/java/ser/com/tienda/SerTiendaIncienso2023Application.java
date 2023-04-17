package ser.com.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication //(exclude = { DataSourceAutoConfiguration.class })
public class SerTiendaIncienso2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SerTiendaIncienso2023Application.class, args);
	}

}
