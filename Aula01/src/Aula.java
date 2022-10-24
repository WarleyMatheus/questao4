import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome completo: ");
		String nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		
		System.out.println("Nome: " + nome + " Idade: " + idade);
	}

}
