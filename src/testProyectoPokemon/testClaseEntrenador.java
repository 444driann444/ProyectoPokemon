package testProyectoPokemon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ClasesPokemon.Entrenador;
import ClasesPokemon.Estado;
import ClasesPokemon.Pokemon;
import ClasesPokemon.Tipo;

class testClaseEntrenador{


@Test

void agregarPokemon(){

Entrenador e=
new Entrenador(
"Ash",
'Z');

Pokemon p=
new Pokemon(
"Pika",
Tipo.ELÉCTRICO,
100,
100,
20,
Estado.ACTIVO);

e.agregarPokemon(p);

assertEquals(
1,
e.getEquipo().size());

}


@Test

void equipoMayor6(){

Entrenador e=
new Entrenador(
"Ash",'Z');

for(int i=0;i<6;i++){

e.agregarPokemon(

new Pokemon(
"P"+i,
Tipo.AGUA,
100,
100,
10,
Estado.ACTIVO));

}

assertThrows(

IllegalArgumentException.class,

()->{

e.agregarPokemon(

new Pokemon(
"extra",
Tipo.AGUA,
100,
100,
10,
Estado.ACTIVO));

});

}

}
