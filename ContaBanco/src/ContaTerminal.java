import java.util.Scanner;
import java.util.Random;
public class ContaTerminal {
	public static void main(String[] args) {
		// instancia a classe Scanner e atribui a "s"
		Scanner s = new Scanner(System.in);
		// instancia a classe Random e atribui a "random"
		Random random = new Random();
		
		int Numero = random.nextInt(9000)+ 1000;
		String Agencia;
		String NomeCliente;
		double Saldo;
		
		//Solicita os dados do proprietário da conta	
		   System.out.println("Por favor, digite o número da Agência:");
		   Agencia = s.next();
		   
		   
		   System.out.println("Por favor digite seu nome");
		   NomeCliente = s.next();
		   
		   System.out.println("Digite o valor que deseja depositar");
		   Saldo = s.nextInt();


		 System.out.printf("Olá %s,obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu"
		 		+ " saldo R$ %.2f já está disponível para saque.", NomeCliente, Agencia, Numero, Saldo);
		
	}
}
