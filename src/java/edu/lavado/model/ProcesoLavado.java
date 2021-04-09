/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lavado.model;

/**
 *
 * @author HP
 */
public class ProcesoLavado {
    
    private int peso = 0;
    private int agua = 0;
    private String nivel = "";
    private int precio = 0;
    private int valorLibra = 1200;

    public ProcesoLavado() {
    }
    
    public ProcesoLavado(int peso, int agua, String nivel, int precio) {
        this.peso = peso;
        this.agua = agua;
        this.nivel = nivel;
        this.precio = precio;
    }

    public void calcular() {
        if(this.peso < 8){
            this.agua = 24;
            this.nivel = "Mínimo";
            this.precio = this.peso * this.valorLibra;
        } else {
            if(this.peso >= 8 && this.peso < 15){
                this.agua = 34;
                this.nivel = "Medio";
                this.precio = this.peso * this.valorLibra;
            } else {
                if(this.peso >= 15 && this.peso < 22){
                    this.agua = 44;
                    this.nivel = "Alto";
                    this.precio = this.peso * this.valorLibra;
                } else {
                    if(this.peso >= 22 && this.peso <= 30){
                        this.agua = 62;
                        this.nivel = "Máximo";
                        this.precio = this.peso * this.valorLibra;
                    } else {
                        this.agua = 0;
                        this.nivel = "Demasiado peso";
                        this.precio = 0;
                    }
                }
            }
        }
    }
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getvalorLibra() {
        return valorLibra;
    }
    
}
