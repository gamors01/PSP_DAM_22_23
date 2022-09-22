package centralita;

public abstract class Llamada {
	
	private static int total_llamadas = 0;
	
	private int nOrigen, nDestino, duracion;
	// Campo calculado:
	private double costeLlamada;
	
	public Llamada() {
		Llamada.total_llamadas++;
	}
	
	public Llamada(int origen, int destino, int duracion) {
		Llamada.total_llamadas++;
		this.nOrigen = origen;
		this.nDestino = destino;
		this.duracion = duracion;
		this.costeLlamada = this.calcularCoste(duracion);
	}
	
	public static int getTotalLlamadas() {
		return Llamada.total_llamadas;
	}

	public int getnOrigen() {
		return this.nOrigen;
	}

	public void setnOrigen(int nOrigen) {
		this.nOrigen = nOrigen;
	}

	public int getnDestino() {
		return this.nDestino;
	}

	public void setnDestino(int nDestino) {
		this.nDestino = nDestino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public abstract double calcularCoste(int duracion);
	
}
