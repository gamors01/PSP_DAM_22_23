package centralita;

public class LlamadaProvincial extends Llamada {
	
	private int hora;
	
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
