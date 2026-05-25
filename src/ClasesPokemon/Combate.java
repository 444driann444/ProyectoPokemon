package ClasesPokemon;

public class Combate {

    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private int turnoActual; // 1 o 2
    private String ganador;

    public Combate(Entrenador entrenador1,
                   Entrenador entrenador2) {

        if (entrenador1 == null || entrenador2 == null) {
            throw new IllegalArgumentException(
                    "Los entrenadores no pueden ser null");
        }

        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
        this.turnoActual = 1;
        this.ganador = null;
    }




    public void realizarTurnoAtaque(
            Pokemon atacante,
            Pokemon defensor,
            Habilidad habilidad) {

        if (atacante == null ||
                defensor == null ||
                habilidad == null) {

            throw new IllegalArgumentException();
        }


        if (atacante.getEstado()
                == Estado.DEBILITADO) {

            throw new IllegalArgumentException(
                    "Pokemon debilitado");
        }


        defensor.recibirDano(
                habilidad,
                this
        );


        // cambiar de turno

        if (turnoActual == 1) {
            turnoActual = 2;
        }

        else {
            turnoActual = 1;
        }

    }



    // daño = potencia - defensa
    // daño mínimo = 1

    public int calcularDanioTurno(
            Habilidad habilidad,
            Pokemon defensor) {

        if (habilidad == null ||
                defensor == null) {

            throw new IllegalArgumentException();
        }


        double multiplicador =

                TablaDeTipos.getMultiplicador(

                        habilidad.getTipo(),

                        defensor.getTipo()

                );


        int daño =

                (int)
                        ((habilidad.getPotencia()
                                -
                                defensor.getDefensa())

                                *

                                multiplicador);


        if (daño < 1) {

            daño = 1;

        }


        return daño;

    }



    public boolean detectarDebilitado(
            Pokemon pokemon) {

        if (pokemon == null) {

            throw new IllegalArgumentException();

        }


        return pokemon.getEstado()

                ==

                Estado.DEBILITADO;

    }




    public double multiDanioPorTipos(
            Tipo ataque,
            Tipo defensa) {


        if (ataque == null ||
                defensa == null) {

            throw new IllegalArgumentException();

        }


        return TablaDeTipos
                .getMultiplicador(
                        ataque,
                        defensa);

    }




    public boolean detectarFinalCombate(
            Entrenador entrenador) {


        if (entrenador == null) {

            throw new IllegalArgumentException();

        }


        for (

                Pokemon pokemon

                :

                entrenador.getEquipo()

        ) {

            if (

                    pokemon.getEstado()

                            ==

                            Estado.ACTIVO

            ) {

                return false;

            }

        }


        return true;

    }




    public void determinarGanador() {


        if (

                detectarFinalCombate(
                        entrenador1)

        ) {

            ganador =

                    entrenador2
                            .getNombre();

        }


        else if (

                detectarFinalCombate(
                        entrenador2)

        ) {

            ganador =

                    entrenador1
                            .getNombre();

        }


        else {

            ganador = null;

        }


    }



    // Getters and Setters


    public Entrenador getEntrenador1() {
        return entrenador1;
    }


    public void setEntrenador1(
            Entrenador entrenador1) {

        this.entrenador1 =
                entrenador1;

    }


    public Entrenador getEntrenador2() {

        return entrenador2;

    }


    public void setEntrenador2(
            Entrenador entrenador2) {

        this.entrenador2 =
                entrenador2;

    }


    public int getTurnoActual() {

        return turnoActual;

    }


    public void setTurnoActual(
            int turnoActual) {

        this.turnoActual =
                turnoActual;

    }


    public String getGanador() {

        return ganador;

    }


    public void setGanador(
            String ganador) {

        this.ganador =
                ganador;

    }

}