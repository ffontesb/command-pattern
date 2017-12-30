package br.com.ibm.command.main;

import br.com.ibm.command.concretas.BotaoDoDispositivo;
import br.com.ibm.command.concretas.ControleRemotoDaTv;
import br.com.ibm.command.concretas.DesligarTv;
import br.com.ibm.command.concretas.LigarTv;
import br.com.ibm.command.interfaces.DispositivoEletronico;

public class UsarOControleRemoto {
	
	public static void main(String[] args) {
		
	
	
	DispositivoEletronico novoDispositivo = ControleRemotoDaTv.getDispositivo();
	
	LigarTv comandoLigar = new LigarTv(novoDispositivo);
	
	BotaoDoDispositivo botaoLigarPressionado = new BotaoDoDispositivo(comandoLigar);
	
	botaoLigarPressionado.pressionar();
	
	DesligarTv comandoDesligar = new DesligarTv(novoDispositivo);
	
	BotaoDoDispositivo comandoDesligarTv = new BotaoDoDispositivo(comandoDesligar);
	
	comandoDesligarTv.pressionar();

	

	}
	
	
}
