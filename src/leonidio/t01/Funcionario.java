
package leonidio.t01;

/**
 *
 * @author Leonidio Alves de Moraes Junior
 */
public class Funcionario {
   
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salario=" + salario + '}';
    }
    
    
    public void aumentarSalario(double aumento){
        this.salario = salario + (salario * aumento/100);
    }
    
    
    
}
