/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package stickymemories.core;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author bernardovieira
 */
public class Reminder implements Serializable {
    
    private final int dia;
    private final int mes;
    private final int ano;
    private final int h;
    private final int m;
    
    public Reminder(int ano, int mes, int dia, int h, int m) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.h = h;
        this.m = m;
    }
    
    public long getReminderTime(){
        Calendar cal = Calendar.getInstance();
        cal.set(ano, mes, dia, h, m, 0);
        return cal.getTimeInMillis();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getHora() {
        return h;
    }

    public int getMinuto() {
        return m;
    }

    
    
}
