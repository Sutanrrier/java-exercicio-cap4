package entities;

public class Conta {
	public String titular;
	public int numero, agencia;
	public double saldo;
	public Data data_abertura;
	
	public void sacarDinheiro(double valor) {
		saldo -= valor;
	}
	public void depositarDinheiro(double valor) {
		saldo += valor;
	}
	public double calcularRendimento() {
		return saldo * 0.1;
	}
	public void recuperaDadosParaImpressao() {
		System.out.println("Nome do titular: " + titular);
		System.out.println("Número da Conta: " + numero + " | Agência: " + agencia);
		System.out.println("Saldo na conta: " + saldo);
		System.out.println("Data de abertura: " + data_abertura.formatData());
	}
}
