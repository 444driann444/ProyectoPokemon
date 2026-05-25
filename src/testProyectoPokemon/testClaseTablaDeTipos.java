package testProyectoPokemon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ClasesPokemon.TablaDeTipos;
import ClasesPokemon.Tipo;

class testClaseTablaDeTipos{


@Test

void fuegoPlanta(){

assertEquals(

2.0,

TablaDeTipos
.getMultiplicador(
Tipo.FUEGO,
Tipo.PLANTA)

);

}



@Test

void electricoTierra(){

assertEquals(

0.0,

TablaDeTipos
.getMultiplicador(
Tipo.ELÉCTRICO,
Tipo.TIERRA)

);

}


@Test

void ataquenull(){

assertThrows(

IllegalArgumentException.class,

()->{

TablaDeTipos
.getMultiplicador(
null,
Tipo.FUEGO);

});

}

}
