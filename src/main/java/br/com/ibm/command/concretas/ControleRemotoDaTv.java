package br.com.ibm.command.concretas;

import br.com.ibm.command.interfaces.DispositivoEletronico;

public class ControleRemotoDaTv {
	
	public static DispositivoEletronico getDispositivo(){
		return new Televisao();
	}

}
