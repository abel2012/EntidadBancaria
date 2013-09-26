/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.Datos;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class MovimientoBancario {
    
    private String idMovimientoBancario;
    private TipoMovimientoBancario tipoMovimientoBancario;
    private String importe;
    private Date fecha;
    private String saldoTotal;
    private String concepto;
    
    public MovimientoBancario(){}
    
    public MovimientoBancario(String idMovimientoBancario,TipoMovimientoBancario tipoMovimientoBancario,String importe,Date fecha,String saldoTotal,String concepto){
    
     this.idMovimientoBancario=idMovimientoBancario;
     this.tipoMovimientoBancario=tipoMovimientoBancario;
     this.importe=importe;
     this.fecha=fecha;
     this.saldoTotal=saldoTotal;
     this.concepto=concepto;
    
    }

    /**
     * @return the idMovimientoBancario
     */
    public String getIdMovimientoBancario() {
        return idMovimientoBancario;
    }

    /**
     * @param idMovimientoBancario the idMovimientoBancario to set
     */
    public void setIdMovimientoBancario(String idMovimientoBancario) {
        this.idMovimientoBancario = idMovimientoBancario;
    }

    /**
     * @return the tipoMovimientoBancario
     */
    public TipoMovimientoBancario getTipoMovimientoBancario() {
        return tipoMovimientoBancario;
    }

    /**
     * @param tipoMovimientoBancario the tipoMovimientoBancario to set
     */
    public void setTipoMovimientoBancario(TipoMovimientoBancario tipoMovimientoBancario) {
        this.tipoMovimientoBancario = tipoMovimientoBancario;
    }

    /**
     * @return the importe
     */
    public String getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(String importe) {
        this.importe = importe;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the saldoTotal
     */
    public String getSaldoTotal() {
        return saldoTotal;
    }

    /**
     * @param saldoTotal the saldoTotal to set
     */
    public void setSaldoTotal(String saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}