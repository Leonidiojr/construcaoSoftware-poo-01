package leonidio.t01;

/**
 *
 * @author Leonidio Alves de Moraes Junior
 */
public class LeonidioT01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Funcionario leonidio = new Funcionario("Leonidio",10000);
        System.out.println(leonidio);
        leonidio.aumentarSalario(10);
        System.out.println(leonidio);
        
        Livro livro = new Livro("As Operações Especiais Policiais Militares do Brasil", "Gerlon Mendes de Souza", 2024);
        System.out.println(livro);
        
        Gerente gerenteMaster = new Gerente("Administração", "Leonidio", 10000);
        
        System.out.println(gerenteMaster);
        
        System.out.println("O funcionario " + leonidio.getNome() +  ", leitor do livro " + livro.getTitulo() + " (do autor " + livro.getAutor() + "), recebeu um aumento salaria e agora recebe R$ " + leonidio.getSalario());
        
    }
    
}
