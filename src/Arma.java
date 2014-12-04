
public class Arma {
	
	public Arma(int municao, boolean silenciador){
		this.municao = municao;
		this.silenciador = silenciador;
	}
	
	private int municao;
	
	private boolean silenciador;
	
	public int getMunicao(){
		return municao;
	}
	
	public boolean temSilenciador(){
		return silenciador;
	}
	
	public boolean temMunicao(){
		return municao > 0;
	}
	
	public void subMunicao(int municao){
		this.municao -= municao;
	}
	
	public void addMunicao(int municao){
		this.municao += municao;
	}
}
