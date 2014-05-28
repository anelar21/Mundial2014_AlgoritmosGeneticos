package mundial.fitness;
import java.util.ArrayList;
import java.util.List;
import mundial.dao.DaoEquipo;
import mundial.modelo.*;
import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.DefaultFitnessEvaluator;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;
import org.jgap.impl.SwappingMutationOperator;

public class TestEquipoFitness {

    DaoEquipo dae = new DaoEquipo();
    final public static List<Equipo> a = new ArrayList<>();

    private Configuration conf;
    private SwappingMutationOperator swapper;
    private EquipoFitnessFunction fitnessFunction = null;
    public List equipos = new ArrayList();
    private static final int MAX_ALLOWED_EVOLUTIONS = 100;
    private Chromosome equipoChromosome = null;

    public void initialize() throws Exception {
        equipos = dae.encontrarTodos();
        conf = new DefaultConfiguration();
        Configuration.resetProperty(Configuration.PROPERTY_FITEVAL_INST);
        conf.setFitnessEvaluator(new DefaultFitnessEvaluator());
        conf.getGeneticOperators().clear();
        swapper = new SwappingMutationOperator(conf);
        conf.addGeneticOperator(swapper);
        conf.setPreservFittestIndividual(true);
        conf.setPopulationSize(32);
        conf.setKeepPopulationSizeConstant(false);
        fitnessFunction = new EquipoFitnessFunction(equipos);
        conf.setFitnessFunction(fitnessFunction);

        Gene[] equipoGenes = new Gene[4];
        equipoGenes[0] = new IntegerGene(conf, 0, equipos.size() - 1);
        equipoGenes[1] = new IntegerGene(conf, 0, equipos.size() - 1);
        equipoGenes[2] = new IntegerGene(conf, 0, equipos.size() - 1);
        equipoGenes[3] = new IntegerGene(conf, 0, equipos.size() - 1);

        equipoChromosome = new Chromosome(conf, equipoGenes);
        equipoGenes[0].setAllele(0);
        equipoGenes[1].setAllele(1);
        equipoGenes[2].setAllele(2);
        equipoGenes[3].setAllele(3);

       conf.setSampleChromosome(equipoChromosome);

    }

    public void testSelectFittestEquipos() throws Exception {

        equipos = dae.encontrarTodos();

        Genotype population = Genotype.randomInitialGenotype(conf);

        IChromosome bestSolutionSoFar = equipoChromosome;

        for (int i = 0; i < MAX_ALLOWED_EVOLUTIONS; i++) {
            population.evolve();
            IChromosome candidateBestSolution = population.getFittestChromosome();

            if (candidateBestSolution.getFitnessValue() > bestSolutionSoFar.getFitnessValue()) {
                bestSolutionSoFar = candidateBestSolution;

            }
        }
        printSolution(bestSolutionSoFar, equipos);

    }

    public void printSolution(IChromosome solution, List equipos) {
        System.out.println("Valor del Fitness: " + solution.getFitnessValue());
          for (int i = 0; i < solution.size(); i++) {
            int index = (Integer) solution.getGene(i).getAllele();
            Equipo equipo = (Equipo) equipos.get(index);
            a.add(equipo);
      
        }

    }

    public String SelecionarFittestEquipos() throws Exception {
        equipos = dae.encontrarTodos();
        String d = "";
        Equipo eq = new Equipo();
        Genotype population = Genotype.randomInitialGenotype(conf);

        IChromosome bestSolutionSoFar = equipoChromosome;

        for (int i = 0; i < MAX_ALLOWED_EVOLUTIONS; i++) {
            population.evolve();
            d = d.concat("" + "\n" + bestSolutionSoFar + "" + eq.getNombre());
        }
        return d;

    }
   
    
    
}
