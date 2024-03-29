import java.util.ArrayList;

public class Restaurant {
	private ArrayList<Local> locales;
	private int ingresoEsperado;

	public Restaurant() {
		this.ingresoEsperado=ingresoEsperado;
		this.locales = new ArrayList<Local>();


	}


	public Local asignarLocal(Local local) {
		this.locales.add(local);
		return local;
	}




	public int getIngresoEsperado() {
		return ingresoEsperado;
	}

	public void setIngresoEsperado(int ingresoEsperado) {
		this.ingresoEsperado=ingresoEsperado;
	}

	public Local crearLocal(String nombre, String ciudad, int ingresos) {
		Local newlocal = new Local(nombre, ciudad, ingresos);
		this.locales.add(newlocal);
		System.out.println("Nuevo local:"+" "+newlocal.getNombre()+" "+newlocal.getCiudad()+" "+newlocal.getIngreso());

		return newlocal;






	}

	public Local cerrarLocal(Local local) {

			if (local.getIngreso() == 0) {

				this.locales.remove(local);
				System.out.println("El local se cerro");


			} else if (local.getIngreso() > 0) {
				System.out.println("No es necesario cerrar el local");

			}


		return null;

	}


	public void venderLocal(Local local, int precioVenta,String nombre) {
		for(Local local1:this.locales) {

			if (local1.getIngreso() < getIngresoEsperado() && local1.getIngreso() != 0 && local1.getNombre().equals(nombre)) {
				System.out.println("No se generó los suficientes ingresos, por lo que el local se debe vender por" +
						" " + precioVenta);
			} else if (local1.getIngreso() >= getIngresoEsperado() && local1.getIngreso() != 0 && local1.getNombre().equals(nombre)) {

				System.out.println("No hay necesidad de vender");

			}
		}

	}




	public void transformarLocal(Local local,String nombreLocal, String nuevoNombre, String nuevaCiudad, String tipoLocal) {
		for (Local local1 : this.locales) {
			if(local1.getNombre().equals(nombreLocal)){
				local1.setNombre(nuevoNombre);
				local1.setCiudad(nuevaCiudad);

				System.out.println("Este local va a cambiar, ahora va ser"+" "+tipoLocal+" "
						+"que se llamará"+" "+local1.getNombre()+" "+"y estará ubicado en"+" "+local1.getCiudad());

			}


		}


	}

	@Override
	public String toString() {
		return "Restaurant{" +
				"locales=" + locales +
				", ingresoEsperado=" + ingresoEsperado +
				'}';
	}
}