package br.com.ibm.command.concretas;

import br.com.ibm.command.interfaces.Command;
import br.com.ibm.command.interfaces.DispositivoEletronico;

public class DiminuirVolumeTv implements Command {

	DispositivoEletronico oDispositivo;

	public DiminuirVolumeTv(DispositivoEletronico novoDispositivo) {
		oDispositivo = novoDispositivo;
	}

	@Override
	public void executar() {
		oDispositivo.diminuirVolume();
		
	}

	@Override
	public void desfazerExecutar() {
		oDispositivo.aumentarVolume();
		
	}

}
