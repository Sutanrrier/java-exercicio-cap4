package application;

import entities.Conta;
import entities.Data;

public class Banco {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular = "Danilo";
		c1.saldo = 100;
		c1.agencia = 6969;
		
		Data data = new Data();
		data.dia = 15;
		data.mes = 3;
		data.ano = 2022;
		c1.data_abertura = data;
		
		c1.recuperaDadosParaImpressao();
	}

}
