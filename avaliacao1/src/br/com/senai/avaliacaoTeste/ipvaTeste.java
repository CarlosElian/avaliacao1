package br.com.senai.avaliacaoTeste;

import br.com.senai.avaliacao.*;

public class ipvaTeste {

	public static void main(String[] args) {
		
		System.out.println("_______________________________VEÍCULOS_______________________________\n");
		
		ipva ipva1 = new ipva("Sandero", "LVC-5430", "gás", 55000, 0, 125);
		ipva1.calcularIpva();
		
		System.out.println("Modelo:" + ipva1.getModelo() + " Placa:" + ipva1.getPlaca() + 
				" Combustivel:" + ipva1.getCombustivel() + " Valor do veículo:R$" + ipva1.getValorVeiculo() + 
				"\n Tx. de Licenciamento:R$" + ipva1.getTaxaLicenciamento() + " Valor IPVA:R$" + ipva1.getValorIpva() + ".");
		
		System.out.println("-----------------------------------------------------------------------");
		
		ipva ipva2 = new ipva("Fiesta", "MVC-1212", "flex", 40000, 0, 140);
		ipva2.calcularIpva();
		
		System.out.println("Modelo:" + ipva2.getModelo() + " Placa:" + ipva2.getPlaca() + 
				" Combustivel:" + ipva2.getCombustivel() + " Valor do veículo:R$" + ipva2.getValorVeiculo() + 
				"\n Tx. de Licenciamento:R$" + ipva2.getTaxaLicenciamento() + " Valor IPVA:R$" + ipva2.getValorIpva() + ".");
	
		System.out.println("-----------------------------------------------------------------------");
		
		ipva ipva3 = new ipva("Fox", "KPW-2178", "gasolina", 87000, 0, 210);
		ipva3.calcularIpva();
		
		System.out.println("Modelo:" + ipva3.getModelo() + " Placa:" + ipva3.getPlaca() + 
				" Combustivel:" + ipva3.getCombustivel() + " Valor do veículo:R$" + ipva3.getValorVeiculo() + 
				"\n Tx. de Licenciamento:R$" + ipva3.getTaxaLicenciamento() + " Valor IPVA:R$" + ipva3.getValorIpva() + ".");
	
		System.out.println("______________________________________________________________________");
		
	}

}
