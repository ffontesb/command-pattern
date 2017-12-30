package br.com.ibm.command.concretas;

import br.com.ibm.command.interfaces.Command;

public class BotaoDoDispositivo {
	
	Command oComando;
	
	public BotaoDoDispositivo(Command novoComando) {
		oComando = novoComando;
	}
	
	public void pressionar(){
		oComando.executar();
	}
	
	public void desPressionar(){
		oComando.desfazerExecutar();
	}

}
