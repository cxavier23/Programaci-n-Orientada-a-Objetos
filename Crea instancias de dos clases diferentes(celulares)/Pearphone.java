public class Pearphone extends Celular
{
	private double memoriaDisp;
	private int numWidgets;
	private int numFotos;
	
	public Pearphone() {}
	public Pearphone(String numero, String marca, int numMensajes, String password, double memoriaDisp)
	{
		super(numero, marca, numMensajes, password);
		this.memoriaDisp = memoriaDisp - numMensajes * 5;
	}
	
	public void crearWidgets(int n)
	{
		while(n > 0 && bateria >= 5 && memoriaDisp >= 50)
		{
			numWidgets = numWidgets + 1;
			bateria = bateria - 5;
			memoriaDisp = memoriaDisp - 50;
			n = n - 1;
		}
	}
	
	public void borrarWidgets(int n)
	{
		while(n > 0 && bateria >= 5)
		{
			numWidgets = numWidgets - 1;
			bateria = bateria - 5;
			memoriaDisp = memoriaDisp + 50;
			n = n - 1;
		}
	}
	
	public void tomarFotos(int n)
	{
		while(n>0 && bateria >= 3 && memoriaDisp >= 20)
		{
			numFotos = numFotos + 1;
			bateria = bateria - 3;
			memoriaDisp = memoriaDisp - 20;
			n = n - 1;
		}
	}
	
	public void borrarFotos(int n)
	{
		while(n>0 && bateria >= 1)
		{
			numFotos = numFotos - 1;
			bateria = bateria - 1;
			memoriaDisp = memoriaDisp + 20;
			n = n - 1;
		}
	}
	
	public boolean borrarMensajes(int n)
	{
		boolean flag = false;
		
		while(n != 0 && super.borrarMensajes(1))
		{
			memoriaDisp = memoriaDisp + 5;
			n = n - 1;
			flag = true;
		}
		
		return flag;
	}
	
	public String toString()
	{
		return super.toString() + 
				"\n Memoria Disponible: \t" + memoriaDisp + " blocks \n " +
				"# de Widgets: \t\t" + numWidgets + "\n " +
				"# de Fotos: \t\t" + numFotos + "\n ";
	}
}