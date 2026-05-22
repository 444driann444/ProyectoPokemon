package ClasesPokemon;

public class Combate {

	   private Entrenador entrenador1;
	    private Entrenador entrenador2;
	    private int turnoActual; // 1 o 2
	    private String ganador;

	    // Constructor de la clase Combate.java
	    
	    public Combate(Entrenador entrenador1, Entrenador entrenador2) {
	        this.entrenador1 = entrenador1;
	        this.entrenador2 = entrenador2;
	        this.turnoActual = 1; // Comienza atacando el jugador 1
	        this.ganador = null;
	    }
	    
	    
	    public void realizarTurnoAtaque(Pokemon pokemon) {
	    	
	    	if(pokemon.getEstado() == Estado.DEBILITADO) {
	    		System.out.println("Este pokemon está debilitado");
	    	}
	    	
	    }
	    
	    // Calcula el daño teniendo en cuenta la compatibilidad de tipos
	    
	    public int calcularDanioTurno (Habilidad movimiento, Pokemon pokemonRecibe) {
	    	
	    	int potenciaAtaque = movimiento.getPotencia();
	    	int defensaPokemon = pokemonRecibe.getDefensa();
	    	int multiplicadorDanio = (int) multiDanioPorTipos(movimiento.getTipo(), pokemonRecibe.getTipo());
	    	
	    	int danioCausado = (potenciaAtaque*multiplicadorDanio) - (defensaPokemon/2);
	    	
	    	if (danioCausado <= 0)
	    		danioCausado = 1;
	    	
	    	return danioCausado;
	    }
	    
	    
	    public boolean detectarDebilitado(Pokemon pokemon) {
	    	
	    	if (pokemon.getVidaActual() == 0) {
	    		return true;
	    	} else {
	    		return false;
	    	}
	    	
	    }
	    
	    public double multiDanioPorTipos(Tipo movimiento, Tipo pokemonRecibe) {
	    	
	    	double multiplicadorDaño = TablaTipos.getMultiplicador(movimiento, pokemonRecibe);
	    	return multiplicadorDaño;
	    }
	    
	    public boolean detectarFinalCombate(Entrenador entrenador) {
	    	
	    	for(Pokemon pokemon : entrenador.getEquipo()) {
	    		if(!detectarDebilitado(pokemon)) {
	    			return false;
	    		}
	    	}
	    	return true;
	    }
	    
	    public void determinarGanador() {
	    	
	    	if (detectarFinalCombate(entrenador1)) {
	    		ganador = entrenador2.getNombre();
	    	} else if (detectarFinalCombate(entrenador2)) {
	    		ganador = entrenador1.getNombre();
	    	} else {
	    		ganador = null;
	    	}
	    	
	    }
	    

	    // Getters y setters de la información de  la clase Combate.java
	    
	    public Entrenador getEntrenador1() {
	    	return entrenador1;
	    	}
	    
	    public void setEntrenador1(Entrenador entrenador1) {
	    	this.entrenador1 = entrenador1;
	    	}

	    public Entrenador getEntrenador2() {
	    	return entrenador2;
	    	}
	    
	    public void setEntrenador2(Entrenador entrenador2) {
	    	this.entrenador2 = entrenador2;
	    	}

	    public int getTurnoActual() {
	    	return turnoActual;
	    	}
	    
	    public void setTurnoActual(int turnoActual) {
	    	this.turnoActual = turnoActual;
	    	}

	    public String getGanador() {
	    	return ganador;
	    	}
	    
	    public void setGanador(String ganador) {
	    	this.ganador = ganador;
	    	}
}
