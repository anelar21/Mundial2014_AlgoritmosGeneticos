package mundial.fitness;

import mundial.modelo.*;
import java.util.ArrayList;
import java.util.List;
import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

public class EquipoFitnessFunction extends FitnessFunction {

    List equipos = new ArrayList();

    public EquipoFitnessFunction(List equipos) {
        this.equipos = equipos;

    }

    @Override
    protected double evaluate(IChromosome ic) {
        double puntos = 0;
        List dups = new ArrayList();
        int badSolution = 1;
        for (int i = 0; i < ic.size(); i++) {
            int index = (Integer) ic.getGene(i).getAllele();
            if (dups.contains(index)) {
                badSolution = 0;
            } else {
                dups.add(index);
            }
            Equipo equipo = (Equipo) equipos.get(index);
            double genreScore = getGenreScore(equipo);
            if (genreScore == 0) {
                badSolution = 0;
            }
            puntos = (puntos + genreScore);
        }
        return (puntos * badSolution);
    }

    private double getGenreScore(Equipo equipo) {
        double genreScore;
        double p = 0;
        p = (equipo.getPuntos_Rankin() + equipo.getTitulos_ganados()
                + equipo.getP_final1() + equipo.getP_final2() + equipo.getP_final3());

        genreScore = p;

        return genreScore;
    }

}
