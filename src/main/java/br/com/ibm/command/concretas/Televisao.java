package br.com.ibm.command.concretas;

import br.com.ibm.command.interfaces.DispositivoEletronico;

public class Televisao implements DispositivoEletronico{
	private int volume = 0;

	@Override
	public void ligar() {
		System.out.println("TV Ligada");
		
	}

	@Override
	public void desligar() {
		System.out.println("TV desligada");
		
	}

	@Override
	public void aumentarVolume() {
		volume++;
		System.out.println("Volume da TV está em "+volume);
		
	}

	@Override
	public void diminuirVolume() {
		volume--;
		System.out.println("Volume da TV está em "+volume);
		
	}
	
	

}
