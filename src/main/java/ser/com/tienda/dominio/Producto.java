package ser.com.tienda.dominio;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import ser.com.tienda.exception.DomainException;
import ser.com.tienda.util.ErrorMessages;
import ser.com.tienda.util.Validator;

@Entity
@Table(schema = "SELR_alumno", name = "PRODUCTO")
public class Producto {

	@Id
	@Column(name = "id_producto", nullable = false, insertable = true)
	private String id_producto;

	@Column(name = "pro_descripcion", nullable = false, columnDefinition = "VARCHAR(100)")
	private String pro_descripcion;

	@Column(name = "pro_desLarga", nullable = true, columnDefinition = "VARCHAR(2000) DEFAULT NULL")
	private String pro_desLarga;
	@Column(name = "pro_precio", nullable = false, columnDefinition = "NUMBER(10,2)")
	private double pro_precio;

	@Column(name = "pro_stock", nullable = true, columnDefinition = "NUMBER DEFAULT 0")
	private int pro_stock;

	@Column(name = "pro_fecRepos", nullable = true, columnDefinition = "DATE DEFAULT NULL")
	private LocalDate pro_fecRepos;

	@Column(name = "pro_fecActi", nullable = true, columnDefinition = "DATE DEFAULT NULL")
	private LocalDate pro_fecActi;

	@Column(name = "pro_fecDesacti", nullable = true, columnDefinition = "DATE DEFAULT NULL")
	private LocalDate pro_fecDesacti;
	@Column(name = "pro_uniVenta", nullable = false, columnDefinition = "VARCHAR(10) DEFAULT NULL")
	private String pro_uniVenta;

	@Column(name = "pro_cantXUniVenta", nullable = true, columnDefinition = "NUMBER(10,2) DEFAULT 0")
	private double pro_cantXUniVenta;

	@Column(name = "pro_uniUltNivel", nullable = true, columnDefinition = "VARCHAR(100) DEFAULT NULL")
	private String pro_uniUltNivel;

	@Column(name = "id_pais", nullable = false, columnDefinition = "NUMBER")
	private int id_pais;

	@Column(name = "pro_usoRecomendado", nullable = true, columnDefinition = "VARCHAR(2000) DEFAULT NULL")
	private String pro_usoRecomendado;

	private int id_categoria;

	@Column(name = "pro_stkReservado", nullable = true, columnDefinition = "NUMBER DEFAULT 0")
	private int pro_stkReservado;

	@Column(name = "pro_nStkAlto", nullable = true, columnDefinition = "NUMBER DEFAULT 0")
	private int pro_nStkAlto;

	@Column(name = "pro_nStkBajo", nullable = true, columnDefinition = "NUMBER DEFAULT 0")
	private int pro_nStkBajo;

	@Column(name = "pro_stat", nullable = true, columnDefinition = "CHAR(1) DEFAULT 'A'")
	private Character pro_stat;

	public Producto() {
	}

	public Producto(String id_producto, String pro_descripcion, String pro_desLarga, double pro_precio, int pro_stock,
			LocalDate pro_fecRepos, LocalDate pro_Acti, LocalDate pro_Desacti, String pro_uniVenta,
			double pro_cantXUniVenta, String pro_uniUltNivel, int id_pais, String pro_usoRecomendado, int id_categoria,
			int pro_stkReservado, int pro_nStkAlto, int pro_nStkBajo, char pro_stat) {
		super();
		this.pro_descripcion = pro_descripcion;
		this.pro_desLarga = pro_desLarga;
		this.pro_precio = pro_precio;
		this.pro_stock = pro_stock;
		this.pro_fecRepos = pro_fecRepos;
		this.pro_fecActi = pro_Acti;
		this.pro_fecDesacti = pro_Desacti;
		this.pro_uniVenta = pro_uniVenta;
		this.pro_cantXUniVenta = pro_cantXUniVenta;
		this.pro_uniUltNivel = pro_uniUltNivel;
		this.id_pais = id_pais;
		this.pro_usoRecomendado = pro_usoRecomendado;
		this.id_categoria = id_categoria;
		this.pro_stkReservado = pro_stkReservado;
		this.pro_nStkAlto = pro_nStkAlto;
		this.pro_nStkBajo = pro_nStkBajo;
		this.pro_stat = pro_stat;
	}

	public String getId_producto() {
		return id_producto;
	}

	public void setId_producto(String id_producto) throws DomainException {
		if (Validator.idProductoValida(id_producto)) {
			this.id_producto = id_producto;
		} else {
			throw new DomainException(ErrorMessages.PROERR_002);
		}

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

	public Double getPro_precio() {
		return pro_precio;
	}

	public void setPro_precio(Double pro_precio) {
		this.pro_precio = pro_precio;
	}

	public Integer getPro_stock() {
		return pro_stock;
	}

	public void setPro_stock(Integer pro_stock) {
		this.pro_stock = pro_stock;
	}

	public LocalDate getPro_fecRepos() {
		return pro_fecRepos;
	}

	public void setPro_fecRepos(LocalDate pro_fecRepos) {
		this.pro_fecRepos = pro_fecRepos;
	}

	public LocalDate getPro_fecActi() {
		return pro_fecActi;
	}

	public void setPro_fecActi(LocalDate pro_fecActi) {
		this.pro_fecActi = pro_fecActi;
	}

	public LocalDate getPro_fecDesacti() {
		return pro_fecDesacti;
	}

	public void setPro_fecDesacti(LocalDate pro_fecDesacti) {
		this.pro_fecDesacti = pro_fecDesacti;
	}

	public String getPro_uniVenta() {
		return pro_uniVenta;
	}

	public void setPro_uniVenta(String pro_uniVenta) {
		this.pro_uniVenta = pro_uniVenta;
	}

	public Double getPro_cantXUniVenta() {
		return pro_cantXUniVenta;
	}

	public void setPro_cantXUniVenta(Double pro_cantXUniVenta) {
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

	public Integer getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}

	public Integer getPro_stkReservado() {
		return pro_stkReservado;
	}

	public void setPro_stkReservado(Integer pro_stkReservado) {
		this.pro_stkReservado = pro_stkReservado;
	}

	public Integer getPro_nStkAlto() {
		return pro_nStkAlto;
	}

	public void setPro_nStkAlto(Integer pro_nStkAlto) {
		this.pro_nStkAlto = pro_nStkAlto;
	}

	public Integer getPro_nStkBajo() {
		return pro_nStkBajo;
	}

	public void setPro_nStkBajo(Integer pro_nStkBajo) {
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
		return Objects.hash(id_categoria, id_pais, id_producto, pro_fecActi, pro_fecDesacti, pro_cantXUniVenta,
				pro_desLarga, pro_descripcion, pro_fecRepos, pro_nStkAlto, pro_nStkBajo, pro_precio, pro_stat,
				pro_stkReservado, pro_stock, pro_uniUltNivel, pro_uniVenta, pro_usoRecomendado);
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
				&& Objects.equals(id_producto, other.id_producto) && Objects.equals(pro_fecActi, other.pro_fecActi)
				&& Objects.equals(pro_fecDesacti, other.pro_fecDesacti)
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
		builder.append(pro_fecActi);
		builder.append(", pro_Desacti=");
		builder.append(pro_fecDesacti);
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