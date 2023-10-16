public class UEA{
	//atributos
	public String nombre;
	public int clave;
	public String grupo;
	
	//constructores
	public UEA(){}
	
	public UEA(String nombre, int clave, String grupo){
		this.nombre=nombre;
		this.clave=clave;
		this.grupo=grupo;
	}
	
	//métodos
	public String toString(){
		String estado = "nombre: " + nombre + ", " +
						"clave: " + clave + ", " +
						"grupo: " + grupo;
		return estado;
	}
}

