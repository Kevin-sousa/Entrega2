package model;

public abstract class Veiculo {
	protected String marca;
	protected String modelo;
	protected String renavam;
	protected float anoFabricacao;
	protected float anoModelo;
	protected String placa;
	protected float capacidadeTanque;
	protected float valorDiaria;
    protected float valorDiariaEmpresarial;
    protected float valorMensal;
	

	public Veiculo(String marca, String modelo, String renavam, String placa, float anoFabricacao, float anoModelo,
	           float capacidadeTanque, float valorDiaria, float valorDiariaEmpresarial,
	           float valorMensal) {
		this.marca = marca;
		this.modelo = modelo;
		this.renavam = renavam;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.capacidadeTanque = capacidadeTanque;
		this.valorDiaria = valorDiaria;
		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getRenavam() {
		return renavam;
	}


	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}


	public float getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(float anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public float getAnoModelo() {
		return anoModelo;
	}


	public void setAnoModelo(float anoModelo) {
		this.anoModelo = anoModelo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}


	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}


	public float getValorDiaria() {
		return valorDiaria;
	}


	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}


	public float getValorDiariaEmpresarial() {
		return valorDiariaEmpresarial;
	}


	public void setValorDiariaEmpresarial(float valorDiariaEmpresarial) {
		this.valorDiariaEmpresarial = valorDiariaEmpresarial;
	}


	public float getValorMensal() {
		return valorMensal;
	}


	public void setValorMensal(float valorMensal) {
		this.valorMensal = valorMensal;
	}

}	