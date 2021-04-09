/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lavado.controller;

import edu.lavado.model.ProcesoLavado;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author HP
 */
@ManagedBean
@SessionScoped
public class CalculoLavado implements Serializable{

    private ProcesoLavado PL = new ProcesoLavado();
    private ArrayList<ProcesoLavado> listaResultados = new ArrayList<>();
    
    public CalculoLavado() {
    }

    public void calLavado(){
        PL.calcular();
        listaResultados.add(new ProcesoLavado(PL.getPeso(),PL.getAgua(),PL.getNivel(),PL.getPrecio()));
    }
    
    public ProcesoLavado getPL() {
        return PL;
    }

    public void setPL(ProcesoLavado PL) {
        this.PL = PL;
    }

    public ArrayList<ProcesoLavado> getListaResultados() {
        return listaResultados;
    }

    public void setListaResultados(ArrayList<ProcesoLavado> listaResultados) {
        this.listaResultados = listaResultados;
    }
    
}
