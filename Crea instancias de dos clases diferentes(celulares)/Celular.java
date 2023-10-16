public class Celular extends Telefono
{
	private int numMensajes;
	public int bateria;
	private String password;
	
	public Celular() {}
	public Celular(String numero, String marca, int numMensajes, String password)
	{
		super(numero, marca);
		this.numMensajes = numMensajes;
		this.password = password;
		bateria = 100;
	}
	
	public void llamar(String num)
	{
		if(!enLlamada && bateria > 10)
		{
			super.llamar(num);
			bateria = bateria - 10;
		}
	}
	
	public void cambiarPassword(String oldPassword, String newPassword)
	{
		if(password == oldPassword && bateria >= 5)
		{
			password = newPassword;
			bateria = bateria - 5;
		}
	}
	
	public boolean borrarMensajes(int n)
	{
		boolean flag = false;
		
		while(bateria >= 2 & numMensajes > 0 && n > 0)
		{
			numMensajes = numMensajes - 1;
			bateria = bateria - 2;
			n = n - 1;
			flag = true;
		}
		
		return flag;
	}
	
	public void cargar()
	{
		bateria = 100;
	}
	
	public String toString()
	{	
		return super.toString() + 
				"\n Bateria: \t\t" + bateria + "% \n " + 
				"Passowrd: \t\t" + password + "\n " +
				"# de Mensajes: \t"  + numMensajes + "\n";
	}
	
}