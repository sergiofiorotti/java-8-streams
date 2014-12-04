import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String args[]){
		
		Arma a = new Arma(20, false);
		Arma b = new Arma(12, true);
		Arma c = new Arma(0, false);
		Arma d = new Arma(0, true);
		
		List<Arma> list = Arrays.asList(a, b, c, d);
				
		long silenciador = list.stream()
				.filter(n -> n.temSilenciador())
				.count();
		System.out.println("Quantidade de Armas com Silenciador: " + silenciador);
		
		
		int municao = list.stream()
			.mapToInt(m -> m.getMunicao())
			.sum();
		System.out.println("Quantidade Total de Balas: " + municao);
		
		
		List<Arma> lista = list.stream()
				.filter(n -> n.temMunicao() == false)
				.collect(Collectors.toList());
		
		lista.forEach(n -> System.out.println("Arma: Munição: " + n.getMunicao() + 
													" Silenciador: " + n.temSilenciador()));
	}
}
