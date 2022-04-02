package taller1;

public class Cafetera {
	public int capacidaMaxima;
	public int capacidaActual;
	
	public Cafetera() {
		capacidaMaxima = 1000;
		capacidaActual = 0;
	}
	
	public Cafetera(int capacidaMaxima, int capacidaActual) {
		this.capacidaMaxima= capacidaMaxima;
		this.capacidaActual= capacidaActual;
	}

	public int getCapacidaMaxima() {
		return capacidaMaxima;
	}

	public void setCapacidaMaxima(int capacidaMaxima) {
		this.capacidaMaxima = capacidaMaxima;
	}

	public int getCapacidaActual() {
		return capacidaActual;
	}

	public void setCapacidaActual(int capacidaActual) {
		this.capacidaActual = capacidaActual;
	}
	
	// ** METODOS**
	
	public void llenarCafetera() {
		capacidaActual = capacidaMaxima;
	}
	
	public void servirTaza(int llenarTaza) {
			capacidaActual -=Math.min(llenarTaza, capacidaActual);
	}
		
	public void vaciarCafetera() {
		capacidaActual = 0;
	}
	
	// ****** Si se agrega m�s caf� de la cantidad m�xima, se limita a agregar cafe hasta el m�ximo
	
	public void agregarElCafe(int cantidad) {
		capacidaActual= Math.min(capacidaMaxima, capacidaActual + cantidad);
	}
	
	public void mostrar() {
		System.out.println("Capacidad m�xima:" + capacidaMaxima);
		System.out.println("Capacidad Actual:" + capacidaActual);
	}
	
}
