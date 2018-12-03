
public class Persona {
	
private String Nombre;
private String apellido;
public Persona() {
	super();
}
public Persona(String nombre, String apellido) {
	super();
	Nombre = nombre;
	this.apellido = apellido;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}

}
