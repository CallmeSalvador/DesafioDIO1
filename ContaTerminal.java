package contabanco;
import java.util.Scanner;

public class ContaTerminal {
    public int numero;
    public double saldo;
    public String agencia, nomeCliente;
    public Scanner scanner = new Scanner(System.in);
    
    public void pegarInformacao(){
        System.out.println("Insira o seu nome:");
        nomeCliente = scanner.nextLine();
        System.out.println("Insira o número da agência:");
        agencia = scanner.nextLine();
        System.out.println("Insira o número de indentificação:");
        numero = scanner.nextInt();
        System.out.println("Insira o saldo atual:(com virgula)");
        saldo = scanner.nextDouble();
    }
 
    public void imprimirInformacao(){
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de "+saldo+" já está disponível.");
    }
    
    public ContaTerminal(String nomeCliente, String agencia, int numero, double saldo){
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
}