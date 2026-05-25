package ClasesPokemon;

public class Habilidad {

    private String nombre;
    private Tipo tipo;
    private int potencia;



    // CONSTRUCTOR


    public Habilidad(

            String nombre,

            Tipo tipo,

            int potencia

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

                potencia < 0

        ) {

            throw new IllegalArgumentException(
                    "Potencia inválida");

        }



        this.nombre =
                nombre;

        this.tipo =
                tipo;

        this.potencia =
                potencia;

    }






    // Getters y Setters


    public String getNombre() {

        return nombre;

    }



    public void setNombre(
            String nombre) {

        if (

                nombre == null ||

                        nombre.isBlank()

        ) {

            throw new IllegalArgumentException();

        }


        this.nombre =
                nombre;

    }




    public Tipo getTipo() {

        return tipo;

    }



    public void setTipo(
            Tipo tipo) {

        if (

                tipo == null

        ) {

            throw new IllegalArgumentException();

        }


        this.tipo =
                tipo;

    }





    public int getPotencia() {

        return potencia;

    }



    public void setPotencia(
            int potencia) {


        if (

                potencia < 0

        ) {

            throw new IllegalArgumentException();

        }


        this.potencia =
                potencia;

    }

}