package ClasesPokemon;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {
	private String nombre;
	private List<Pokemon> equipo;
	private Pokemon pokemonActivo;
	private char rango; // de 'Z' a 'A'
	private char[] rangos = { 'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I',
			'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A' };
	// Constructor de la clase Entrenador.java

	public Entrenador(String nombre, char rango) {
		this.nombre = nombre;
		this.rango = rango;
		this.equipo = new ArrayList<Pokemon>();
		this.pokemonActivo = null;
	}

	// Método para añadir Pokémon al equipo (máximo 6)

	public void agregarPokemon(Pokemon pokemon) {
		if (equipo.size() < 6) {
			equipo.add(pokemon);
			if (pokemonActivo == null) {
				pokemonActivo = pokemon;
			}
		}
	}

	// Método para cambiar de pokemon activo

	public void cambiarPokemon(Pokemon pokemonActual, Pokemon pokemonCambio) {

		if (pokemonCambio.getEstado() != Estado.DEBILITADO && pokemonActual != pokemonCambio) {

			System.out.println(pokemonActual.getNombre() + " vuelve! Adelante, " + pokemonCambio.getNombre());
			pokemonActivo = pokemonCambio;

		} else if (pokemonCambio.getEstado() == Estado.DEBILITADO) {
			System.out.println(pokemonCambio.getNombre() + " está debilitado, no puede luchar");
		} else if (pokemonActual == pokemonCambio) {
			System.out.println("Ese pokemon ya está en el campo de batalla. Elige otro!");
		}
	}

	public Pokemon devolverPokemon() {

		return pokemonActivo;

	}

	public boolean comprobarEquipo() {

		for (int i = 0; i < equipo.size(); i++) {
			if (!equipo.get(i).comprobarSiEstaDebilitado()) {
				return true;
			}
		}
		return false;
	}

	public int numeroDebilitados() {

		int contadorDebilitados = 0;

		for (int i = 0; i < equipo.size(); i++) {
			if (equipo.get(i).comprobarSiEstaDebilitado()) {
				contadorDebilitados++;
			}
		}

		return contadorDebilitados;
	}

	public void subirRango() {

		int pos = 0;
		
		if (rango == 'A') {
			System.out.println("Ya estás en el rango máximo! Eres el mejor!");
		} else {
			for (int i = 0; i < rangos.length; i++) {
				if (rango == rangos[i]) {
					pos = i;
				}
			}
			pos++;
			rango = rangos[pos];
			System.out.println("Has subido al rango " + rango);
		}

	}
	
	
	public void bajarRango() {

		int pos = 0;
		
		if (rango == 'Z') {
			System.out.println("Ya estás en el rango mínimo! No se puede bajar más!");
		} else {
			for (int i = 0; i < rangos.length; i++) {
				if (rango == rangos[i]) {
					pos = i;
				}
			}
			pos--;
			rango = rangos[pos];
			System.out.println("Has bajado al rango " + rango);
		}

	}

	// Getters y setters de la información del Entrenador

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pokemon> getEquipo() {
		return equipo;
	}

	public Pokemon getPokemonActivo() {
		return pokemonActivo;
	}

	public void setPokemonActivo(Pokemon pokemonActivo) {
		this.pokemonActivo = pokemonActivo;
	}

	public char getRango() {
		return rango;
	}

	public void setRango(char rango) {
		this.rango = rango;
	}
}
