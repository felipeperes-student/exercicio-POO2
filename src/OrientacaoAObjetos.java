import com.orientacaoobjetos.entity.Escola;
import com.orientacaoobjetos.entity.Professor;

public class OrientacaoAObjetos {
    public static void main(String[] args) throws Exception {

        Professor professor1 = new Professor("Felipe", 19);

        professor1.setEscola("UniAnchieta");
        professor1.setMateria("Engenharia de Software");
        Escola escola = new Escola("EBAC");
        escola.setCnpj("99999999-99");
        escola.setDiretor("Eduardo Marcelo");

        escola.addProfessor("Marcelo");
        escola.addProfessor("Cauã");
        escola.addProfessor("Manoela");

        String[] nomesProfessores = escola.getNomesProfessores();

        for (int i = 0; i < nomesProfessores.length; i++) {
            if(nomesProfessores[i] != null){
                System.out.println(nomesProfessores[i]);
            }
        }











    }
}
