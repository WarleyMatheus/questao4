package defaultPack;

import java.util.Scanner;

public class main_class {
	public static void main(String[] args) {
		pessoa p1 = new pessoa("Carlos", 18, 1234567890);
		pessoa p2 = new pessoa();
		
		System.out.println(p2.nome);
		p2.setNome("Juliao da Xibata Nervosa");
		System.out.println(p2.getNome());
		/*Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		p2.setNome = leia.nextLine();
		
		System.out.println(p2.nome);
		
		//p2.setNome("");
		//p2.setIdade(21);
		//p2.setCpf(1987654321);*/
	}
}
