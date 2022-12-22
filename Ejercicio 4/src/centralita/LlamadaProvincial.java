package centralita;

public class LlamadaProvincial extends Llamada {
	
	private int hora;
	private enum franjas {FRANJA1, FRANJA2, FRANJA3};
	// En realidad es mejor un mapa, donde la clave sea la franja
	// y almacene el coste de cada una. Luego un método privado que asocie
	// los horarios a cada franja
	private double coste_provincial;
	
	public LlamadaProvincial() {
		super();
	}

	public LlamadaProvincial(int origen, int destino, int duracion, int hora) {
		super(origen, destino, duracion);
		this.hora = hora;
	}

	@Override
	public double calcularCoste(int duracion) {
		
		switch(this.hora) {
			/*
			case "Franja1": 
				break;
			
			case "Franja2":
				break;
				
			case "Franja3":
				break;
		*/
		}
		
		
		return 0;
	}
	
	
	
}
