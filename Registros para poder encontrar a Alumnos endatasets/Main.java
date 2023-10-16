public class Main extends Persona{
	public static final int MAX_UEAS = 5;
	
	//atributos
	public String matricula;
	public String licenciatura;
	public int numUeasInscritas;
	public UEA[] ueas;
	//author: Christopher Xavier Sanchez Duran
	 //UAMC
	//contructores	
	public Main(){
		ueas = new UEA[MAX_UEAS];
	}
		
	public Main(String nombre, String aPaterno, String aMaterno, String matricula, String licenciatura){
		super(nombre, aPaterno, aMaterno);
		this.matricula=matricula;
		this.licenciatura=licenciatura;
		ueas = new UEA[MAX_UEAS];
	}
	
	//métodos
	public void inscribirse(UEA uea){
		boolean bandera = false;
		if(numUeasInscritas<MAX_UEAS){
			for(int i=0; i<numUeasInscritas; i++){
					if(ueas[i].clave==uea.clave){
						System.out.println("Ya has inscrito la UEA " + uea.nombre);
						bandera=true;
					}
			}
			if(bandera==false){
				ueas[numUeasInscritas]= uea;
				System.out.println("La inscripcion a la UEA: "+uea.nombre+" se ha realizado exitosamente\n");
				numUeasInscritas++;	
			}		
		}else{	
			System.out.println("Ya has inscrito 5 UEAs, no puedes inscribir mas...\n");
		}
	}
	
	public void darDeBaja(int clave){
		boolean bandera=false;
		if(numUeasInscritas>0){
			for(int i=0; i<numUeasInscritas; i++){
				if(ueas[i].clave==clave){			
					System.out.println("Te has dado de baja de la UEA: "+ueas[i].nombre+" exitosamente\n");
					bandera=true;
					if(i==MAX_UEAS-1){
						ueas[i] = null;
						numUeasInscritas--;
					}else{
						int cont=numUeasInscritas-1;
						for(int j=i; j<cont; j++){
							ueas[j]=ueas[j+1];
						}
						numUeasInscritas--;
						ueas[numUeasInscritas] = null;
					}
					break;
				}
			}
			if(bandera==false){
				System.out.println("ERROR: La clave de la UEA no coincide con ninguna de las UEAs inscritas \n");
			}
		}else{
			System.out.println("ERROR: No has inscrito ninguna UEA, no puedes dar de baja...\n");
		}	
	}
	
	public void ueasInscritas(){
		if(numUeasInscritas>0){
			System.out.println("Las UEAs inscritas del alumno "+nombre+" son:");
			for(int i=0; i<numUeasInscritas; i++){
				System.out.println(ueas[i].toString());
			}
		}else{
			System.out.println("No tiene UEAs inscritas actualmente... ");
		}	
	}
	//author: Christopher Xavier Sanchez Duran
 //UAMC
	public String toString(){
		String estado = super.toString() + "matricula: " + matricula + ", " +
						"licenciatura: " + licenciatura + " ";
		return estado;
	}
}