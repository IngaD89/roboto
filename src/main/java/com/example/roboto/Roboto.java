package com.example.roboto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.decode;
import static java.lang.Integer.valueOf;

public class Roboto {

    public String respuesta(String frase) {


        Pattern pattern = Pattern.compile("¿Qué tiempo hace en (\\w+)\\?");
        Matcher matcher = pattern.matcher(frase);
        Pattern p = Pattern.compile("Me llamo (\\w+)\\.");
        Matcher m = p.matcher(frase);
        Pattern pa = Pattern.compile("¿Qué es mejor, (\\w+) o (\\w+)\\?");
        Matcher ma = pa.matcher(frase);
        Pattern digito = Pattern.compile("¿Cuánto es (\\d+?)\\+(\\d+?)\\?");
        Matcher calc = digito.matcher(frase);


        if (matcher.find()) {
            return "Te vas a "+ matcher.group(1) +" y lo miras";

        } else if(m.find()){
            return "encantada de conocerme, "+  m.group(1)+".";
        } else if(ma.find()){
            return "Sin duda "+ ma.group(1) +" es mejor que "+ ma.group(2);
        }  else if(calc.find()){
            return "La respuesta es " + valueOf(calc.group(1)) + valueOf(calc.group(2));
        }else {
            return "Hola a ti tambien";
        }

    }
}




