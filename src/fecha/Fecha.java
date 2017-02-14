/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 203p27
 */
public class Fecha {
    int dia;
    int mes;
    int ano;
    
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Fecha() {
        Calendar fechaHoy=new GregorianCalendar();
        dia= fechaHoy.get(Calendar.DAY_OF_MONTH);
        mes=fechaHoy.get(Calendar.MONTH)+1;
        ano=fechaHoy.get(Calendar.YEAR);
    }
    
    
}
