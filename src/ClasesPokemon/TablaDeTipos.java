package ClasesPokemon;

import java.util.HashMap;
import java.util.Map;



public class TablaDeTipos {

    public static final Map<Tipo, Map<Tipo, Double>> tabla = new HashMap<>();

    static {

        // NORMAL
        Map<Tipo, Double> normal = new HashMap<>();
        normal.put(Tipo.ROCA, 0.5);
        normal.put(Tipo.FANTASMA, 0.0);
        normal.put(Tipo.ACERO, 0.5);
        tabla.put(Tipo.NORMAL, normal);

        // FUEGO
        Map<Tipo, Double> fuego = new HashMap<>();
        fuego.put(Tipo.PLANTA, 2.0);
        fuego.put(Tipo.HIELO, 2.0);
        fuego.put(Tipo.BICHO, 2.0);
        fuego.put(Tipo.ACERO, 2.0);
        fuego.put(Tipo.FUEGO, 0.5);
        fuego.put(Tipo.AGUA, 0.5);
        fuego.put(Tipo.ROCA, 0.5);
        fuego.put(Tipo.DRAGÓN, 0.5);
        tabla.put(Tipo.FUEGO, fuego);

        // AGUA
        Map<Tipo, Double> agua = new HashMap<>();
        agua.put(Tipo.FUEGO, 2.0);
        agua.put(Tipo.TIERRA, 2.0);
        agua.put(Tipo.ROCA, 2.0);
        agua.put(Tipo.AGUA, 0.5);
        agua.put(Tipo.PLANTA, 0.5);
        agua.put(Tipo.DRAGÓN, 0.5);
        tabla.put(Tipo.AGUA, agua);

        // ELECTRICO
        Map<Tipo, Double> electrico = new HashMap<>();
        electrico.put(Tipo.AGUA, 2.0);
        electrico.put(Tipo.VOLADOR, 2.0);
        electrico.put(Tipo.ELÉCTRICO, 0.5);
        electrico.put(Tipo.PLANTA, 0.5);
        electrico.put(Tipo.DRAGÓN, 0.5);
        electrico.put(Tipo.TIERRA, 0.0);
        tabla.put(Tipo.ELÉCTRICO, electrico);

        // PLANTA
        Map<Tipo, Double> planta = new HashMap<>();
        planta.put(Tipo.AGUA, 2.0);
        planta.put(Tipo.TIERRA, 2.0);
        planta.put(Tipo.ROCA, 2.0);
        planta.put(Tipo.FUEGO, 0.5);
        planta.put(Tipo.PLANTA, 0.5);
        planta.put(Tipo.VENENO, 0.5);
        planta.put(Tipo.VOLADOR, 0.5);
        planta.put(Tipo.BICHO, 0.5);
        planta.put(Tipo.DRAGÓN, 0.5);
        planta.put(Tipo.ACERO, 0.5);
        tabla.put(Tipo.PLANTA, planta);

        // HIELO
        Map<Tipo, Double> hielo = new HashMap<>();
        hielo.put(Tipo.PLANTA, 2.0);
        hielo.put(Tipo.TIERRA, 2.0);
        hielo.put(Tipo.VOLADOR, 2.0);
        hielo.put(Tipo.DRAGÓN, 2.0);
        hielo.put(Tipo.FUEGO, 0.5);
        hielo.put(Tipo.AGUA, 0.5);
        hielo.put(Tipo.HIELO, 0.5);
        hielo.put(Tipo.ACERO, 0.5);
        tabla.put(Tipo.HIELO, hielo);

        // LUCHA
        Map<Tipo, Double> lucha = new HashMap<>();
        lucha.put(Tipo.NORMAL, 2.0);
        lucha.put(Tipo.HIELO, 2.0);
        lucha.put(Tipo.ROCA, 2.0);
        lucha.put(Tipo.SINIESTRO, 2.0);
        lucha.put(Tipo.ACERO, 2.0);
        lucha.put(Tipo.VENENO, 0.5);
        lucha.put(Tipo.VOLADOR, 0.5);
        lucha.put(Tipo.PSÍQUICO, 0.5);
        lucha.put(Tipo.BICHO, 0.5);
        lucha.put(Tipo.HADA, 0.5);
        lucha.put(Tipo.FANTASMA, 0.0);
        tabla.put(Tipo.LUCHA, lucha);

        // VENENO
        Map<Tipo, Double> veneno = new HashMap<>();
        veneno.put(Tipo.PLANTA, 2.0);
        veneno.put(Tipo.HADA, 2.0);
        veneno.put(Tipo.VENENO, 0.5);
        veneno.put(Tipo.TIERRA, 0.5);
        veneno.put(Tipo.ROCA, 0.5);
        veneno.put(Tipo.FANTASMA, 0.5);
        veneno.put(Tipo.ACERO, 0.0);
        tabla.put(Tipo.VENENO, veneno);

        // TIERRA
        Map<Tipo, Double> tierra = new HashMap<>();
        tierra.put(Tipo.FUEGO, 2.0);
        tierra.put(Tipo.ELÉCTRICO, 2.0);
        tierra.put(Tipo.VENENO, 2.0);
        tierra.put(Tipo.ROCA, 2.0);
        tierra.put(Tipo.ACERO, 2.0);
        tierra.put(Tipo.PLANTA, 0.5);
        tierra.put(Tipo.BICHO, 0.5);
        tierra.put(Tipo.VOLADOR, 0.0);
        tabla.put(Tipo.TIERRA, tierra);

        // VOLADOR
        Map<Tipo, Double> volador = new HashMap<>();
        volador.put(Tipo.PLANTA, 2.0);
        volador.put(Tipo.LUCHA, 2.0);
        volador.put(Tipo.BICHO, 2.0);
        volador.put(Tipo.ELÉCTRICO, 0.5);
        volador.put(Tipo.ROCA, 0.5);
        volador.put(Tipo.ACERO, 0.5);
        tabla.put(Tipo.VOLADOR, volador);

        // PSIQUICO
        Map<Tipo, Double> psiquico = new HashMap<>();
        psiquico.put(Tipo.LUCHA, 2.0);
        psiquico.put(Tipo.VENENO, 2.0);
        psiquico.put(Tipo.PSÍQUICO, 0.5);
        psiquico.put(Tipo.ACERO, 0.5);
        psiquico.put(Tipo.SINIESTRO, 0.0);
        tabla.put(Tipo.PSÍQUICO, psiquico);

        // BICHO
        Map<Tipo, Double> bicho = new HashMap<>();
        bicho.put(Tipo.PLANTA, 2.0);
        bicho.put(Tipo.PSÍQUICO, 2.0);
        bicho.put(Tipo.SINIESTRO, 2.0);
        bicho.put(Tipo.FUEGO, 0.5);
        bicho.put(Tipo.LUCHA, 0.5);
        bicho.put(Tipo.VENENO, 0.5);
        bicho.put(Tipo.VOLADOR, 0.5);
        bicho.put(Tipo.FANTASMA, 0.5);
        bicho.put(Tipo.ACERO, 0.5);
        bicho.put(Tipo.HADA, 0.5);
        tabla.put(Tipo.BICHO, bicho);

        // ROCA
        Map<Tipo, Double> roca = new HashMap<>();
        roca.put(Tipo.FUEGO, 2.0);
        roca.put(Tipo.HIELO, 2.0);
        roca.put(Tipo.VOLADOR, 2.0);
        roca.put(Tipo.BICHO, 2.0);
        roca.put(Tipo.LUCHA, 0.5);
        roca.put(Tipo.TIERRA, 0.5);
        roca.put(Tipo.ACERO, 0.5);
        tabla.put(Tipo.ROCA, roca);

        // FANTASMA
        Map<Tipo, Double> fantasma = new HashMap<>();
        fantasma.put(Tipo.PSÍQUICO, 2.0);
        fantasma.put(Tipo.FANTASMA, 2.0);
        fantasma.put(Tipo.SINIESTRO, 0.5);
        fantasma.put(Tipo.NORMAL, 0.0);
        tabla.put(Tipo.FANTASMA, fantasma);

        // DRAGON
        Map<Tipo, Double> dragon = new HashMap<>();
        dragon.put(Tipo.DRAGÓN, 2.0);
        dragon.put(Tipo.ACERO, 0.5);
        dragon.put(Tipo.HADA, 0.0);
        tabla.put(Tipo.DRAGÓN, dragon);

        // SINIESTRO
        Map<Tipo, Double> siniestro = new HashMap<>();
        siniestro.put(Tipo.PSÍQUICO, 2.0);
        siniestro.put(Tipo.FANTASMA, 2.0);
        siniestro.put(Tipo.LUCHA, 0.5);
        siniestro.put(Tipo.SINIESTRO, 0.5);
        siniestro.put(Tipo.HADA, 0.5);
        tabla.put(Tipo.SINIESTRO, siniestro);

        // ACERO
        Map<Tipo, Double> acero = new HashMap<>();
        acero.put(Tipo.HIELO, 2.0);
        acero.put(Tipo.ROCA, 2.0);
        acero.put(Tipo.HADA, 2.0);
        acero.put(Tipo.FUEGO, 0.5);
        acero.put(Tipo.AGUA, 0.5);
        acero.put(Tipo.ELÉCTRICO, 0.5);
        acero.put(Tipo.ACERO, 0.5);
        tabla.put(Tipo.ACERO, acero);

        // HADA
        Map<Tipo, Double> hada = new HashMap<>();
        hada.put(Tipo.LUCHA, 2.0);
        hada.put(Tipo.DRAGÓN, 2.0);
        hada.put(Tipo.SINIESTRO, 2.0);
        hada.put(Tipo.FUEGO, 0.5);
        hada.put(Tipo.VENENO, 0.5);
        hada.put(Tipo.ACERO, 0.5);
        tabla.put(Tipo.HADA, hada);
    }

    public static double getMultiplicador(Tipo ataque, Tipo defensa) {
        return tabla
                .getOrDefault(ataque, new HashMap<>())
                .getOrDefault(defensa, 1.0);
    }
}
