

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class PersonaTest {
private Persona persona;
	@Before
	public void setUp() throws Exception {
		persona = new Persona("Juan","Goldarecena");
	}

	@Test
	public void testGetNombre() throws Exception {
		//given // condicion previa al text

		//when // ejecucion de la prueba  

		//then // condicion que se cumplen para validar el text 
		
Assert.assertTrue(persona.getNombre().equals("Juan"));
	}

}
