/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadbancaria;

import com.fpmislata.banco.Datos.CuentaBancaria;
import com.fpmislata.banco.Datos.EntidadBancaria;
import com.fpmislata.banco.Datos.MovimientoBancario;
import com.fpmislata.banco.Datos.SucursalBancaria;
import com.fpmislata.banco.Datos.TipoEntidadBancaria;
import com.fpmislata.banco.Datos.TipoMovimientoBancario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        EntidadBancaria entidadBancaria1 = new EntidadBancaria(1, "12346789", "Asaco", "A464578K", TipoEntidadBancaria.BANCO);
        EntidadBancaria entidadBancaria2 = new EntidadBancaria(2, "34562134", "Alibaba y los 40", "A567578S", TipoEntidadBancaria.CAJADEAHORRO);
               
        SucursalBancaria sucursalBancaria1 = new SucursalBancaria(1, entidadBancaria1, "12345678", "bankia");
        SucursalBancaria sucursalBancaria2 = new SucursalBancaria(2, entidadBancaria2, "13456723", "bancaja");

         List<SucursalBancaria> sucursal = entidadBancaria1.getSucursales();
        
        sucursal.add(sucursalBancaria1);
        sucursal.add(sucursalBancaria2);
        
        BigDecimal num = new BigDecimal("1200");
num = num.add(new BigDecimal("3.2"));

BigDecimal num2 = new BigDecimal("1600");
num2 = num2.add(new BigDecimal("5.3"));

        CuentaBancaria cuentaBancaria1 = new CuentaBancaria(1,sucursalBancaria1,"ES7721266563156007653456","14",num,"A464578K");
       CuentaBancaria cuentaBancaria2 = new CuentaBancaria(2,sucursalBancaria2,"ES7734676563156008753456","16",num2,"A567578S");
       
       BigDecimal num3 = new BigDecimal("100");
num3 = num3.add(new BigDecimal("5.3"));

BigDecimal num4 = new BigDecimal("1700");
num4 = num4.add(new BigDecimal("8.3"));

 BigDecimal num5 = new BigDecimal("150");
num5 = num5.add(new BigDecimal("8.3"));

BigDecimal num6 = new BigDecimal("1800");
num6 = num6.add(new BigDecimal("8.3"));

       MovimientoBancario movimientoBancario = new MovimientoBancario(1,TipoMovimientoBancario.DEBE,num3,"23-06-2013",num4,"debe");
        MovimientoBancario movimientoBancario = new MovimientoBancario(2,TipoMovimientoBancario.HABER,num5,"23-09-1993",num6,"debe");
       
    
    }

}
