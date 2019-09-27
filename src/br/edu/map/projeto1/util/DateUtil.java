/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.map.projeto1.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allyson
 */
public class DateUtil {
    
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    
    public static String dateToString(Date data){
        return formatter.format(data);
    }
    
    public static Date stringToDate(String dataStr){
        try {
            return formatter.parse(dataStr);
        } catch (ParseException ex) {
            return null;
        }
    }
}
