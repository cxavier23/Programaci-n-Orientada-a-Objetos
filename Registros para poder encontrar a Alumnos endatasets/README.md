# Codigo EDOI
### //author: Christopher Xavier Sanchez Duran
### //UAMC

## Main.java
La clase Main modela un alumno con la capacidad de inscribirse en UEAs y dar de baja a las mismas. También puede mostrar las UEAs en las que está inscrito y proporciona una representación de cadena del alumno. Esta clase se basa en la clase Persona y se utiliza para gestionar las actividades académicas de un estudiante en un sistema de enseñanza.
Atributos:

MAX_UEAS: Una constante entera con un valor de 5 que representa el número máximo de UEAs (Unidades de Enseñanza-Aprendizaje) que un alumno puede inscribirse.
matricula: Una cadena de caracteres que almacena la matrícula del alumno.
licenciatura: Una cadena de caracteres que almacena la licenciatura del alumno.
numUeasInscritas: Un entero que lleva el control del número de UEAs a las que se ha inscrito el alumno.
ueas: Un arreglo de objetos de tipo UEA que almacena las UEAs a las que se ha inscrito el alumno.
Constructores:

Constructor sin argumentos: Inicializa el arreglo ueas con una longitud de MAX_UEAS.
Constructor con argumentos: Recibe el nombre, apellido paterno, apellido materno, matrícula y licenciatura del alumno. Además, inicializa el arreglo ueas con una longitud de MAX_UEAS.
Métodos:

inscribirse(UEA uea): Permite al alumno inscribirse en una UEA. Verifica si el alumno ya está inscrito en esa UEA y si no ha alcanzado el límite de inscripciones. Luego, añade la UEA al arreglo ueas.
darDeBaja(int clave): Permite al alumno darse de baja de una UEA especificada por su clave. Elimina la UEA del arreglo ueas.
ueasInscritas(): Muestra las UEAs inscritas por el alumno.
toString(): Proporciona una representación de cadena del alumno, incluyendo su nombre, matrícula y licenciatura.

// author: Christopher Xavier Sanchez Duran
// Github: https://github.com/cxavier23
// Portafolio: https://cxavier23.github.io/

