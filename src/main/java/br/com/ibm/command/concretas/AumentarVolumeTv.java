package br.com.ibm.command.concretas;

import br.com.ibm.command.interfaces.Command;
import br.com.ibm.command.interfaces.DispositivoEletronico;

public class AumentarVolumeTv implements Command {
	
	DispositivoEletronico oDispositivo;

	public AumentarVolumeTv(DispositivoEletronico novoDispositivo) {
		oDispositivo = novoDispositivo;
	}

	@Override
	public void executar() {
		oDispositivo.aumentarVolume();
		
	}

	@Override
	public void desfazerExecutar() {
		oDispositivo.diminuirVolume();
		
	}

}
