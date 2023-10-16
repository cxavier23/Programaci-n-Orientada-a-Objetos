public class Prenda extends Producto
{
	public String talla;
	public String color;
	
	public Prenda() {}
	public Prenda(int clave, String nombre, double precio, String talla, String color)
	{
		super(clave, nombre, precio);
		this.talla = talla;
		this.color = color;
	}
	
	public String toString()
	{
		return super.toString() + "\n " + 
				"Talla:\t " + talla + "\n " +
				"Color:\t: " + color + "\n ";
	}
}