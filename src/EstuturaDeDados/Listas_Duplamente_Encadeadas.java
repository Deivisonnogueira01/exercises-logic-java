package EstuturaDeDados;

public class Listas_Duplamente_Encadeadas<T> {

	private T conteudo;
	private NoDuplo<T> noProximo;
	private NoDuplo<T> noPrevio;
	
	public NoDuplo(T conteudo) {
		this.conteudo = conteudo
	}
	
}
