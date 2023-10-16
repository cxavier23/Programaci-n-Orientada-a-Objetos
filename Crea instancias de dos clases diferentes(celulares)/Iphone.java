public class Iphone extends Celular
{
	public int modelo;
	private int ios;
	private int numFotos;
	
	public Iphone() {}
	public Iphone(String numero, String marca, int numMensajes, String password, int modelo, int ios)
	{
		super(numero, marca, numMensajes, password);
		this.modelo = modelo;
		this.ios = ios;
	}
	
	public void actualizar()
	{
		if(bateria >= 50)
		{
			ios = ios + 1;
			bateria = bateria - 50;
		}
	}
	
	public void tomarFotos(int n)
	{
		while(bateria >= 5 &&  n > 0)
		{
			numFotos = numFotos + 1;
			n = n - 1;
			bateria = bateria - 5;
		}
	}
	
	public void borrarFotos(int n)
	{
		while(n>0 && bateria >= 2)
		{
			numFotos = numFotos - 1;
			n = n - 1;
			bateria = bateria - 2;
		}
	}
	
	public String toString()
	{
		return super.toString() + 
				"\n Modelo: \t\t iphone " + modelo + "\n " +
				"Sistema Operativo: \t IOS " + ios + "\n " +
				"# de Fotos: \t\t" + numFotos + "\n ";
	}
}