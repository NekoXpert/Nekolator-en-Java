
package calculadorapromedial;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Felipe Reyes {Nekosor}
 */
public class PromedioTest {
    
    public PromedioTest() {
    }
    @Test
    public void PomedioFinalTest() {
 
       Promedio prom=new  Promedio(18.00, 16.00, 20.00, 19.00, 17.00, 20.00);
       //double nota_EVA1, double nota_EVA2, double nota_AA3, double p_Activa, double nota_AA4, double cuest
       
       double resultado;
       resultado = prom.CalcularEva3();
       assertEquals((20.00*0.70)+(19.00*0.30), resultado, 0.0);      
       
       double resultado2;
       resultado2 = prom.CalcularEva4();
       assertEquals((17.00*0.70)+(20.00*0.30), resultado2, 0.0);
       
       double resultado3;
       resultado3 = prom.PromedioFinal();
       assertEquals((18.00*0.15) + (16.00*0.20) + (((20.00*0.70) + (19.00*0.30))*0.30) + (((17.00*0.70) + (20.00*0.30))*0.35), resultado3, 0.0);
        
    }
        
        
        
        
}


