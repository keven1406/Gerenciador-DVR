public class DVR {  						
	//Atributos							
	private String nome, serial, modelo, armazenamento;
	private int porta, quantidadeCamera, quantidadeVaga;
	
	//Métodos
	public DVR (String nome, String serial, String modelo, int porta; String armazenamento, int quantidade, int quantidadeVaga) {
		this.nome = nome;
		this.serial = serial;
		this.modelo = modelo;
		this.armazenamento = armazenamento;
		this.quantidade = quantidade;
		this.quantidadeVaga = quantidadeVaga;
	}
	//Métodos GET e SET
	public void alterarNome (String nome) {
		this.nome = nome;
	}
	public String retornarNome () {
		return nome;
	}
	public void alterarSerial (String serial) {
		this.serial = serial;
	}
	public String retornarSerial () {
		return serial;
	}
	public void alterarPorta (int porta) {
		this.porta = porta;
	}
	public int retornarPorta () {
		return porta;
	}
	public void alterarModelo (String modelo) {
		this.modelo = modelo;
	}
	public String retornarModelo () {
		return modelo;
	}
	public void alterarArmazenamento (String armazenamento) {
		this.armazenamento = armazenamento;
	}
	public String retornarArmazenmento () {
		return armazenamento;
	}
	public void alterarQuantidadeCamera (int quantidadeCamera) {
		this.quantidade = quantidade;
	}
	public int retornarQuantidadeCamera() {
		return quantidade;
	}
	public void alterarQuantidadeVaga (int quantidadeVaga) {
		this.quantidadeVaga = quantidadeVaga;
	}
	public int retornarQuantidadeVaga () {
		return quantidadeVaga;
	}
}
