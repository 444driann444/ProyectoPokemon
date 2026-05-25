package testProyectoPokemon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ClasesPokemon.Habilidad;
import ClasesPokemon.Tipo;

class testClaseHabilidad{


@Test

void habilidadValida(){

Habilidad h=
new Habilidad(
"Lanzallamas",
Tipo.FUEGO,
90);

assertEquals(
90,
h.getPotencia()
);

}


@Test

void potenciaNegativa(){

assertThrows(
IllegalArgumentException.class,

()->{

new Habilidad(
"Ascuas",
Tipo.FUEGO,
-1);

});

}

}
