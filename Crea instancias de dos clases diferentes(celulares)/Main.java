public class PhoneTest
{
	 //author: Christopher Xavier Sanchez Duran
 //UAMC

// author: Christopher Xavier Sanchez Duran
// Github: https://github.com/cxavier23
// Portafolio: https://cxavier23.github.io/

	public static void main(String [] args)
	{
		Pearphone pe = new Pearphone("69420666", "Pear", 4, "password", 3000);
		System.out.println(pe);
		
		pe.crearWidgets(12);
		pe.tomarFotos(6);
		pe.llamar("69696969");
		System.out.println(pe);
		
		pe.colgar();
		pe.cargar();
		pe.borrarWidgets(4);
		pe.borrarMensajes(3);
		System.out.println(pe);
		
		
		
		Iphone ip = new Iphone("00420420", "Apple", 69, "contrasenia", 12, 10);
		System.out.println(ip);
		
		ip.tomarFotos(7);
		ip.actualizar();
		ip.cambiarPassword("contrasenia", "clave");
		System.out.println(ip);
		
		ip.cargar();
		ip.borrarFotos(4);
		ip.actualizar();
		System.out.println(ip);
	}
}
// author: Christopher Xavier Sanchez Duran
// Github: https://github.com/cxavier23
// Portafolio: https://cxavier23.github.io/