

import com.curso.flores.Flor;
import com.curso.flores.Gardenia;
import com.curso.jardines.Jardin;
import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.List;

public class TestJardin {

    @Test
    public void regarTest() {
        //inicializacion codigo
        Flor flor = new Gardenia(5, "gardenia");
        //definicion
        String resultado = flor.regar();
        //comprobación de resultado
        Assertions.assertEquals("Soy una gardenia y me estan regando" , resultado);
    }
    @Test
    public void florecerTest(){
        Flor flor = new Gardenia(5, "geranio");
        String resul = flor.florecer();
        Assertions.assertEquals("Soy una geranio y me ven porque estoy floreciendo", resul);
    }
    @Test
    public void addFlorTest(){
        Flor gardenia = new Gardenia(5, "gardenia");
        Jardin flor = new Jardin();
        flor.addFlor(gardenia);
        Assertions.assertEquals(gardenia, flor.getFlores().get(0) );
    }
    @Test
    public void removeFlorTest(){
        Flor gardenia = new Gardenia(5, "gardenia");
        Jardin flor = new Jardin();
        flor.addFlor(gardenia);
        flor.removeFlor(gardenia);
        Assertions.assertEquals(gardenia, flor.getFlores().size() == 0);
    }
}


