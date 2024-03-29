public class Local {
	private String nombre;
	private String ciudad;
	private int ingreso;
	private Restaurant restaurant;

	public Local(String nombre, String ciudad, int ingresos){
		this.nombre=nombre;
		this.ciudad=ciudad;
		this.ingreso=ingresos;



	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	@Override
	public String toString() {
		return "Local{" +
				"nombre='" + nombre + '\'' +
				", ciudad='" + ciudad + '\'' +
				", ingreso=" + ingreso +
				", restaurant=" + restaurant +
				'}';
	}
}