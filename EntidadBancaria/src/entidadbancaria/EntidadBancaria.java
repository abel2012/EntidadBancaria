/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadbancaria;

import com.fpmislata.banco.Datos.EntidadBancaria;
import com.fpmislata.banco.Datos.SucursalBancaria;
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
        EntidadBancaria entidadBancaria1=new EntidadBancaria(1,"12346789","Asaco","A464578K",TipoEntidadBancaria.BANCO);
       EntidadBancaria entidadBancaria2=new EntidadBancaria(2,"34562134","Alibaba y los 40","A567578S",TipoEntidadBancaria.CAJADEAHORROS);
       
       SucursalBancaria sucursalBancaria=new SucursalBancaria1(1,entidadBancaria1,"12345678","bankia");
       SucursalBancaria sucursalBancaria=new SucursalBancaria2(2,entidadBancaria2,"13456723","bancaja");
       
       CuentaBancaria cuentaBancaria=
       
       
    }
}
