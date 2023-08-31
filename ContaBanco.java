
package contabanco;

/**
 * @author CallmeSalvador
 * Obs.: este desafio foi feito com o netbeans que é a IDE que eu uso na faculdade.
 */
public class ContaBanco {
    public static void main(String[] args) {
        
        ContaTerminal novaconta = new ContaTerminal("", "", 0, 0.000);
        novaconta.pegarInformacao();
        novaconta.imprimirInformacao();
    }
    
}