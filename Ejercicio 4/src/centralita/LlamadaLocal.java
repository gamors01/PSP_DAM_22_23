package centralita;

public class LlamadaLocal extends Llamada{
	
	private final double COSTE_LOCAL = 0.15;
	
	public LlamadaLocal() {
		super();
	}
	
	public LlamadaLocal(int origen, int destino, int duracion) {
		super(origen, destino, duracion);
	}
	
	public double getCosteLocal() {
		return this.COSTE_LOCAL;
	}
	
	@Override
	public double calcularCoste(int duracion) {
		return this.COSTE_LOCAL * duracion;
	}
	
}
