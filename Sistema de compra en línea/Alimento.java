public class Alimento extends Producto
{
	public String fechaElaboracion; 
	public String caducidad;
	
	public Alimento() {}
	public Alimento(int clave, String nombre, double precio, String fechaElaboracion, String caducidad)
	{
		super(clave, nombre, precio);
		this.fechaElaboracion = fechaElaboracion;
		this.caducidad = caducidad;
	}
	
	public String toString()
	{
		return super.toString() + "\n " + 
				"Fecha de Elaboracion:\t " + fechaElaboracion + "\n " +
				"Fecha de Caducidad:\t: " + caducidad + "\n ";
	}
}