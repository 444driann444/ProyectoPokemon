package ClasesPokemon;



public class Habilidad {
    private String nombre;
    private Tipo tipo;
    private int potencia;

    // Constructor de la clase Movimiento.java
    
    public Habilidad(String nombre, Tipo tipo, int potencia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
    }
    
    // Lista de movimientos
    
    Habilidad DobleFilo = new Habilidad("Doble Filo", Tipo.NORMAL, 120);
    Habilidad Lanzallamas = new Habilidad("Lanzallamas", Tipo.FUEGO, 90);
    Habilidad Escaldar = new Habilidad("Escaldar", Tipo.AGUA, 80);
    Habilidad Energibola = new Habilidad("Energibola", Tipo.PLANTA, 90);
    Habilidad PicoTaladro = new Habilidad("Pico Taladro", Tipo.VOLADOR, 90);
    Habilidad BombaLodo = new Habilidad("Bomba Lodo", Tipo.VENENO, 90);
    Habilidad Terremoto = new Habilidad("Terremoto", Tipo.TIERRA, 100);
    Habilidad PulsoUmbrio = new Habilidad("Pulso Umbrío", Tipo.SINIESTRO, 90);
    Habilidad JoyaDeLuz = new Habilidad("Joya de Luz", Tipo.ROCA, 80);
    Habilidad Psíquico = new Habilidad("Psíquico", Tipo.PSÍQUICO, 90);
    Habilidad TajoCruzado = new Habilidad("Tajo Cruzado", Tipo.LUCHA, 100);
    Habilidad RayoHielo = new Habilidad("Rayo Hielo", Tipo.HIELO, 90);
    Habilidad Carantoña = new Habilidad("Carantoña", Tipo.HADA, 90);
    Habilidad BolaSombra = new Habilidad("Bola Sombra", Tipo.FANTASMA, 80);
    Habilidad Trueno = new Habilidad("Trueno", Tipo.ELÉCTRICO, 110);
    Habilidad GarraDragón = new Habilidad("Garra Dragón", Tipo.DRAGÓN, 80);
    Habilidad AlAtaque = new Habilidad("Al Ataque", Tipo.BICHO, 90);
    Habilidad Cabezahierro = new Habilidad("Cabeza de Hierro", Tipo.ACERO, 80);
    

    
    public String getNombre() {
    	return nombre;
    	}
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    	}

    public Tipo getTipo() {
    	return tipo;
    	}
    
    public void setTipo(Tipo tipo) {
    	this.tipo = tipo;
    	}

    public int getPotencia() {
    	return potencia;
    	}
    
    public void setPotencia(int potencia) {
    	this.potencia = potencia;
    	}
}
