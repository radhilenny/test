import org.junit.Assert;
import org.junit.Test;

public class UtilidadesTest {
	@Test
	public void testConcatenar()
	{
		Utilidades utilidades =new Utilidades();
		String resultado= utilidades.concatenar("Hola","Sopra");
		Assert.assertEquals("Las cadena son diferencia", "HolaSopra", resultado);
	}
	@Test
	public void testfallo()
	{
		Utilidades utilidades =new Utilidades();
		String resultado= utilidades.concatenar("Hola","Sopra");
		Assert.assertEquals("Las cadena son diferencia", "HolaSopra", resultado);
	}
	@Test
	public void testerror()
	{
		Utilidades utilidades =new Utilidades();
		String resultado= utilidades.concatenar(null,"Sopra");
		Assert.assertEquals("Las cadena son diferencia", "HolaSopra", resultado);
	}
}
