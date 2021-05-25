package Register;
import model.User;
import java.util.Scanner;
public class RegisterUser {
	private User user;
	public void showMenu() {
		
		int option=-1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(option!=3) {
			System.out.println("Você deve selecionar uma operação:");
			System.out.println("1-Cadastrar/Alterar User");
			System.out.println("2-Exibir um User");
			System.out.println("3-Sair");
			System.out.println("Digite o número da opção ");
			option = sc.nextInt();
			filtrarOpcao(option);
		}	
		
	}
	
	private void filtrarOpcao(Integer option) {
		switch (option) {
		case 1:
			registerUser();
			break;
		case 2:
			showUser();
			break;
		}
	}
	
	private void registerUser() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome: ");
		user.setName(sc.nextLine());
		System.out.print("Informe o email: ");
		user.setEmail(sc.nextLine());
		System.out.print("Informe o C.P.F.: ");
		user.setCpf(sc.nextLine());
		
	}
	
	private void showUser() {
		System.out.println("NOME: " + user.getName());
		System.out.println("EMAIL: " + user.getEmail());
		System.out.println("C.P.F.: " + user.getCpf());
	}
	
	public static void main(String[] args) {
		RegisterUser janela = new RegisterUser();
		janela.user = new User();
		janela.showMenu();
		System.exit(0);
	}
	
	
}