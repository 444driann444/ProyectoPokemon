package testProyectoPokemon;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ClasesPokemon.Pokemon;
import ClasesPokemon.Tipo;
import ClasesPokemon.Estado;

class testClasePokemon {

    @Test
    void crearPokemonValido() {

        Pokemon p = new Pokemon(
                "Pikachu",
                Tipo.ELÉCTRICO,
                100,
                100,
                50,
                Estado.ACTIVO
        );

        assertEquals(
                "Pikachu",
                p.getNombre()
        );

    }


    @Test
    void nombreNull() {

        assertThrows(
                IllegalArgumentException.class,

                () -> {

                    new Pokemon(
                            null,
                            Tipo.FUEGO,
                            100,
                            100,
                            10,
                            Estado.ACTIVO
                    );

                });

    }


    @Test
    void vidaMayorMaxima() {

        assertThrows(

                IllegalArgumentException.class,

                () -> {

                    new Pokemon(
                            "Pika",
                            Tipo.FUEGO,
                            100,
                            200,
                            10,
                            Estado.ACTIVO
                    );

                });

    }

}