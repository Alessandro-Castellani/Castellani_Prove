/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tryexception;

class Portafoglio {
	
	private int disponibilita = 0;
	
	/**
	 * 
	 * @param value
	 * @return la disponibilità ad operazione avvenuta
	 */
	public int versa(int value) {
		this.disponibilita += value;
		return this.disponibilita;
	}
	
	/**
	 * 
	 * @param value
	 * @return la disponibilità ad operazione avvenuta
	 * 
	 * @throws IllegalArgumentException se la disponibilità è < della richiesta di 
	 * prelievo.
	 * 
	 */
	public int preleva(int value) {
		if (this.disponibilita < value) 
			throw new IllegalArgumentException("Disponiblità: " + this.disponibilita 
					+ " < richiesta prelievo: " + value);
		
		this.disponibilita -= value;
		return this.disponibilita;
	}
	
	public int getDisponibilita() {
		return this.disponibilita;
	}
	
}

public class TestPortafoglio {
    	
	public static void main(String[] args) {
		
		Portafoglio portLucia = new Portafoglio();
		
		portLucia.versa(400);
		portLucia.preleva(600);
		
	}

}