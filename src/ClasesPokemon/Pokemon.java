package ClasesPokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    private String nombre;
    private Tipo tipo;

    private int vidaMaxima;
    private int vidaActual;

    private int defensa;

    private Estado estado;

    private ArrayList<Habilidad> habilidades;





    public Pokemon(

            String nombre,

            Tipo tipo,

            int vidaMaxima,

            int vidaActual,

            int defensa,

            Estado estado

    ) {


        if (

                nombre == null ||

                        nombre.isBlank()

        ) {

            throw new IllegalArgumentException(
                    "Nombre inválido");

        }



        if (

                tipo == null

        ) {

            throw new IllegalArgumentException(
                    "Tipo inválido");

        }



        if (

                vidaMaxima <= 0

        ) {

            throw new IllegalArgumentException(
                    "Vida máxima inválida");

        }



        if (

                vidaActual <= 0 ||

                        vidaActual > vidaMaxima

        ) {

            throw new IllegalArgumentException(
                    "Vida actual inválida");

        }



        if (

                defensa <= 0

        ) {

            throw new IllegalArgumentException(
                    "Defensa inválida");

        }



        if (

                estado == null

        ) {

            throw new IllegalArgumentException(
                    "Estado inválido");

        }



        this.nombre =
                nombre;

        this.tipo =
                tipo;

        this.vidaMaxima =
                vidaMaxima;

        this.vidaActual =
                vidaActual;

        this.defensa =
                defensa;

        this.estado =
                estado;

        this.habilidades =
                new ArrayList<>();

    }





    // Agregar Habilidad


    public void agregarMovimiento(
            Habilidad habilidad) {


        if (

                habilidad == null

        ) {

            throw new IllegalArgumentException();

        }



        if (

                habilidades.size()

                        >=

                        4

        ) {

            throw new IllegalArgumentException(
                    "Máximo 4");

        }



        habilidades.add(
                habilidad);

    }










    public void recibirDano(

            Habilidad ataque,

            Combate combate

    ) {


        int daño =

                combate.calcularDanioTurno(

                        ataque,

                        this

                );



        vidaActual -= daño;



        if (

                vidaActual <= 0

        ) {

            vidaActual = 0;

            estado =
                    Estado.DEBILITADO;

        }


    }









    public void curarVida(
            int vida) {


        if (

                vida < 0

        ) {

            throw new IllegalArgumentException();

        }



        vidaActual += vida;



        if (

                vidaActual >

                        vidaMaxima

        ) {

            vidaActual =
                    vidaMaxima;

        }


    }








    public boolean comprobarSiEstaDebilitado() {


        return

                estado

                        ==

                        Estado.DEBILITADO;

    }







    public void reiniciarEstado() {

        estado =
                Estado.ACTIVO;

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



    public Tipo getTipo() {

        return tipo;

    }



    public void setTipo(
            Tipo tipo) {

        this.tipo =
                tipo;

    }



    public int getVidaMaxima() {

        return vidaMaxima;

    }



    public void setVidaMaxima(
            int vidaMaxima) {

        this.vidaMaxima =
                vidaMaxima;

    }



    public int getVidaActual() {

        return vidaActual;

    }



    public void setVidaActual(
            int vidaActual) {

        this.vidaActual =
                vidaActual;

    }



    public int getDefensa() {

        return defensa;

    }



    public void setDefensa(
            int defensa) {

        this.defensa =
                defensa;

    }



    public Estado getEstado() {

        return estado;

    }



    public void setEstado(
            Estado estado) {

        this.estado =
                estado;

    }



    public List<Habilidad> getHabilidades() {

        return habilidades;

    }


}