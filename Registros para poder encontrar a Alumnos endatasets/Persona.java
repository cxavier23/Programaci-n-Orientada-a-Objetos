public abstract class Persona{
	//atributos
	public String nombre;
	public String aPaterno;
	public String aMaterno;
	
	//constructores
	public Persona(){}
	
	public Persona(String nombre, String aPaterno, String aMaterno){
		this.nombre=nombre;
		this.aPaterno=aPaterno;
		this.aMaterno=aMaterno;
	}
	
	//métodos	
	public String toString(){
		String estado = "nombre: " + nombre + ", " +
						"aPaterno: " + aPaterno + ", " +
						"aMaterno: " + aMaterno + ", ";
		return estado;
	}
	
}	