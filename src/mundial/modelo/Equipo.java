
package mundial.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipo")
public class Equipo implements Serializable {
    
@Id
@GeneratedValue
private String codigo;
private String nombre;
private String grupo;
private String continente;
private Integer Ubicacion_Rankin;
private long  Puntos_rankin;
private Integer Titulos_Ganados;
private Integer p_final1;
private Integer p_final2;
private Integer p_final3;



    public Equipo() {
    }

    public Equipo(String codigo, String nombre, String grupo, String continente, Integer Ubicacion_Rankin, long Puntos_rankin, Integer Titulos_Ganados, Integer p_final1, Integer p_final2, Integer p_final3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.grupo = grupo;
        this.continente = continente;
        this.Ubicacion_Rankin = Ubicacion_Rankin;
        this.Puntos_rankin = Puntos_rankin;
        this.Titulos_Ganados = Titulos_Ganados;
        this.p_final1 = p_final1;
        this.p_final2 = p_final2;
        this.p_final3 = p_final3;
    }

         
            
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getContinente() {
        return continente;
    }

    public Integer getUbicacion_Rankin() {
        return Ubicacion_Rankin;
    }

   
    public void setUbicacion_Rankin(Integer u_rankin) {
        this.Ubicacion_Rankin = u_rankin;
    }
    
     public Integer getTitulos_ganados() {
        return Titulos_Ganados;
    }

    
    public void setTitulos_ganados(Integer t_ganados) {
        this.Titulos_Ganados = t_ganados;
    }
  
    
    public void setPuntos_Rankin(long p_rankin) {
        this.Puntos_rankin = p_rankin;
    }
        
      public long getPuntos_Rankin() {
        return Puntos_rankin;
    }

    public void setP_final1(Integer p_final1) {
        this.p_final1 = p_final1;
    }

    public void setP_final2(Integer p_final2) {
        this.p_final2 = p_final2;
    }

    public void setP_final3(Integer p_final3) {
        this.p_final3 = p_final3;
    }

    public Integer getP_final1() {
        return p_final1;
    }

    public Integer getP_final2() {
        return p_final2;
    }

    public Integer getP_final3() {
        return p_final3;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
       
    
    
    
       @Override
//    public String toString() {
//        return this.codigo + " "+ this.nombre + " " + this.grupo + " " + this.continente + " " + this.Ubicacion_Rankin + " " + this.Titulos_Ganados + " " + this.Puntos_rankin + " " + this.p_final1 + " " + this.p_final2 + " " + this.p_final3;
//    }
        public String toString() {
        String r = String.format("\nNombre: %s\nGrupo: %s\nRankin: %s\nTitulos Ganados: %d\n",nombre,grupo,Puntos_rankin,Titulos_Ganados);
   return r;
        }
    
    
    
    
    
    
    
    
    
    
    
    
        
        public Integer obtenerPuntajePartidos() {
        Equipo eq = new Equipo();
        int puntaje_p1 = 0;
        int puntaje_p2 = 0;
        int puntaje_p3 = 0;
        int putaje_final;
        if ("Ganado".equals(eq.getP_final1())) {
            puntaje_p1 = 1;
        } else if ("Empatado".equals(eq.getP_final1())) {
            puntaje_p1 = 0;
        } else if ("Pertido".equals(eq.getP_final1())) {
            puntaje_p1 = -1;
        } else if ("Ganado".equals(eq.getP_final2())) {
            puntaje_p1 = 1;
        } else if ("Empatado".equals(eq.getP_final2())) {
            puntaje_p1 = 0;
        } else if ("Pertido".equals(eq.getP_final2())) {
            puntaje_p1 = -1;
        } else if ("Ganado".equals(eq.getP_final3())) {
            puntaje_p1 = 1;
        } else if ("Empatado".equals(eq.getP_final3())) {
            puntaje_p1 = 0;
        } else if ("Pertido".equals(eq.getP_final3())) {
            puntaje_p1 = -1;
        }
        putaje_final = puntaje_p1 + puntaje_p2 + puntaje_p3;
        return putaje_final;

    }
     
          
  }

      

