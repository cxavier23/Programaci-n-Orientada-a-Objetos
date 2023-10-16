public abstract class Producto
{
	public int clave;
	public String nombre; 
	public double precio; 
	
	public Producto() {}
	public Producto(int clave, String nombre, double precio) 
	{
		this.clave = clave;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String toString()
	{
		return "Clave:\t" + clave + "\n " +
				"Nombre:\t " + nombre + "\n " +
				"Precio:\t $" + precio + "\n ";
	}
}