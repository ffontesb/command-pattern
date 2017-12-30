package br.com.ibm.command.concretas;

import br.com.ibm.command.interfaces.Command;
import br.com.ibm.command.interfaces.DispositivoEletronico;

public class DesligarTv implements Command {

DispositivoEletronico oDispositivo;
	
	public DesligarTv(DispositivoEletronico novoDispositivo) {
		oDispositivo = novoDispositivo;
	}

	@Override
	public void executar() {
		oDispositivo.desligar();
		
	}

	@Override
	public void desfazerExecutar() {
		oDispositivo.ligar();
		
	}

}
