package ClasesPokemon;

import java.util.HashMap;
import java.util.Map;

public class TablaDeTipos {

    public static final Map<Tipo,
            Map<Tipo, Double>>

            tabla = new HashMap<>();



    static {

        //Tipo normal

        Map<Tipo,Double> normal =
                new HashMap<>();

        normal.put(
                Tipo.ROCA,
                0.5);

        normal.put(
                Tipo.FANTASMA,
                0.0);

        normal.put(
                Tipo.ACERO,
                0.5);

        tabla.put(
                Tipo.NORMAL,
                normal);



        //Tipo Fuego

        Map<Tipo,Double> fuego =
                new HashMap<>();

        fuego.put(
                Tipo.PLANTA,
                2.0);

        fuego.put(
                Tipo.HIELO,
                2.0);

        fuego.put(
                Tipo.BICHO,
                2.0);

        fuego.put(
                Tipo.ACERO,
                2.0);

        fuego.put(
                Tipo.AGUA,
                0.5);

        fuego.put(
                Tipo.FUEGO,
                0.5);

        tabla.put(
                Tipo.FUEGO,
                fuego);


       

    }





	    public static double getMultiplicador(
	
	            Tipo ataque,
	
	            Tipo defensa
	
	    ) {
	
	
	        if (
	
	                ataque == null ||
	
	                defensa == null
	
	        ) {
	
	            throw new IllegalArgumentException(
	                    "Tipos null");
	
	        }
	
	
	
	        return
	
	                tabla
	
	                        .getOrDefault(
	
	                                ataque,
	
	                                new HashMap<>())
	
	                        .getOrDefault(
	
	                                defensa,
	
	                                1.0);
	
	    }

}