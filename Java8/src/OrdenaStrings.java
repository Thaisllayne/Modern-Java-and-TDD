import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		//palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		
		System.out.println(palavras);

		// foreach muito reduzido:
		// s é o parâmetro (não precisa definir o tipo)
		palavras.forEach(s -> System.out.println(s));
		// mesma coisa:
		palavras.forEach(System.out::println);

	}

}