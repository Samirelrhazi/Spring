package ser.com.tienda.dominio;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Direccion {
    
    @Column(name = "dir_nombre", nullable = true, columnDefinition = "VARCHAR(100) default null")
    private String dir_nombre;
    
    @Column(name = "dir_direccion", nullable = true, columnDefinition = "VARCHAR(200) default null")
    private String dir_direccion;
    
    @Column(name = "dir_poblacion", nullable = true, columnDefinition = "VARCHAR(100) default null")
    private String dir_poblacion;
    
    @Column(name = "dir_cPostal", nullable = true, columnDefinition = "VARCHAR(10) default null")
    private String dir_cPostal;
    
    @Column(name = "dir_provincia", nullable = true, columnDefinition = "VARCHAR(50) default null")
    private String dir_provincia;
    
    @Column(name = "dir_pais", nullable = true, columnDefinition = "VARCHAR(50) default null")
    private String dir_pais;
    
    @Column(name = "dir_correoE", nullable = true, columnDefinition = "VARCHAR(100) default null")
    private String dir_correoE;
    
    //constructores, getters y setters
}