public class Telefono
{
	public String numero;
	public String marca;
	public boolean enLlamada;
	
	
	public Telefono() {}
	public Telefono(String numero, String marca)
	{
		this.numero = numero;
		this.marca = marca; 
		enLlamada = false;
	}
	
	public void llamar(String num)
	{
		System.out.println("\n Llamando a: \t" + num + "...");
		enLlamada = true;
	}
	
	public void colgar()
	{
		if(enLlamada)
		{
			enLlamada = !enLlamada; 
		}
	}
	
	public String toString()
	{
		String estado;
		
		if(enLlamada)
		{
			estado = "Ocupado";
		}
		else
		{
			estado = "Disponible";
		}
		
		return "\n\n Marca: \t" + marca + "\n" +
				" Numero: \t" + numero + "\n" +
				" Estado: \t" + estado + "\n";
	}
}