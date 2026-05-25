package testProyectoPokemon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ClasesPokemon.Combate;
import ClasesPokemon.Entrenador;
import ClasesPokemon.Estado;
import ClasesPokemon.Habilidad;
import ClasesPokemon.Pokemon;
import ClasesPokemon.Tipo;

class TestClaseCombate {

    @Test
    void crearCombateValido() {

        Entrenador e1 =
                new Entrenador(
                        "Ash",
                        'Z');

        Entrenador e2 =
                new Entrenador(
                        "Gary",
                        'Y');


        Combate combate =
                new Combate(
                        e1,
                        e2);


        assertEquals(
                1,
                combate.getTurnoActual());

    }



    @Test
    void calcularDanio() {

        Pokemon defensor =
                new Pokemon(
                        "Bulbasaur",
                        Tipo.PLANTA,
                        100,
                        100,
                        20,
                        Estado.ACTIVO);


        Habilidad ataque =
                new Habilidad(
                        "Lanzallamas",
                        Tipo.FUEGO,
                        90);


        Entrenador e1 =
                new Entrenador(
                        "Ash",
                        'Z');

        Entrenador e2 =
                new Entrenador(
                        "Gary",
                        'Y');


        Combate combate =
                new Combate(
                        e1,
                        e2);


        int daño =

                combate.calcularDanioTurno(
                        ataque,
                        defensor);


        assertTrue(
                daño > 0);

    }



    @Test
    void detectarPokemonDebilitado() {

        Pokemon p =

                new Pokemon(
                        "Pikachu",
                        Tipo.ELÉCTRICO,
                        100,
                        0,
                        10,
                        Estado.DEBILITADO);


        Combate combate =

                new Combate(

                        new Entrenador(
                                "Ash",
                                'Z'),

                        new Entrenador(
                                "Gary",
                                'Y'));


        assertTrue(

                combate.detectarDebilitado(
                        p));

    }




    @Test
    void detectarFinalCombate() {

        Entrenador entrenador =

                new Entrenador(
                        "Ash",
                        'Z');


        Pokemon p =

                new Pokemon(

                        "Pikachu",

                        Tipo.ELÉCTRICO,

                        100,

                        0,

                        10,

                        Estado.DEBILITADO);


        entrenador.agregarPokemon(
                p);


        Combate combate =

                new Combate(

                        entrenador,

                        new Entrenador(
                                "Gary",
                                'Y'));


        assertTrue(

                combate.detectarFinalCombate(
                        entrenador));

    }




    @Test
    void determinarGanador() {

        Entrenador ash =

                new Entrenador(
                        "Ash",
                        'Z');


        Entrenador gary =

                new Entrenador(
                        "Gary",
                        'Y');


        Pokemon debilitado =

                new Pokemon(

                        "Pikachu",

                        Tipo.ELÉCTRICO,

                        100,

                        0,

                        10,

                        Estado.DEBILITADO);


        gary.agregarPokemon(
                debilitado);


        Combate combate =

                new Combate(
                        ash,
                        gary);


        combate.determinarGanador();


        assertEquals(

                "Ash",

                combate.getGanador());

    }




    @Test
    void multiplicadorTipos() {

        Combate combate =

                new Combate(

                        new Entrenador(
                                "Ash",
                                'Z'),

                        new Entrenador(
                                "Gary",
                                'Y'));


        double multiplicador =

                combate.multiDanioPorTipos(

                        Tipo.FUEGO,

                        Tipo.PLANTA);


        assertEquals(

                2.0,

                multiplicador);

    }

}