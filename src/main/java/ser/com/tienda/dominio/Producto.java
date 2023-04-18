package ser.com.tienda.dominio;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Producto",schema ="SELR_alumno")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_producto", nullable = false, columnDefinition = "VARCHAR(50)")
    private String id_producto;

    @Column(name = "pro_descripcion", nullable = false, columnDefinition = "VARCHAR(50)")
    private String pro_descripcion;

    @Column(name = "pro_desLarga", columnDefinition = "VARCHAR(50) default null")
    private String pro_desLarga;

    @Column(name = "pro_precio", nullable = false, columnDefinition = "Decimal(10,2)")
    private double pro_precio;

    @Column(name = "pro_stock", columnDefinition = "INTEGER DEFAULT 0")
    private int pro_stock;

    @Column(name = "pro_fecRepos",columnDefinition = "Date DEFAULT NULL")
    private LocalDate pro_fecRepos;

    @Column(name = "pro_Acti", columnDefinition = "Date DEFAULT NULL")
    private LocalDate pro_Acti;

    @Column(name = "pro_Desacti",columnDefinition = "Date DEFAULT NULL")
    private LocalDate pro_Desacti;

    @Column(name = "pro_uniVenta", nullable = false, columnDefinition = "VARCHAR(50)")
    private String pro_uniVenta;

    @Column(name = "pro_cantXUniVenta", columnDefinition = "Decimal(10,2) default 0")
    private double pro_cantXUniVenta;

    @Column(name = "pro_uniUltNivel", columnDefinition = "VARCHAR(50) DEFAULT NULL")
    private String pro_uniUltNivel;

    @Column(name = "id_pais", nullable = false, columnDefinition = "integer")
    private int id_pais;

    @Column(name = "pro_usoRecomendado", columnDefinition = "VARCHAR(50) DEFAULT NULL")
    private String pro_usoRecomendado;

    @Column(name = "id_categoria", nullable = false, columnDefinition = "integer")
    private int id_categoria;

    @Column(name = "pro_stkReservado",columnDefinition = "integer DEFAULT 0")
    private int pro_stkReservado;

    @Column(name = "pro_nStkAlto",columnDefinition = "INTEGER DEFAULT 0")
    private int pro_nStkAlto;

    @Column(name = "pro_nStkBajo",  columnDefinition = "INTEGER DEFAULT  0")
    private int pro_nStkBajo;

    @Column(name = "pro_stat",  columnDefinition = "VARCHAR DEFAULT 'A'")
    private char pro_stat;

    public Producto() {}

	public String getId_producto() {
		return id_producto;
	}

	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}

	public String getPro_descripcion() {
		return pro_descripcion;
	}

	public void setPro_descripcion(String pro_descripcion) {
		this.pro_descripcion = pro_descripcion;
	}

	public String getPro_desLarga() {
		return pro_desLarga;
	}

	public void setPro_desLarga(String pro_desLarga) {
		this.pro_desLarga = pro_desLarga;
	}

	public double getPro_precio() {
		return pro_precio;
	}

	public void setPro_precio(double pro_precio) {
		this.pro_precio = pro_precio;
	}

	public int getPro_stock() {
		return pro_stock;
	}

	public void setPro_stock(int pro_stock) {
		this.pro_stock = pro_stock;
	}

	public LocalDate getPro_fecRepos() {
		return pro_fecRepos;
	}

	public void setPro_fecRepos(LocalDate pro_fecRepos) {
		this.pro_fecRepos = pro_fecRepos;
	}

	public LocalDate getPro_Acti() {
		return pro_Acti;
	}

	public void setPro_Acti(LocalDate pro_Acti) {
		this.pro_Acti = pro_Acti;
	}

	public LocalDate getPro_Desacti() {
		return pro_Desacti;
	}

	public void setPro_Desacti(LocalDate pro_Desacti) {
		this.pro_Desacti = pro_Desacti;
	}

	public String getPro_uniVenta() {
		return pro_uniVenta;
	}

	public void setPro_uniVenta(String pro_uniVenta) {
		this.pro_uniVenta = pro_uniVenta;
	}

	public double getPro_cantXUniVenta() {
		return pro_cantXUniVenta;
	}

	public void setPro_cantXUniVenta(double pro_cantXUniVenta) {
		this.pro_cantXUniVenta = pro_cantXUniVenta;
	}

	public String getPro_uniUltNivel() {
		return pro_uniUltNivel;
	}

	public void setPro_uniUltNivel(String pro_uniUltNivel) {
		this.pro_uniUltNivel = pro_uniUltNivel;
	}

	public int getId_pais() {
		return id_pais;
	}

	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}

	public String getPro_usoRecomendado() {
		return pro_usoRecomendado;
	}

	public void setPro_usoRecomendado(String pro_usoRecomendado) {
		this.pro_usoRecomendado = pro_usoRecomendado;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public int getPro_stkReservado() {
		return pro_stkReservado;
	}

	public void setPro_stkReservado(int pro_stkReservado) {
		this.pro_stkReservado = pro_stkReservado;
	}

	public int getPro_nStkAlto() {
		return pro_nStkAlto;
	}

	public void setPro_nStkAlto(int pro_nStkAlto) {
		this.pro_nStkAlto = pro_nStkAlto;
	}

	public int getPro_nStkBajo() {
		return pro_nStkBajo;
	}

	public void setPro_nStkBajo(int pro_nStkBajo) {
		this.pro_nStkBajo = pro_nStkBajo;
	}

	public char getPro_stat() {
		return pro_stat;
	}

	public void setPro_stat(char pro_stat) {
		this.pro_stat = pro_stat;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_categoria, id_pais, id_producto, pro_Acti, pro_Desacti, pro_cantXUniVenta, pro_desLarga,
				pro_descripcion, pro_fecRepos, pro_nStkAlto, pro_nStkBajo, pro_precio, pro_stat, pro_stkReservado,
				pro_stock, pro_uniUltNivel, pro_uniVenta, pro_usoRecomendado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return id_categoria == other.id_categoria && id_pais == other.id_pais
				&& Objects.equals(id_producto, other.id_producto) && Objects.equals(pro_Acti, other.pro_Acti)
				&& Objects.equals(pro_Desacti, other.pro_Desacti)
				&& Double.doubleToLongBits(pro_cantXUniVenta) == Double.doubleToLongBits(other.pro_cantXUniVenta)
				&& Objects.equals(pro_desLarga, other.pro_desLarga)
				&& Objects.equals(pro_descripcion, other.pro_descripcion)
				&& Objects.equals(pro_fecRepos, other.pro_fecRepos) && pro_nStkAlto == other.pro_nStkAlto
				&& pro_nStkBajo == other.pro_nStkBajo
				&& Double.doubleToLongBits(pro_precio) == Double.doubleToLongBits(other.pro_precio)
				&& pro_stat == other.pro_stat && pro_stkReservado == other.pro_stkReservado
				&& pro_stock == other.pro_stock && Objects.equals(pro_uniUltNivel, other.pro_uniUltNivel)
				&& Objects.equals(pro_uniVenta, other.pro_uniVenta)
				&& Objects.equals(pro_usoRecomendado, other.pro_usoRecomendado);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id_producto=");
		builder.append(id_producto);
		builder.append(", pro_descripcion=");
		builder.append(pro_descripcion);
		builder.append(", pro_desLarga=");
		builder.append(pro_desLarga);
		builder.append(", pro_precio=");
		builder.append(pro_precio);
		builder.append(", pro_stock=");
		builder.append(pro_stock);
		builder.append(", pro_fecRepos=");
		builder.append(pro_fecRepos);
		builder.append(", pro_Acti=");
		builder.append(pro_Acti);
		builder.append(", pro_Desacti=");
		builder.append(pro_Desacti);
		builder.append(", pro_uniVenta=");
		builder.append(pro_uniVenta);
		builder.append(", pro_cantXUniVenta=");
		builder.append(pro_cantXUniVenta);
		builder.append(", pro_uniUltNivel=");
		builder.append(pro_uniUltNivel);
		builder.append(", id_pais=");
		builder.append(id_pais);
		builder.append(", pro_usoRecomendado=");
		builder.append(pro_usoRecomendado);
		builder.append(", id_categoria=");
		builder.append(id_categoria);
		builder.append(", pro_stkReservado=");
		builder.append(pro_stkReservado);
		builder.append(", pro_nStkAlto=");
		builder.append(pro_nStkAlto);
		builder.append(", pro_nStkBajo=");
		builder.append(pro_nStkBajo);
		builder.append(", pro_stat=");
		builder.append(pro_stat);
		builder.append("]");
		return builder.toString();
	}

    
    
    }