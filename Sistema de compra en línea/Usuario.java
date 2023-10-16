public class Usuario
{
	public String nombre;
	public String correoElectronico; 
	public String numTarjeta;
	public Carrito car; 
	
	public Usuario() {car = new Carrito();}
	public Usuario(String nombre, String correoElectronico, String numTarjeta)
	{
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.numTarjeta = numTarjeta;
		car = new Carrito();
	}
	
	public void agregarAlCarrito(Producto p)
	{
		car.agregarProducto(p);
	}
	
	public void eliminarDelCarrito(String nombre)
	{
		car.eliminarProducto(nombre);
	}
	
	public void imprimirCarrito()
	{	
		if(car.numProductos > 0)
		{
			car.imprimirProductos();
		}
		else
		{
			System.out.println("\n ERROR: El carrito esta vacio.\n");
		}
	}
	
	public void imprimirTotal()
	{
		System.out.println("\n El costo total del carrito de  " + nombre + "  es:\t" + car.calcularTotal() + "\n\n");
	}
	
	public String toString()
	{
		return "Nombre:\t " + nombre + "\n " +
				"Correo:\t " + correoElectronico + "\n " +
				"Numero de Tarjeta:\t: " + numTarjeta + "\n ";
	}
}