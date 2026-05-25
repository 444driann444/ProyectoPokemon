package ClasesPokemon;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {

    private String nombre;
    private List<Pokemon> equipo;
    private Pokemon pokemonActivo;
    private char rango;


    private char[] rangos = {

            'Z','Y','X','W',
            'V','U','T','S',
            'R','Q','P','O',
            'N','M','L','K',
            'J','I','H','G',
            'F','E','D','C',
            'B','A'

    };




    public Entrenador(
            String nombre,
            char rango) {


        if (

                nombre == null ||

                nombre.isBlank()

        ) {

            throw new IllegalArgumentException(
                    "Nombre inválido");

        }


        if (

                rango < 'A'

                        ||

                        rango > 'Z'

        ) {

            throw new IllegalArgumentException(
                    "Rango inválido");

        }


        this.nombre =
                nombre;

        this.rango =
                rango;

        this.equipo =
                new ArrayList<>();

        this.pokemonActivo =
                null;

    }





    public void agregarPokemon(
            Pokemon pokemon) {


        if (

                pokemon == null

        ) {

            throw new IllegalArgumentException(
                    "Pokemon null");

        }


        if (

                equipo.contains(
                        pokemon)

        ) {

            throw new IllegalArgumentException(
                    "Pokemon repetido");

        }



        if (

                equipo.size()

                        >=

                        6

        ) {

            throw new IllegalArgumentException(
                    "Equipo lleno");

        }


        equipo.add(
                pokemon);


        if (

                pokemonActivo
                        == null

        ) {

            pokemonActivo =
                    pokemon;

        }

    }







    public void cambiarPokemon(
            Pokemon pokemonCambio) {


        if (

                pokemonCambio
                        == null

        ) {

            throw new IllegalArgumentException();

        }



        if (

                !equipo.contains(
                        pokemonCambio)

        ) {

            throw new IllegalArgumentException(
                    "No pertenece al equipo");

        }



        if (

                pokemonCambio
                        .getEstado()

                        ==

                        Estado.DEBILITADO

        ) {

            throw new IllegalArgumentException(
                    "Pokemon debilitado");

        }



        if (

                pokemonCambio
                        ==

                        pokemonActivo

        ) {

            throw new IllegalArgumentException(
                    "Ya es activo");

        }



        pokemonActivo =
                pokemonCambio;


    }




    public Pokemon devolverPokemon() {

        return pokemonActivo;

    }





    // comprobar si queda algun  pokemon


    public boolean comprobarEquipo() {


        for (

                Pokemon pokemon

                :

                equipo

        ) {


            if (

                    pokemon.getEstado()

                            ==

                            Estado.ACTIVO

            ) {

                return true;

            }


        }


        return false;

    }






    public int numeroDebilitados() {


        int contador =
                0;


        for (

                Pokemon pokemon

                :

                equipo

        ) {


            if (

                    pokemon.getEstado()

                            ==

                            Estado.DEBILITADO

            ) {

                contador++;

            }

        }


        return contador;

    }






    public void subirRango() {


        if (

                rango
                        ==

                        'A'

        ) {

            return;

        }



        for (

                int i=0;

                i<rangos.length;

                i++

        ) {


            if (

                    rango

                            ==

                            rangos[i]

            ) {


                rango =
                        rangos[i+1];


                break;

            }


        }


    }







    public void bajarRango() {


        if (

                rango
                        ==

                        'Z'

        ) {

            return;

        }



        for (

                int i=0;

                i<rangos.length;

                i++

        ) {


            if (

                    rango

                            ==

                            rangos[i]

            ) {


                rango =
                        rangos[i-1];


                break;

            }


        }


    }







    // Getters and Setters


    public String getNombre() {

        return nombre;

    }



    public void setNombre(
            String nombre) {

        this.nombre =
                nombre;

    }



    public List<Pokemon> getEquipo() {

        return equipo;

    }



    public Pokemon getPokemonActivo() {

        return pokemonActivo;

    }



    public void setPokemonActivo(
            Pokemon pokemonActivo) {

        this.pokemonActivo =
                pokemonActivo;

    }



    public char getRango() {

        return rango;

    }



    public void setRango(
            char rango) {

        this.rango =
                rango;

    }


}
