public class Medicamento extends Producto
{
	public String laboratorio; 
	public String caducidad;
	
	public Medicamento() {}
	public Medicamento(int clave, String nombre, double precio, String laboratorio, String caducidad)
	{
		super(clave, nombre, precio);
		this.laboratorio = laboratorio;
		this.caducidad = caducidad;
	}
	
	public String toString()
	{
		return super.toString() + "\n " + 
				"Laboratorio:\t " + laboratorio + "\n " +
				"Caducidad:\t: " + caducidad + "\n ";
	}
}