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
	    private ArrayList<String> movimientos;

	    // Constructor de la clase Pokemon.java
	    
	    public Pokemon(String nombre, Tipo tipo, int vidaMaxima, int vidaActual, int defensa, Estado estado) {
	        this.nombre = nombre;
	        this.tipo = tipo;
	        this.vidaMaxima = vidaMaxima;
	        this.vidaActual = vidaActual;
	        this.defensa = defensa;
	        this.estado = estado;
	        this.movimientos = new ArrayList<>();
	    }
	    
	    //Cada uno de los Pokemon disponibles con su información
	    
	    Pokemon Raichu = new Pokemon("Raichu", Tipo.ELÉCTRICO , 261, 261, 146, Estado.ACTIVO);
	    Pokemon MegaCharizardX = new Pokemon("Mega Charizard X", Tipo.FUEGO , 297, 297, 258, Estado.ACTIVO);
	    Pokemon MegaVenusaur = new Pokemon("Mega Venusaur", Tipo.PLANTA , 301, 301, 282, Estado.ACTIVO);
	    Pokemon MegaBlastoise = new Pokemon("Mega Blastoise", Tipo.AGUA , 299, 299, 276, Estado.ACTIVO);
	    Pokemon Arceus = new Pokemon("Arceus", Tipo.NORMAL , 381, 381, 276, Estado.ACTIVO);
	    Pokemon MegaGarchomp = new Pokemon("Mega Garchomp", Tipo.DRAGÓN , 357, 357, 266, Estado.ACTIVO);
	    Pokemon Scolipede = new Pokemon("Scolipede", Tipo.BICHO , 261, 261, 214, Estado.ACTIVO);
	    Pokemon MegaGengar = new Pokemon("Mega Gengar", Tipo.FANTASMA , 261, 261, 196, Estado.ACTIVO);
	    Pokemon Clefable = new Pokemon("Clefable", Tipo.HADA , 331, 331, 182, Estado.ACTIVO);
	    Pokemon Crobat = new Pokemon("Crobat", Tipo.VENENO , 311, 311, 196, Estado.ACTIVO);
	    Pokemon Zoroark = new Pokemon("Zoroark", Tipo.SINIESTRO , 261, 261, 156, Estado.ACTIVO);
	    Pokemon MegaMewtwoX = new Pokemon("Mega Mewtwo X", Tipo.PSÍQUICO , 353, 353, 236, Estado.ACTIVO);
	    Pokemon MegaMetagross = new Pokemon("Mega Metagross", Tipo.ACERO , 301, 301, 336, Estado.ACTIVO);
	    Pokemon MegaLucario = new Pokemon("Mega Lucario", Tipo.LUCHA , 281, 281, 212, Estado.ACTIVO);
	    Pokemon MegaGlalie = new Pokemon("Mega Glalie", Tipo.HIELO , 301, 301, 196, Estado.ACTIVO);
	    Pokemon Lycanroc = new Pokemon("Lycanroc", Tipo.ROCA , 291, 291, 166, Estado.ACTIVO);
	    Pokemon Staraptor = new Pokemon("Staraptor", Tipo.VOLADOR , 311, 311, 176, Estado.ACTIVO);
	    Pokemon PrimalGroudon = new Pokemon("Groudon Primigenio", Tipo.TIERRA , 341, 341, 356, Estado.ACTIVO);

	    // Método para añadir movimientos a un pokemon (hasta un máximo de 4)
	    
	    public void agregarMovimiento(Habilidad movimiento) {
	        if (movimientos.size() < 4) {
	            movimientos.add(movimiento.getNombre());
	        }
	    }
	    
	    // Método para reducir el daño teniendo en cuenta la compatibilidad de tipos
	    // También debilita pokemons si el daño causado es mayor a la vida actual
	    
	    public void recibirDano(Habilidad movimiento, Combate turno) {
	    	
	    	int danioCausado = turno.calcularDanioTurno(movimiento, this);
	    	
	    	if (danioCausado == 0) {
	    		System.out.println(this.getNombre() + " es inmune al movimiento " + movimiento.getNombre());	
	    	}
	    	
	    	else if(danioCausado > this.getVidaActual()) {
	    		this.setVidaActual(0);
	    		System.out.println("El ataque ha causado " + danioCausado + " de daño!");
	    		System.out.println(this.getNombre() + " se ha debilitado!");
	    		this.setEstado(estado.DEBILITADO);
	    	}
	    	
	    	else {
	    		this.setVidaActual(this.getVidaActual() - danioCausado);
	    		System.out.println("El ataque ha causado " + danioCausado + " de daño!");
	    	}
	    	
	    }
	    
	    // Método para aumentar la vida la cantidad de putnos que el usuario especifíque
	    
	    public void curarVida(Pokemon pokemonCurado, int vida) {
	    	
	    	pokemonCurado.setVidaActual(pokemonCurado.getVidaActual() + vida);
	    	
	    }
	    
	    public boolean comprobarSiEstaDebilitado() {
	    	
	    	if (getEstado() == Estado.DEBILITADO) {
	    		return true;
	    	} else {
	    		return false;
	    	}
	    	
	    }
	    
	    public void reiniciarEstadoActivo (Pokemon pokemon) {
	    	pokemon.setEstado(Estado.ACTIVO);
	    }
	    
	    

	    // Getters y setters de la información del pokemon
	    
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

	    public int getVidaMaxima() {
	    	return vidaMaxima;
	    	}
	    
	    public void setVidaMaxima(int vidaMaxima) {
	    	this.vidaMaxima = vidaMaxima;
	    	}

	    public int getVidaActual() {
	    	return vidaActual;
	    	}
	    
	    public void setVidaActual(int vidaActual) {
	    	this.vidaActual = vidaActual;
	    	}

	    public int getDefensa() {
	    	return defensa;
	    	}
	    public void setDefensa(int defensa) {
	    	this.defensa = defensa;
	    	}

	    public Estado getEstado() {
	    	return estado;
	    	}
	    
	    public void setEstado(Estado estado) {
	    	this.estado = estado;
	    	}

	    public List<String> getHabilidades() {
	    	return movimientos;
	    	}
}
