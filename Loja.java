import java.util.Hashmap;
import java.util.Map;

class Loja {
	//Atributos
	private String nome;
	private long CNPJ;
	private Map<String, List <DVR>> agrupamentoDVR;

	//Métodos
	public Loja (String nome, long CNPJ) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.agrupamentoDVR = new HashMap<String, List<DVR>>();
	}
	
	//Métodos GET E SET
	public void alterarNome (String nome) {}
	public String retornarNome () {}
	public void alterarCNPJ (long CNPJ) {}
	public String retornarCNPJ () {}

	//Adicionar DVR a loja.
	public void inserirDVR (DVR dvr) {
		this.agrupamentoDVR.put(dvr);
		 
	}

	public String mostrarDVRs () {
		System.out.println(this.agrupamentoDVR);
	}

	public void apagarDVR (DVR dvrdfhjkl) {}
	
}
