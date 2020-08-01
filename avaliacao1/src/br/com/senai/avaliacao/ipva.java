package br.com.senai.avaliacao;

public class ipva extends Veiculo{
	protected double valorIpva;
	protected double taxaLicenciamento;
	
	public ipva(String modelo, String placa, String combustivel, double valorVeiculo, double valorIpva,
			double taxaLicenciamento) {
		super(modelo, placa, combustivel, valorVeiculo);
		this.valorIpva = valorIpva;
		this.taxaLicenciamento = taxaLicenciamento;
	}

	public double getValorIpva() {
		return valorIpva;
	}
	
	public double getTaxaLicenciamento() {
		return taxaLicenciamento;
	}

	public void calcularIpva() {
		if(combustivel == "gás") {
			valorIpva = valorVeiculo * 0.01;
			valorIpva = valorIpva + taxaLicenciamento;
		}else if(combustivel == "flex") {
			valorIpva = valorVeiculo * 0.03;
			valorIpva = valorIpva + taxaLicenciamento;
		}else {
			valorIpva = valorVeiculo * 0.04;
			valorIpva = valorIpva + taxaLicenciamento;
		}
	}
	
}
