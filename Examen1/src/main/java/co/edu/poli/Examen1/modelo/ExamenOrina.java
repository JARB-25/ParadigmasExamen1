package co.edu.poli.Examen1.modelo;

public class ExamenOrina extends ExamenMedico{
	private String glucosa;
	private int pH;
	
    public ExamenOrina (String codigoExamen, String nombrePaciente, String fechaRealizacion, double costoProcedimiento) {
    	super(codigoExamen, nombrePaciente, fechaRealizacion, costoProcedimiento);
        this.glucosa = glucosa;
        this.pH = pH;
    }

	public String getGlucosa() {
		return glucosa;
	}

	public void setGlucosa(String glucosa) {
		this.glucosa = glucosa;
	}

	public int getpH() {
		return pH;
	}

	public void setpH(int pH) {
		this.pH = pH;
	}

	@Override
	public String toString() {
		return "Orina [glucosa=" + glucosa + ", pH=" + pH + "]";
	}
    
    

}
