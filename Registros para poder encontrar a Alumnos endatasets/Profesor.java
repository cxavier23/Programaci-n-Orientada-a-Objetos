public class Profesor extends Persona{
	public static final int MAX_UEAS = 3;
	
	//atributos
	public int numEconomico;
	public String departamento;
	public int numUeasActuales;
	public UEA[] ueas;
	
	//constructores
	public Profesor(){}



	
	public Profesor(String nombre, String aPaterno, String aMaterno, int numEconomico, String departamento){
		super(nombre, aPaterno, aMaterno);
		this.numEconomico=numEconomico;
		this.departamento=departamento;
		ueas = new UEA[MAX_UEAS];
	}
  /////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
/////ExcepcionesProf/////////////////////////////////////////////////////////////
  public void cursosActuales() throws ExcepcionProf{
		if(numUeasActuales <= 0){
			throw new ExcepcionProf("\nNo existen ueas en el registro.\n");
		}
		System.out.println("\nLos cursos de " + nombre + " son:\n");

		for(int i=0; i<numUeasActuales; i++){
			System.out.println(ueas[i].toString());
		}
	}
	

	
	public void impartirUEA(UEA uea){
		boolean bandera=false;
		if(numUeasActuales<MAX_UEAS){
			for(int i=0; i<numUeasActuales; i++){
				if(ueas[i].clave==uea.clave){
					System.out.println("El profesor ya tiene asignada esa UEA: " + uea.nombre);
					bandera=true;
				}
			}
			if(bandera==false){
				ueas[numUeasActuales]= uea;
				numUeasActuales++;
				System.out.println("La asignacion a la UEA: "+uea.nombre+" se ha realizado exitosamente\n");
			}			
		}else{
			System.out.println("El profesor ya tiene asignadas 3 UEAs, no puede impartir mas...\n");
		}
	}
	
	public String toString(){
		String estado = super.toString() + "numEconomico: " + numEconomico + ", " +
						"departamento: " + departamento + ", " +
						"numUeasActuales: " + numUeasActuales +", ";
		return estado;
	}
}