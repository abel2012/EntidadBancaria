/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadbancaria;

import com.fpmislata.banco.Datos.EntidadBancaria;
import com.fpmislata.banco.Datos.TipoEntidadBancaria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<EntidadBancaria> entidad = new ArrayList<EntidadBancaria>();
        EntidadBancaria entidadBancaria1=new EntidadBancaria(1,"1234678923","Abel","A464578K",TipoEntidadBancaria.BANCO);
       EntidadBancaria entidadBancaria1=new EntidadBancaria(2,"34562134","Carlos","A567578S",TipoEntidadBancaria.CAJADEAHORROS);
       
       
    }
}
