
package leonidio.t01;

/**
 *
 * @author Leonidio Alves de Moraes Junior
 */
public class Gerente extends Funcionario{
    
    private String departamento;

    public Gerente(String departamento, String nome, double salario) {
        super(nome, salario);
        this.departamento = departamento;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

   
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{nome="  + super.getNome() + ", salário=" + super.getSalario() + ",departamento=" + this.departamento + '}';
        
    }
    
    
    
}
