
package mundial.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import mundial.fitness.TestEquipoFitness;

public class EjecutorMundial {
     public static void main(String[] args) {
        try {
            TestEquipoFitness test = new TestEquipoFitness();
            test.initialize();
            test.testSelectFittestEquipos();
        } catch (Exception ex) {
            Logger.getLogger(EjecutorMundial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
