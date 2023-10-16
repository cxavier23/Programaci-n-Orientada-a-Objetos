public class ClasePrincipal
{
	public static void main(String [] args)
	{
		Producto [] Inventario = new Producto[6];
		Inventario[0] = new Medicamento(11, "Genoprasol", 69.90, "Similares", "08/02/22");
		Inventario[1] = new Medicamento(12, "Medicasp", 22.45, "ACME", "17/06/21");
		Inventario[2] = new Prenda(21, "blusa", 156.99, "L", "Fosfo Fosfo");
		Inventario[3] = new Prenda(22, "jeans", 69.90, "XM", "Caqui");
		Inventario[4] = new Alimento(31, "taco", 24.89, "28/01/21", "28/01/21");
		Inventario[5] = new Alimento(32, "banana", 13.99, "22/01/21", "5/02/21");
		
		Usuario [] Clientes = new Usuario[3];
		Clientes[0] = new Usuario("Juan", "juan@juan.com.mx", "00006969");
		Clientes[1] = new Usuario("Jose", "jose@juan.com.mx", "00420420");
		Clientes[2] = new Usuario("Ana Conda", "culebra@serpentosa.com", "52525252");
		
		for(int i=0; i<3; i++)
		{
			System.out.println(Clientes[i]);
			Clientes[i].agregarAlCarrito(Inventario[i]);
			Clientes[i].agregarAlCarrito(Inventario[i+1]);
			Clientes[i].agregarAlCarrito(Inventario[i+2]);
			Clientes[i].imprimirCarrito();
			Clientes[i].imprimirTotal();
			Clientes[i].eliminarDelCarrito(Inventario[i+1].nombre);
			Clientes[i].imprimirCarrito();
			Clientes[i].imprimirTotal();
			Clientes[i].agregarAlCarrito(Inventario[i+3]);
			Clientes[i].imprimirCarrito();
			Clientes[i].imprimirTotal();
		}
	}
}