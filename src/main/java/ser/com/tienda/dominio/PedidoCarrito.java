package ser.com.tienda.dominio;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.CollectionTable;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
@Table(name="PedidoCarrito",schema ="SELR_alumno")
public class PedidoCarrito {
    
	@Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_pedido",  columnDefinition = "INTEGER")
    private int id_pedido;

    
    @Column(name = "id_usuario", nullable = false, columnDefinition = "INTEGER")
    private int id_usuario;
    

    @Column(name = "id_producto", nullable = false, columnDefinition = "VARCHAR(50)")
    private String id_producto;
    
    @Column(name = "car_cantidad", nullable = false, columnDefinition = "INTEGER")
    private Integer car_cantidad;
    
    @Column(name = "car_precio", nullable = true, columnDefinition = "Decimal(10,2) ")
    private double car_precio;
    
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "dir_nombre", column = @Column(name = "env_dir_nombre")),
        @AttributeOverride(name = "dir_direccion", column = @Column(name = "env_dir_direccion")),
        @AttributeOverride(name = "dir_poblacion", column = @Column(name = "env_dir_poblacion")),
        @AttributeOverride(name = "dir_cPostal", column = @Column(name = "env_dir_cPostal")),
        @AttributeOverride(name = "dir_provincia", column = @Column(name = "env_dir_provincia")),
        @AttributeOverride(name = "dir_pais", column = @Column(name = "env_dir_pais")),
        @AttributeOverride(name = "dir_correoE", column = @Column(name = "env_dir_correoE"))
    })
    private Direccion car_envio;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "dir_nombre", column = @Column(name = "pag_dir_nombre")),
        @AttributeOverride(name = "dir_direccion", column = @Column(name = "pag_dir_direccion")),
        @AttributeOverride(name = "dir_poblacion", column = @Column(name = "pag_dir_poblacion")),
        @AttributeOverride(name = "dir_cPostal", column = @Column(name = "pag_dir_cPostal")),
        @AttributeOverride(name = "dir_provincia", column = @Column(name = "pag_dir_provincia")),
        @AttributeOverride(name = "dir_pais", column = @Column(name = "pag_dir_pais")),
        @AttributeOverride(name = "dir_correoE", column = @Column(name = "pag_dir_correoE"))
    })
    private Direccion car_pago;
    
    @Column(name = "car_tarjeta", nullable = true, columnDefinition = "VARCHAR(50)")
    private String car_tarjeta;

    @Column(name = "car_feCadud", nullable = true, columnDefinition = "Date")
    private LocalDate car_feCadud;
    
    @Column(name = "car_ccv", nullable = true, columnDefinition = "INTEGER")
    private int car_ccv;

    @Column(name = "car_nombre", nullable = true, columnDefinition = "VARCHAR(100)")
    private String car_nombre;

    @Column(name = "car_stat", nullable = true, columnDefinition = "INTEGER")
    private int car_stat;
    
    
    @ElementCollection
    @CollectionTable(name = "pedido_carrito_fechas_cambio", joinColumns = @JoinColumn(name = "pedido_carrito_id"))
    @Column(name = "fecha_cambio")
    private List<String> car_feCambio;
    
    
    
    public PedidoCarrito() {
        
    }
    
    
    

	public PedidoCarrito(int id_pedido, int id_usuario, String id_producto, Integer car_cantidad, double car_precio,
			Direccion car_envio, Direccion car_pago, String car_tarjeta, LocalDate car_feCadud, int car_ccv,
			String car_nombre, int car_stat, List<String> car_feCambio) {
		super();
		this.id_pedido = id_pedido;
		this.id_usuario = id_usuario;
		this.id_producto = id_producto;
		this.car_cantidad = car_cantidad;
		this.car_precio = car_precio;
		this.car_envio = car_envio;
		this.car_pago = car_pago;
		this.car_tarjeta = car_tarjeta;
		this.car_feCadud = car_feCadud;
		this.car_ccv = car_ccv;
		this.car_nombre = car_nombre;
		this.car_stat = car_stat;
		this.car_feCambio = car_feCambio;
	}




	public int getId_pedido() {
		return id_pedido;
	}



	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}



	public int getId_usuario() {
		return id_usuario;
	}



	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}



	public String getId_producto() {
		return id_producto;
	}



	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}



	public Integer getCar_cantidad() {
		return car_cantidad;
	}



	public void setCar_cantidad(Integer car_cantidad) {
		this.car_cantidad = car_cantidad;
	}



	public double getCar_precio() {
		return car_precio;
	}



	public void setCar_precio(double car_precio) {
		this.car_precio = car_precio;
	}



	public Direccion getCar_envio() {
		return car_envio;
	}



	public void setCar_envio(Direccion car_envio) {
		this.car_envio = car_envio;
	}



	public Direccion getCar_pago() {
		return car_pago;
	}



	public void setCar_pago(Direccion car_pago) {
		this.car_pago = car_pago;
	}



	public String getCar_tarjeta() {
		return car_tarjeta;
	}



	public void setCar_tarjeta(String car_tarjeta) {
		this.car_tarjeta = car_tarjeta;
	}



	public LocalDate getCar_feCadud() {
		return car_feCadud;
	}



	public void setCar_feCadud(LocalDate car_feCadud) {
		this.car_feCadud = car_feCadud;
	}



	public int getCar_ccv() {
		return car_ccv;
	}



	public void setCar_ccv(int car_ccv) {
		this.car_ccv = car_ccv;
	}



	public String getCar_nombre() {
		return car_nombre;
	}



	public void setCar_nombre(String car_nombre) {
		this.car_nombre = car_nombre;
	}



	public int getCar_stat() {
		return car_stat;
	}



	public void setCar_stat(int car_stat) {
		this.car_stat = car_stat;
	}



	public List<String> getCar_feCambio() {
		return car_feCambio;
	}



	public void setCar_feCambio(List<String> car_feCambio) {
		this.car_feCambio = car_feCambio;
	}




    
    

    
  

	
	 
	
	
	}