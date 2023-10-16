import java.io.IOException;

public class SistemasEscolares{
	public static void main (String[]args) throws IOException{
		
		System.out.println("Creando UEAs");
		UEA uea1 = new UEA("Sistemas Operativos",123, "DC03T");
		UEA uea2 = new UEA("Web dinamico",456 , "DC03T");
		UEA uea3 = new UEA("Bases de Datos",789 , "DC03T");
		UEA uea4 = new UEA("POO",1011 , "DC03T");
		UEA uea5 = new UEA("Tematico I", 1213, "DC03T");
		UEA uea6 = new UEA("Tematico II", 1215, "DC03T");
		UEA uea7 = new UEA("Estructura de datos",1001 , "DC02T");

		System.out.println("Creando Profesores");		
		Profesor luis = new Profesor("Luis", "Leyva", "del Foyo", 3456, "tecnologias");
		Profesor carlos = new Profesor("Carlos", "Jaimez", "Gonzalez", 2570, "computacion");
		Profesor cristian = new Profesor("Cristian", "Sanchez", "Sanchez", 4781, "tecnologias");
		
		System.out.println(luis);
		System.out.println(carlos);
		System.out.println(cristian);
		
		System.out.println("\nAsignando UEAs a profesores");	
		luis.impartirUEA(uea1);
		carlos.impartirUEA(uea2);
		carlos.impartirUEA(uea3);
		carlos.impartirUEA(uea2); //uea repetida
		cristian.impartirUEA(uea4);
		cristian.impartirUEA(uea5);	
		cristian.impartirUEA(uea6);	
		cristian.impartirUEA(uea7);//ya tiene 3 ueas el profesor
		
		System.out.println("\nImprimir los cursos actuales de cada profesores");	
		luis.cursosActuales();
		carlos.cursosActuales();
		cristian.cursosActuales();
		
		System.out.println("\nEstado actual de los profesores... \n");
		
		System.out.println(luis);
		System.out.println(carlos);
		System.out.println(cristian);
		
		System.out.println("\nCreando Alumnos");
////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
/////Excepciones/////////////////////////////////////////////////////////////
    System.out.print("Cursos de cada Profesor");
    try{
      carlos.cursosActuales();
    }
    catch(Excepcion e){
      System.out.println(e.getMessage());
			e.printStackTrace();
		}

    try{
			cristian.cursosActuales();	
		}
    catch(Excepcion e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

    try{
			luis.cursosActuales();	
		}
    catch(Excepcion e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

    System.out.print("Asignnacion de uea");
    try{
      carlos.impartirUEA(uea7);
    }
    catch(Excepcion e){
      System.out.println(e.getMessage());
			e.printStackTrace();
		}

    try{
			cristian.impartirUEA(uea5);	
		}
    catch(Excepcion e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

    


		Main a1 = new Main("Jennifer", "Segura", "Tapia", "2183076782", "tecnologias");
		Main a2 = new Main("Eduardo", "Hernandez", "Soto","2183087810" , "diseno");
		Main a3 = new Main("Agustin", "de la Rosa", "Martinez", "2183076522", "sociales");
		Main a4 = new Main("Alfonso", "Sanchez", "Sedas", "2183076451", "matematicas");
		Main a5 = new Main("Irving", "Mejia", "Barrera", "2173033702", "derecho");
		Main a6 = new Main("Vivian", "Reynoso", "Sanchez", "2183077449", "tecnologias");
		Main a7 = new Main("Daniel", "Aldama", "Lagos", "2183076764", "computacion");
		
		System.out.println("\nInscribiendo UEAs a alumnos");	
		
		System.out.println("\n");
		System.out.println(a1);
		a1.inscribirse(uea1);
		a1.inscribirse(uea2);
		a1.inscribirse(uea3);
		a1.inscribirse(uea4);
		a1.inscribirse(uea5);
		a1.inscribirse(uea6);//ya tiene 5 ueas el alumno
		a1.darDeBaja(123);
		a1.darDeBaja(789);
		a1.darDeBaja(1001); //uea no inscrita no se puede dar de baja
		a1.ueasInscritas();
		
		System.out.println("\n");
		System.out.println(a2);
		//a2.darDeBaja(123);//no tiene ueas inscritas
		//a2.inscribirse(uea3);
		//a2.inscribirse(uea1);
		//a2.inscribirse(uea4);
		//a2.inscribirse(uea7);
		//a2.darDeBaja(789);
	//	a2.ueasInscritas();
		try
		{
			a2.darDeBaja(123); //no tiene ueas inscritas
		}catch(Excepcion e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try{
			a2.ueasInscritas();
		}catch(Excepcion e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try{
			a2.inscribirse(uea3);
		}catch(Excepcion e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try{
			a2.inscribirse(uea1);
		}catch(RepiteUEA e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try{
			a2.inscribirse(uea4);
		}catch(Excepcion e){
			System.out.println(e.getMessage());
			e.printStackTrace();
    }
		try{
			a2.inscribirse(uea7);
		}catch(Excepcion e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try{
			a2.darDeBaja(789);
		}catch(Excepcion e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		
    try{
			a2.ueasInscritas();
    }catch(SiExcepcionnUEAs e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("\n");
		System.out.println(a5);
		a5.inscribirse(uea3);
		a5.inscribirse(uea1);
		a5.inscribirse(uea3);//uea repetida
		a5.darDeBaja(789);
		a5.ueasInscritas();
	}
    }}