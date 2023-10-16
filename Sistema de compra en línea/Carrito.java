public class Carrito
{
	public static final int MAX_TAM = 69;
	public Producto [] productos; 
	public int numProductos;
	
	public Carrito()
	{
		productos = new Producto[MAX_TAM];
	}
	
	public void agregarProducto(Producto p)
	{
		productos[numProductos] = p;
		System.out.println("\n " + p.nombre + " se ha agregado al carrito...\n");
		numProductos++;	
	}
	
	public void eliminarProducto(String nombre)
	{
		if(numProductos > 0)
		{
			for(int i=0; i<numProductos; i++)
			{
				if(productos[i].nombre == nombre)
				{			
					System.out.println("\n " + productos[i].nombre + " ha sido eliminado del carrito...\n");
					
					if(i == MAX_TAM-1)
					{
						productos[i] = null;
						numProductos--;
					}
					else
					{
						int n = numProductos-1;
						
						for(int j=i; j<n; j++)
						{
							productos[j] = productos[j+1];
						}
						numProductos--;
						productos[numProductos] = null;
					}
					return;
				}
			}
			
			System.out.println("\n ERROR: El producto no esta en el carrito.\n");
		}
		
		System.out.println("\n ERROR: El carrito esta vacio.\n");
	}
	
	public void imprimirProductos()
	{	
		for(int i=0; i<numProductos; i++)
		{
			System.out.println(productos[i] + "\n ");
		}	
	}
	
	public double calcularTotal()
	{
		double total = 0.0;
		
		for(int i=0; i<numProductos; i++)
		{
			total = total + productos[i].precio;
		}
		
		return total;
	}		
}