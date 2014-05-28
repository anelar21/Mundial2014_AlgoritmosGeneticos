package mundial.dao;

import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import mundial.modelo.Equipo;

public class DaoEquipo extends JpaDao<String, Equipo> {

    Connection con = null;

    public Equipo encontrarporId(String codigo) {
        Equipo encontrado = null;
        encontrado = getEm().find(Equipo.class, codigo);
        return encontrado;
    }

    public List<Equipo> encontrarPorNombre(String nombre) {
        List<Equipo> alNombre = null;
        Query consulta = getEm().createQuery("SELECT e FROM Equipo e WHERE e.nombre like '" + nombre + "'");
        alNombre = consulta.getResultList();
        return alNombre;
    }

    public List<String> encontrarPorNombres() {
        ArrayList alNombre = new ArrayList();
        for (Equipo e : encontrarTodos()) {
            alNombre.add(e.getNombre());

        }

        return alNombre;
    }

    public List<Equipo> encontrarPorGrupo(String grupo) {
        List<Equipo> alGrupo = null;
        Query consulta = getEm().createQuery("SELECT e FROM Equipo e WHERE e.grupo like '" + grupo + "'");
        alGrupo = consulta.getResultList();
        return alGrupo;
    }

    public List<Equipo> encontrarPorContinente(String continente) {
        List<Equipo> alContinente = null;
        Query consulta = getEm().createQuery("SELECT e FROM Equipo e WHERE e.continente like '" + continente + "'");
        alContinente = consulta.getResultList();
        return alContinente;
    }

    @Override
    public List<Equipo> encontrarTodos() {
        List<Equipo> todos = null;
        Query consulta = getEm().createQuery("SELECT e FROM Equipo e ");
        todos = consulta.getResultList();
        return todos;
    }
    
    public Integer obtenerResultadoPF1(){
//          ArrayList alPF1 = new ArrayList();
        Integer rpf1 = 0 ;
        Integer rpf2 = 0;
        Integer rpf3 = 0;
        Integer rfinal = 0;
        for (Equipo e : encontrarTodos()) {
            rpf1 = e.getP_final1();
            rpf2 = e.getP_final2();
            rpf2 = e.getP_final3();
           
            rfinal = rpf1 + rpf2 + rpf3;
         }
         
        return  rfinal;
    }
//    public List<Integer> obtenerResultadoPF2(){
//          ArrayList alPF2 = new ArrayList();
//        for (Equipo e : encontrarTodos()) {
//            alPF2.add(e.getP_final2());
//         }
//        return  alPF2;
//    }
//    
//    public List<Integer> obtenerResultadoPF3(){
//          ArrayList alPF3 = new ArrayList();
//        for (Equipo e : encontrarTodos()) {
//            alPF3.add(e.getP_final3());
//         }
//        return  alPF3;
//    }
//    
    

}
