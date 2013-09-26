/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.Datos;

/**
 *
 * @author alumno
 */
public class SucursalBancaria {
    private String idSucursalBancaria;
    private EntidadBancaria entidadBancaria;
    private String codigoSucursal;
    private String nombre;
    
    public SucursalBancaria(){}
    
    public SucursalBancaria(String idSucursalBancaria,EntidadBancaria entidadBancaria,String codigoSucursal,String nombre ){
    this.idSucursalBancaria=idSucursalBancaria;
    this.entidadBancaria=entidadBancaria;
    this.codigoSucursal=codigoSucursal;
    this.nombre=nombre;
    
    
    }

    /**
     * @return the idSucursalBancaria
     */
    public String getIdSucursalBancaria() {
        return idSucursalBancaria;
    }

    /**
     * @param idSucursalBancaria the idSucursalBancaria to set
     */
    public void setIdSucursalBancaria(String idSucursalBancaria) {
        this.idSucursalBancaria = idSucursalBancaria;
    }

    /**
     * @return the entidadBancaria
     */
    public EntidadBancaria getEntidadBancaria() {
        return entidadBancaria;
    }

    /**
     * @param entidadBancaria the entidadBancaria to set
     */
    public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    /**
     * @return the codigoSucursal
     */
    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    /**
     * @param codigoSucursal the codigoSucursal to set
     */
    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
