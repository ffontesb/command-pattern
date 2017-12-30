package br.com.ibm.command.concretas;

import br.com.ibm.command.interfaces.Command;
import br.com.ibm.command.interfaces.DispositivoEletronico;

public class LigarTv implements Command{
	
	DispositivoEletronico oDispositivo;
	
	public LigarTv(DispositivoEletronico novoDispositivo) {
		oDispositivo = novoDispositivo;
	}

	@Override
	public void executar() {
		oDispositivo.ligar();
		
	}

	@Override
	public void desfazerExecutar() {
		oDispositivo.desligar();
		
	}

}
